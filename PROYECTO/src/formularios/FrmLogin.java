
package formularios;

import bd.Conexion;
import entidades.Usuario;
import formularios.FrmInicio;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.security.*;

public class FrmLogin extends javax.swing.JFrame {

    public static int tipo_usuario=0;
    
    
    public FrmLogin() 
    {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        this.jPanel1.setBackground(Color.BLACK);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtPassword = new javax.swing.JPasswordField();
        jbLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, 110, 30));

        jlUsuario.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jlUsuario.setText("INGRESO AL SISTEMA");
        jPanel1.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, 30));

        jtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jtUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 30));

        jtPassword.setBackground(new java.awt.Color(51, 51, 51));
        jtPassword.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtPassword.setForeground(new java.awt.Color(0, 0, 0));
        jtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 30));

        jbLogin.setBackground(new java.awt.Color(0, 0, 0));
        jbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbLogin.setText("INGRESAR");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 154, 110, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 10));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed

        String idusuario = jtUsuario.getText();
        String clave = String.valueOf(jtPassword.getPassword());

        Usuario u = new Usuario(idusuario,clave);
        Conexion c = new Conexion();

        try{
            c.conectar();
            if(c.esUsuarioValido(u))
            {
                if(u.getIdusuario().equals("admin"))
                {
                    tipo_usuario=1;
                }
                FrmInicio frm = new FrmInicio();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, " usuario no existe o se encuentra inactivo", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error");
        }
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordActionPerformed

    private void jtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
    }//GEN-LAST:event_jButton1ActionPerformed

      private void limpiarFormulario(){
        jtPassword.setText(null);
        jtUsuario.setText("");
        
  }   
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
