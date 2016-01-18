/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

//import archivo.Archivo;
//
//import entidades.Empleado;

import bd.Conexion;
import entidades.Usuario;
import formularios.FrmPrincipal.hora;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Cesar
 */



public class FrmIngresoUsuario extends javax.swing.JFrame implements Printable  {
    
    /**
     * Creates new form FrmIngresoPersona
     */
    public FrmIngresoUsuario() {
        initComponents();
        //ImageIcon imagen = new ImageIcon("Imagenes/user.jpg");
        //imagen = new ImageIcon(imagen.getImage().getScaledInstance(119, 147, Image.SCALE_DEFAULT));
        //jLabel2.setIcon(imagen);
         setLocationRelativeTo(null);
         setTitle ("Registro de Datos Personales");
         setIconImage(new ImageIcon(getClass().getResource("iconos/usuario2.jpg")).getImage());
         ((JPanel)getContentPane()).setOpaque(false);
         //ImageIcon uno=new ImageIcon(this.getClass().getResource("Imagenes/azules.jpg"));
         JLabel Salir= new JLabel();
         //Salir.setIcon(uno);
        getLayeredPane().add(Salir,JLayeredPane.FRAME_CONTENT_LAYER);
       //Salir.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBId = new javax.swing.JButton();
        jBNombres = new javax.swing.JButton();
        jBEstado_Civil = new javax.swing.JButton();
        jBDireccion_Actual = new javax.swing.JButton();
        tfId = new javax.swing.JTextField();
        tfClave = new javax.swing.JTextField();
        tfFecha = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox();
        jBIngresar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlhora = new javax.swing.JLabel();
        jldata = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBEstado_Civil1 = new javax.swing.JButton();
        cbxRol = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBId.setBackground(new java.awt.Color(51, 51, 51));
        jBId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBId.setForeground(new java.awt.Color(0, 153, 153));
        jBId.setText("ID :");
        jBId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIdActionPerformed(evt);
            }
        });
        getContentPane().add(jBId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, 20));

        jBNombres.setBackground(new java.awt.Color(51, 51, 51));
        jBNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBNombres.setForeground(new java.awt.Color(0, 153, 153));
        jBNombres.setText("Clave");
        jBNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNombresActionPerformed(evt);
            }
        });
        getContentPane().add(jBNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 130, 20));

        jBEstado_Civil.setBackground(new java.awt.Color(51, 51, 51));
        jBEstado_Civil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEstado_Civil.setForeground(new java.awt.Color(0, 153, 153));
        jBEstado_Civil.setText("Estado");
        getContentPane().add(jBEstado_Civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, -1));

        jBDireccion_Actual.setBackground(new java.awt.Color(51, 51, 51));
        jBDireccion_Actual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBDireccion_Actual.setForeground(new java.awt.Color(0, 153, 153));
        jBDireccion_Actual.setText("Fecha_registro");
        getContentPane().add(jBDireccion_Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, 20));

        tfId.setBackground(new java.awt.Color(51, 51, 51));
        tfId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfId.setForeground(new java.awt.Color(0, 153, 153));
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 150, 20));

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
        getContentPane().add(tfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, -1));

        tfFecha.setBackground(new java.awt.Color(51, 51, 51));
        tfFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFecha.setForeground(new java.awt.Color(0, 153, 153));
        tfFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFechaKeyTyped(evt);
            }
        });
        getContentPane().add(tfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 150, -1));

        cbxEstado.setBackground(new java.awt.Color(51, 51, 51));
        cbxEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxEstado.setForeground(new java.awt.Color(0, 153, 153));
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 60, -1));

        jBIngresar.setBackground(new java.awt.Color(51, 51, 51));
        jBIngresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBIngresar.setForeground(new java.awt.Color(0, 153, 153));
        jBIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Forward.png"))); // NOI18N
        jBIngresar.setText("REGISTRAR");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, 30));

        jBLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jBLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(0, 153, 153));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Delete.png"))); // NOI18N
        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 160, 30));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 160, 30));

        jlhora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlhora.setForeground(new java.awt.Color(153, 153, 153));
        jlhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 160, 30));

        jldata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jldata.setForeground(new java.awt.Color(153, 153, 153));
        jldata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 0, 10));

        jBEstado_Civil1.setBackground(new java.awt.Color(51, 51, 51));
        jBEstado_Civil1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBEstado_Civil1.setForeground(new java.awt.Color(0, 153, 153));
        jBEstado_Civil1.setText("Rol");
        jBEstado_Civil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstado_Civil1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBEstado_Civil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, -1));

        cbxRol.setBackground(new java.awt.Color(51, 51, 51));
        cbxRol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxRol.setForeground(new java.awt.Color(0, 153, 153));
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "I" }));
        cbxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolActionPerformed(evt);
            }
        });
        getContentPane().add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 60, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Imagenes/user.png"))); // NOI18N
        jLabel2.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, 180));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 500, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
public static boolean valida(String x){
    int suma=0;
    if(x.length()==9){
      System.out.println("Ingrese su cedula de 10 digitos");
      return false;
    }else{
      int a[]=new int [x.length()/2];
      int b[]=new int [(x.length()/2)];
      int c=0;
      int d=1;
      for (int i = 0; i < x.length()/2; i++) {
        a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
        c=c+2;
        if (i < (x.length()/2)-1) {
          b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
          d=d+2;
        }
      }
    
      for (int i = 0; i < a.length; i++) {
        a[i]=a[i]*2;
        if (a[i] >9){
          a[i]=a[i]-9;
        }
        suma=suma+a[i]+b[i];
      } 
      int aux=suma/10;
      int dec=(aux+1)*10;
      if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1))))
        return true;
      else
        if(suma%10==0 && x.charAt(x.length()-1)=='0'){
          return true;
        }else{
          return false;
        }
     
  }
 }





private void limpiarFormulario(){
        tfId.setText( null);
        tfClave.setText("");
        cbxRol.setSelectedItem("") ;
        cbxEstado.setSelectedItem("") ;
        tfFecha.setText("");
  
    }
    
    
    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
  
        if(!(tfId.getText().equals("") || tfClave.getText().equals("") || tfFecha.getText().equals("")))
        {
		
            Statement st1=null;
            //ResultSet rs1 = null;
            String enlace="";
            Conexion c = new Conexion();
            Connection con =null;
            try
            {
                enlace = "INSERT INTO javacv.login (usuario,password,rol,estado,fecha_registro) VALUES ( \""+tfId.getText()+"\",md5("+tfClave.getText()+"),\""+cbxRol.getSelectedItem().toString()+"\",\""+cbxEstado.getSelectedItem().toString()+"\",\""+tfFecha.getText()+"\" );";
                con = c.getConnection();
                st1 =  con.createStatement();
                st1.executeUpdate(enlace);
                st1.close();
            }
            catch(Exception e )
            {
                JOptionPane.showMessageDialog(this, "ERROR AL INGRESAR LA INFORMACION.");
            }
	}
        else
        {
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS DEBEN SER CORRECTOS.");
        }
        
    }//GEN-LAST:event_jBIngresarActionPerformed

        

        
        
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
         limpiarFormulario();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
        
  
    }//GEN-LAST:event_tfIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        //data
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jldata.setText(formato.format(dataSistema));

        //hora
        Timer timer =new Timer(1000 ,new hora());
        timer.start();
     
    }//GEN-LAST:event_formWindowOpened

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
  
        
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveActionPerformed

    private void tfClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClaveKeyTyped

        
        
    }//GEN-LAST:event_tfClaveKeyTyped

    private void tfFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFechaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tfFechaKeyTyped

    
    
    private void jBEstado_Civil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstado_Civil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEstado_Civil1ActionPerformed

    private void cbxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRolActionPerformed

    private void jBNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNombresActionPerformed

    private void jBIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIdActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "CERRANDO VENTANA");
        
    }//GEN-LAST:event_formWindowClosing

    
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException  {
        if (pageIndex == 0)
        {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            this.printAll(graphics);
            return PAGE_EXISTS;
        }
        else
            return NO_SUCH_PAGE;        
    }

    private java.awt.Button button1;

    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxEstado;
    private javax.swing.JComboBox cbxRol;
    private javax.swing.JButton jBDireccion_Actual;
    private javax.swing.JButton jBEstado_Civil;
    private javax.swing.JButton jBEstado_Civil1;
    private javax.swing.JButton jBId;
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBNombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jldata;
    private javax.swing.JLabel jlhora;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfFecha;
    public javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Calendar now = Calendar.getInstance();
jlhora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
}
    }
}


