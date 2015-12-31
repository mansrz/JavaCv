
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
       private static final String DATABASE = "base_java";
       private static final String USER = "root";
       private static final String PASSWORD = "";

    void Conexion(){}
    
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
    
    /*
    public boolean modificarCliente(Usuario c)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("UPDATE cliente SET nombres = ?, apellidos = ?, edad = ? WHERE identificacion = ?");                        
            st.setString(1,c.getNombres());
            st.setString(2,c.getApellidos());
            st.setInt(3,c.getEdad());
            st.setString(4,c.getIdentificacion());
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

    public boolean eliminarCliente(Cliente c)
    {
        try
        {
            PreparedStatement st = null;
            st = con.prepareStatement("DELETE FROM cliente WHERE identificacion = ?");            
            st.setString(1,c.getIdentificacion());         
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
    */
    
    public boolean esUsuarioValido(Usuario u)
    {        
        boolean resultado = false;
        ResultSet rs = null;                       
        PreparedStatement st = null;
        try
        {            
            st = con.prepareStatement("SELECT * FROM usuario WHERE idusuario = ? AND clave = md5(?) AND estado = ?");            
            st.setString(1,u.getIdusuario());         
            st.setString(2,u.getClave());
            st.setString(3,"A");
            rs = st.executeQuery();            
            if(rs.next()){
                u.setRol(rs.getString("rol"));
                resultado = true;
            } 
            
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            resultado = false;
        }           
     return resultado; 
    }

//    public boolean ingresarUsuario(Usuario u) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
 
    /** 
     * *ESTE CODIGO ES PROPIEDAD DE WILMER ACOSTA * *
    public boolean acceder(String idusuario, String clave)
    {
        ResultSet rs =null;
        PreparedStatement st = null;
        try
        {
            st = con.prepareStatement("SELECT * FROM usuario WHERE idusuario= ? AND clave = md5(?)");
            st.setString(1,idusuario);
            st.setString(2,clave);
            rs= st.executeQuery();
            if(rs.next()){
                return true;
            }
            rs.close();
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return false;
    }
  */  
}
