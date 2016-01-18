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

/**
 *
 * @author lonewolf
 */
public class FrmEditUser extends javax.swing.JFrame {

    /**
     * Creates new form FrmEditUser
     */
    public FrmEditUser() {
        initComponents();
        tfId.setText(FrmMantenimiento.edit_usuario);
        this.getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        //CARGAMOS LOS DATOS ALMACENADOS DEL USUARIO SELECCIONADO
        Statement st1=null;
        ResultSet rs1 = null;
        Conexion c = new Conexion();
        Connection con =null;
        String enlace="";
        enlace = "select password,rol,estado,fecha_registro from javacv.login where usuario = \""+FrmMantenimiento.edit_usuario+"\";";
        try
        {
            System.out.println(enlace);
            con = c.getConnection();
            st1 =  con.createStatement();
            rs1 = st1.executeQuery(enlace);
            rs1.next();
            if(rs1.getString(2).equals("A"))
            {
                cbxRol.setSelectedIndex(0);
            }
            else
            {
                cbxRol.setSelectedIndex(1);
            }
            if(rs1.getString(3).equals("A"))
            {
                cbxEstado.setSelectedIndex(0);
            }
            else
            {
                cbxEstado.setSelectedIndex(1);
            }
            tfFecha.setText(rs1.getString(4));
            
            
            
            
            
            
            
            
            
            
        }
        catch(Exception e)
        {
                System.out.println("Ocurrio un error");
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBId = new javax.swing.JButton();
        jBNombres = new javax.swing.JButton();
        jBEstado_Civil1 = new javax.swing.JButton();
        jBEstado_Civil = new javax.swing.JButton();
        jBDireccion_Actual = new javax.swing.JButton();
        tfFecha = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox();
        cbxRol = new javax.swing.JComboBox();
        tfClave = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBId.setBackground(new java.awt.Color(51, 51, 51));
        jBId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBId.setForeground(new java.awt.Color(0, 153, 153));
        jBId.setText("ID :");
        jBId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIdActionPerformed(evt);
            }
        });

        jBNombres.setBackground(new java.awt.Color(51, 51, 51));
        jBNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBNombres.setForeground(new java.awt.Color(0, 153, 153));
        jBNombres.setText("Clave");
        jBNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNombresActionPerformed(evt);
            }
        });

        jBEstado_Civil1.setBackground(new java.awt.Color(51, 51, 51));
        jBEstado_Civil1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEstado_Civil1.setForeground(new java.awt.Color(0, 153, 153));
        jBEstado_Civil1.setText("Rol");
        jBEstado_Civil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstado_Civil1ActionPerformed(evt);
            }
        });

        jBEstado_Civil.setBackground(new java.awt.Color(51, 51, 51));
        jBEstado_Civil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEstado_Civil.setForeground(new java.awt.Color(0, 153, 153));
        jBEstado_Civil.setText("Estado");

        jBDireccion_Actual.setBackground(new java.awt.Color(51, 51, 51));
        jBDireccion_Actual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBDireccion_Actual.setForeground(new java.awt.Color(0, 153, 153));
        jBDireccion_Actual.setText("Fecha_registro");

        tfFecha.setBackground(new java.awt.Color(51, 51, 51));
        tfFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFecha.setForeground(new java.awt.Color(0, 153, 153));
        tfFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFechaKeyTyped(evt);
            }
        });

        cbxEstado.setBackground(new java.awt.Color(51, 51, 51));
        cbxEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxEstado.setForeground(new java.awt.Color(0, 153, 153));
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        cbxRol.setBackground(new java.awt.Color(51, 51, 51));
        cbxRol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxRol.setForeground(new java.awt.Color(0, 153, 153));
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));
        cbxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolActionPerformed(evt);
            }
        });

        tfClave.setBackground(new java.awt.Color(51, 51, 51));
        tfClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfClave.setForeground(new java.awt.Color(0, 153, 153));
        tfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveActionPerformed(evt);
            }
        });
        tfClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfClaveKeyTyped(evt);
            }
        });

        tfId.setBackground(new java.awt.Color(51, 51, 51));
        tfId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfId.setForeground(new java.awt.Color(0, 153, 153));
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Back.png"))); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBIngresar.setBackground(new java.awt.Color(51, 51, 51));
        jBIngresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBIngresar.setForeground(new java.awt.Color(0, 153, 153));
        jBIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Forward.png"))); // NOI18N
        jBIngresar.setText("GUARDAR");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEstado_Civil1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEstado_Civil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBDireccion_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfId))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClave))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEstado_Civil1)
                    .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEstado_Civil)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDireccion_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIdActionPerformed

    private void jBNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNombresActionPerformed

    private void jBEstado_Civil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstado_Civil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEstado_Civil1ActionPerformed

    private void tfFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaKeyTyped

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed

    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void cbxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRolActionPerformed

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveActionPerformed

    private void tfClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClaveKeyTyped

    }//GEN-LAST:event_tfClaveKeyTyped

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        //GUARDAMOS LOS DATOS
        Statement st1=null;
        Conexion c = new Conexion();
        Connection con =null;
        String enlace1="";
        String enlace2="";
        String enlace3="";
        enlace1 = "DELETE FROM javacv.login WHERE usuario =  \""+FrmMantenimiento.edit_usuario+"\"";
        enlace2 = "INSERT INTO javacv.login (usuario,password,rol,estado,fecha_registro) VALUES ( \""+tfId.getText()+"\",md5("+tfClave.getText()+"),\""+cbxRol.getSelectedItem().toString()+"\",\""+cbxEstado.getSelectedItem().toString()+"\",\""+tfFecha.getText()+"\" );";
        enlace3= "UPDATE javacv.login SET usuario=\""+tfId.getText()+"\" ,fecha_registro=\""+tfFecha.getText()+"\",rol=\""+cbxRol.getSelectedItem().toString()+"\",estado= \""+ cbxEstado.getSelectedItem().toString()+"\" WHERE usuario = \""+FrmMantenimiento.edit_usuario+"\"; ";
        try
        {
            con = c.getConnection();
            st1 =  con.createStatement();
            if(tfClave.getText().equals(""))
            {
                //EJECUTAMOS EL UPDATE
                st1.executeUpdate(enlace3);
            }
            else
            {
                //ELIMINAMOS EL VIEJO REGISTRO Y CREAMOS UNO NUEVO
                st1.executeUpdate(enlace1);
                st1.executeUpdate(enlace2);
            }
            
            
      
        }
        catch(Exception e)
        {
                System.out.println("Ocurrio un error");
        }
        
        

    }//GEN-LAST:event_jBIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxEstado;
    private javax.swing.JComboBox cbxRol;
    private javax.swing.JButton jBDireccion_Actual;
    private javax.swing.JButton jBEstado_Civil;
    private javax.swing.JButton jBEstado_Civil1;
    private javax.swing.JButton jBId;
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBNombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfFecha;
    public javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables
}
