/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import bd.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vr
 */
public class FrmMantenimiento extends javax.swing.JFrame{

    /**
     * Creates new form FrmMantenimientoEmpleado
     */
    Conexion c = new Conexion();
    String enlace;
    //VARIABLES PUBLICAS PARA MODIFICAR LOS DATOS DEL USUARIO
    public static String edit_usuario="";
    public static String edit_pass="";
    public static String edit_rol="";
    public static String edit_estado="";
    public static String edit_clave="";
    
     private String[] getColumnas()
        {
               String columna[] = new String[] {"usuario","rol","estado","fecha_registro"};
               return columna;
        }
       Connection con =null;
       ResultSet rs=null;
       Statement st=null;
    
        public void reload_table()
        {
            DefaultTableModel modeloTabla = new DefaultTableModel(null,getColumnas());
            enlace = "SELECT usuario,rol,estado,fecha_registro FROM javacv.login;";

            try
            {
                //c.conectar();
                con = c.getConnection();
                st =  con.createStatement();
                //System.out.println("Antes del query");

                rs = st.executeQuery(enlace);

                Object datos[]=new Object[4]; 
                //System.out.println("Se ejecuto el query");

                int cont=0;
                //System.out.println(rs.last());
                //rs.next();
                while(rs.next())
                {
                    for(int i=0;i<4;i++)
                    {/*
                        if(rs!=null)
                        {*/
                            datos[i]=rs.getString(i+1);
                        //}

                    }
                    modeloTabla.addRow(datos);
                    //System.out.println(Arrays.toString(datos)+" - "+cont);
                    //rs.next();
                    cont++;
                }

                rs.close();
                st.close();


            }
            catch(Exception e){
                System.out.println("Ocurrio un error");
            }
        tbResultado.setModel(modeloTabla);
        modeloTabla.fireTableDataChanged();
        tbResultado.repaint();

        }
    public FrmMantenimiento() 
    {
        initComponents();
        if(!FrmPrincipal.inittype)
        {
            btnIngresar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            
        }
        
        DefaultTableModel modeloTabla = new DefaultTableModel(null,getColumnas());
        enlace = "SELECT usuario,rol,estado,fecha_registro FROM javacv.login;";
       
        try
        {
            //c.conectar();
            con = c.getConnection();
            st =  con.createStatement();
            System.out.println("Antes del query");
            
            rs = st.executeQuery(enlace);
           
            Object datos[]=new Object[4]; 
            System.out.println("Se ejecuto el query");
            
            int cont=0;
            //System.out.println(rs.last());
            //rs.next();
            while(rs.next())
            {
                for(int i=0;i<4;i++)
                {/*
                    if(rs!=null)
                    {*/
                        datos[i]=rs.getString(i+1);
                    //}
                    
                }
                modeloTabla.addRow(datos);
                System.out.println(Arrays.toString(datos)+" - "+cont);
                //rs.next();
                cont++;
            }
            
            rs.close();
            st.close();
            
            
        }
        catch(Exception e){
            System.out.println("Ocurrio un error");
        }
        setLocationRelativeTo(null);//para centrar la ventana
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //Cargamos los datos en la tabla
        tbResultado.setModel(modeloTabla);
        modeloTabla.fireTableDataChanged();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        btnConsultar = new javax.swing.JButton();
        jspResultado = new javax.swing.JScrollPane();
        tbResultado = new javax.swing.JTable();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btAtras = new javax.swing.JToggleButton();
        jlhora = new javax.swing.JLabel();
        jldata = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        cbTipo.setBackground(new java.awt.Color(51, 51, 51));
        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTipo.setForeground(new java.awt.Color(255, 255, 255));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TODOS", "id_usuario", "rol", "estado", "fecha_registro" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(51, 51, 51));
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setEnabled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tbResultado.setBackground(new java.awt.Color(51, 51, 51));
        tbResultado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tbResultado.setForeground(new java.awt.Color(0, 0, 0));
        tbResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "            id_usuario", "clave", "rol", "estado", "  fecha_registro"
            }
        ));
        tbResultado.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbResultado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbResultadoFocusGained(evt);
            }
        });
        jspResultado.setViewportView(tbResultado);

        btnIngresar.setBackground(new java.awt.Color(51, 51, 51));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(204, 204, 204));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Forward.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 204, 204));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/icon action duplicate select.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btAtras.setBackground(new java.awt.Color(51, 51, 51));
        btAtras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btAtras.setForeground(new java.awt.Color(204, 204, 204));
        btAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Back.png"))); // NOI18N
        btAtras.setSelected(true);
        btAtras.setText("ATRAS");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        jlhora.setBackground(new java.awt.Color(51, 51, 51));
        jlhora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlhora.setForeground(new java.awt.Color(204, 204, 204));
        jlhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlhora.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jldata.setBackground(new java.awt.Color(51, 51, 51));
        jldata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jldata.setForeground(new java.awt.Color(204, 204, 204));
        jldata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jldata.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANTENIMIENTO DE LA INFORMACION");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jldata, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlhora, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar))
                            .addComponent(jspResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jldata, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlhora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        FrmIngresoUsuario frm = new FrmIngresoUsuario ();
        frm.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed


    

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // VARIABLES
        PreparedStatement st1=null;
        ResultSet rs1 = null;
        DefaultTableModel modeloTabla = new DefaultTableModel(null,getColumnas());
        String enlace;
        if(cbTipo.getSelectedItem().equals("id_usuario"))
        {
            enlace = "SELECT usuario,rol,estado,fecha_registro FROM javacv.login where usuario = ? ;";
            try
            {
                con = c.getConnection();
                st1 =  con.prepareStatement(enlace);
                st1.setString(1,jTextField1.getText());
                rs1 = st1.executeQuery();
                Object datos[]=new Object[4]; 
                while(rs1.next())
                {
                    for(int i=0;i<4;i++)
                    {                        
                            datos[i]=rs1.getString(i+1);                        
                    }
                    modeloTabla.addRow(datos);
                    
                    
                }
                rs1.close();
                st1.close();
            }
            catch(Exception e)
            {
                System.out.println("Ocurrio un error");
            }
            
            
        }
        //**********************************************************************
        if(cbTipo.getSelectedItem().equals("rol"))
        {
            enlace = "SELECT usuario,rol,estado,fecha_registro FROM javacv.login where rol = ? ;";
            try
            {
                con = c.getConnection();
                st1 =  con.prepareStatement(enlace);
                st1.setString(1,jTextField1.getText());
                rs1 = st1.executeQuery();
                Object datos[]=new Object[4]; 
                while(rs1.next())
                {
                    for(int i=0;i<4;i++)
                    {                        
                            datos[i]=rs1.getString(i+1);                        
                    }
                    modeloTabla.addRow(datos);
                    
                    
                }
                rs1.close();
                st1.close();
            }
            catch(Exception e)
            {
                System.out.println("Ocurrio un error");
            }
            
            
        }
        //**********************************************************************
        if(cbTipo.getSelectedItem().equals("estado"))
        {
            enlace = "SELECT usuario,rol,estado,fecha_registro FROM javacv.login where estado = ? ;";
            try
            {
                con = c.getConnection();
                st1 =  con.prepareStatement(enlace);
                st1.setString(1,jTextField1.getText());
                rs1 = st1.executeQuery();
                Object datos[]=new Object[4]; 
                while(rs1.next())
                {
                    for(int i=0;i<4;i++)
                    {                        
                            datos[i]=rs1.getString(i+1);                        
                    }
                    modeloTabla.addRow(datos);
                    
                    
                }
                rs1.close();
                st1.close();
            }
            catch(Exception e)
            {
                System.out.println("Ocurrio un error");
            }
            
            
        }
        //**********************************************************************
        if(cbTipo.getSelectedItem().equals("fecha_registro"))
        {
            enlace = "SELECT usuario,rol,estado,fecha_registro FROM javacv.login where fecha_registro = ? ;";
            try
            {
                con = c.getConnection();
                st1 =  con.prepareStatement(enlace);
                st1.setString(1,jTextField1.getText());
                rs1 = st1.executeQuery();
                Object datos[]=new Object[4]; 
                while(rs1.next())
                {
                    for(int i=0;i<4;i++)
                    {                        
                            datos[i]=rs1.getString(i+1);                        
                    }
                    modeloTabla.addRow(datos);
                    
                    
                }
                rs1.close();
                st1.close();
            }
            catch(Exception e)
            {
                System.out.println("Ocurrio un error");
            }
            
            
        }
        //ACTUALIZACION DE LOS DATOS
        
        tbResultado.setModel(modeloTabla);
        modeloTabla.fireTableDataChanged();

        
    }//GEN-LAST:event_btnConsultarActionPerformed

      
        
        
        
        
        
    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        
        //VARIABLES
        //DefaultTableModel modeloTabla = new DefaultTableModel(null,getColumnas());
        
        if(cbTipo.getSelectedItem().equals("TODOS"))
        {
            btnConsultar.setEnabled(false);
            reload_table();
        }
        else
        {
            btnConsultar.setEnabled(true);
        }
        
        //ACTUALIZAMOS LOS DATOS DE LA TABLA
        //tbResultado.setModel(modeloTabla);
        //modeloTabla.fireTableDataChanged();
        reload_table();
        tbResultado.repaint();
        
    }//GEN-LAST:event_cbTipoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int i = tbResultado.getSelectedRow();
        Connection conx =null;
        ResultSet rsx=null;
        PreparedStatement stx=null;
        //EDITAMOS LOS DATOS SELECCIONADOS
        System.out.println("La fila seleccionada es: "+i);
        Conexion cx = new Conexion();
        if(tbResultado.getSelectedRow()>=0)
        {
            //OBTENEMOS LOS DATOS DE LA FILA SELECCIONADA
            
            edit_usuario=(String)tbResultado.getValueAt(i,0);
            edit_rol=(String)tbResultado.getValueAt(i,1);
            edit_estado=(String)tbResultado.getValueAt(i, 2); 
            System.out.println("EL usuario escogido es: "+edit_usuario );
            FrmEditUser edtu = new FrmEditUser();
            edtu.setVisible(true);
        }
        else
        {
            System.out.println("No ingrese a la validacion");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    
    
    
    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //EDITAMOS LOS DATOS SELECCIONADOS
        if(tbResultado.getSelectedRow()!=-1)
        {
            //NECESITAMOS ELIMINIAR LA ENTRADA SELECCIONADA
            
            String usuario="";
            ResultSet rs1 = null;
            Statement st1=null;
            DefaultTableModel modeloTabla = new DefaultTableModel(null,getColumnas());
            DefaultTableModel tm = (DefaultTableModel) tbResultado.getModel(); 
            usuario=String.valueOf(tm.getValueAt(tbResultado.getSelectedRow(),0));
            enlace = "DELETE FROM javacv.login WHERE usuario =  \""+usuario+"\"";
            
            Conexion c = new Conexion();
            Connection con =null;
            try
            {
                
                con = c.getConnection();
                st1 =  con.createStatement();
                st1.executeUpdate(enlace);
                st1.close();
            }
            catch(Exception e )
            {
                JOptionPane.showMessageDialog(this, "ERROR AL INGRESAR LA INFORMACION.");
            }
            reload_table();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"SELECCIONE UNA ENTRADA PRIMERO");
        }
//    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
    //
    dispose();
        

    }//GEN-LAST:event_btAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void tbResultadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbResultadoFocusGained
        // SE ACTIVAN LOS BOTONES
        if(FrmPrincipal.inittype && btnIngresar.isEnabled()== false && btnEditar.isEnabled()== false && btnEliminar.isEnabled()== false)
        {
            btnIngresar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
        
    }//GEN-LAST:event_tbResultadoFocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        reload_table();
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        reload_table();
    }//GEN-LAST:event_formWindowGainedFocus


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAtras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jldata;
    private javax.swing.JLabel jlhora;
    private javax.swing.JScrollPane jspResultado;
    private javax.swing.JTable tbResultado;
    // End of variables declaration//GEN-END:variables




}


