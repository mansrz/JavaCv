/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import bd.Conexion;
import entidades.Usuario;
import formularios.FrmInicio;
import javax.swing.JOptionPane;

/**
 *
 * @author wilme
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogi
     */
    public FrmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtPassword = new javax.swing.JPasswordField();
        jbLogin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 146));

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 163, -1, -1));

        jlUsuario.setText("Usuario");
        jPanel1.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 43, -1, -1));

        jlContraseña.setText("Password");
        jPanel1.add(jlContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 81, -1, -1));

        jtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 40, 120, -1));

        jtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 78, 120, -1));

        jbLogin.setText("Ingresar");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 163, -1, -1));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordActionPerformed

    private void jtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioActionPerformed

    
    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:
        String idusuario = jtUsuario.getText();
        String clave = String.valueOf(jtPassword.getPassword());
        
        Usuario u = new Usuario(idusuario,clave);
        
        Conexion c = new Conexion();
        try{
            c.conectar();
            if(c.esUsuarioValido(u)){
                JOptionPane.showMessageDialog(this
                    , "Bienvenido al programa", "Welcome"
                    , JOptionPane.INFORMATION_MESSAGE);
                FrmInicio frm = new FrmInicio();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(this
                    , " usuario no existe o se encuentra inactivo", "Error"
                    , JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error");
        }
        
        
    }//GEN-LAST:event_jbLoginActionPerformed
  private void limpiarFormulario(){
        jtPassword.setText(null);
        jtUsuario.setText("");
        
  }   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:       
        limpiarFormulario();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}