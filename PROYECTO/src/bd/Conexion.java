
package bd;

import entidades.Usuario;
//import entidades.Usuario;
import java.sql.*;
import java.util.ArrayList;

public class Conexion {
    
       private Connection con;
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String DBMS = "mysql";
       private static final String HOST = "127.0.0.1";
       private static final String PORT = "3306";
       private static final String DATABASE = "javacv";
       private static final String USER = "root";
       private static final String PASSWORD = "lonewolf";

    void Conexion(){}
    
    public Connection getConnection(){
        try{
            this.conectar();
        }catch(Exception e){
            
        }
                           
        return con;
    }
    
    /*METODO CONECTAR*/
   
    public void conectar ()throws Exception{
        try {
            Class.forName(DRIVER);
        }catch(ClassNotFoundException ce){
        }
        
            try{
                this.con = DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);                                
                System.out.println("CONEXION EXITOSA CON LA BASE DE DATOS");
            }catch(SQLException exception){
                System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+exception);
            } 
    }
    
    public boolean desconectar()
    {
        try
        {
            this.con.close();
            return(true);
        }
        catch(Exception e)
        {
            return(false);
        }    
    }
    
    public boolean ingresarUsuario(Usuario u)
    {
        try
        {
                PreparedStatement st = null;
                st = con.prepareStatement("INSERT INTO usuario(idusuario,clave,rol,estado,fecha) VALUES(?,?,?,?,?) ");            
                st.setString(1,u.getIdusuario());
                st.setString(2,u.getClave());
                st.setString(3,u.getRol());
                st.setString(4,u.getEstado());
                st.setString(5,u.getFecha());
                st.executeUpdate();
                st.close();                        
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }        
    }
     
    
    
    
    public ArrayList<Usuario> consultarClientes(String descripcion, String tipo)
    {
        ArrayList<Usuario> clientes = new ArrayList<Usuario>();

        try
        {
            Statement st = this.con.createStatement();
            ResultSet rs = null;  
            
            if(tipo.equalsIgnoreCase("TODOS")){
                rs = st.executeQuery("SELECT * FROM cliente;");
            }else if(tipo.equalsIgnoreCase("EDAD")){
                rs = st.executeQuery("SELECT * FROM cliente WHERE edad = "+descripcion+";");
            }else{
                rs = st.executeQuery("SELECT * FROM cliente WHERE "+tipo+" LIKE '%"+descripcion+"%';");
            }            
                        
            while(rs.next())
            {
                String id_usuario   = rs.getString("idusuario");
                String clave       = rs.getString("clave");
                String rol         = rs.getString("rol");
                String estado      = rs.getString("estado");
                Usuario c = new Usuario(id_usuario, clave, rol, estado);                
                clientes.add(c);
            }
        }
        catch(Exception e){System.out.println(e);}
     return(clientes);
    }     
    
    
    
    public boolean esUsuarioValido(Usuario u)
    {        
        boolean resultado = false;
        ResultSet rs = null;                       
        PreparedStatement st = null;
        String enlace;
        enlace = "SELECT * FROM javacv.login WHERE usuario = ? AND password = md5(?);";
        try
        {            
            
            st =  con.prepareStatement(enlace);          
            //System.out.println(u.getIdusuario()+"-"+u.getClave());
            st.setString(1,u.getIdusuario());         
            st.setString(2,u.getClave());
            //st.setString(3,"A");
            rs = st.executeQuery();
            rs.next();
            
            //System.out.println(rs.getRow()+"row");
            if(rs.getRow()!=0)
            {
                if(rs.getString(1).equals(u.getIdusuario())){
                    //u.setRol(rs.getString("usuario"));
                    //System.out.println(u.getIdusuario());
                    //System.out.println("Comparacion exitosa");
                    resultado = true;
                }
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }
        System.out.println(resultado);
        return resultado; 
    }


}
