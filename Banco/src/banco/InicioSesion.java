/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        //escala de imagenes especificas
        this.setLocationRelativeTo(this);
        setImageLabel(fondoV, "C:src\\Imagenes\\Fondo_verde.jpg");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Hotel = new javax.swing.JLabel();
        CinicioSesion = new javax.swing.JLabel();
        Cusuario = new javax.swing.JLabel();
        Ccontrasena = new javax.swing.JLabel();
        usuario_text = new javax.swing.JTextField();
        SeparadorH = new javax.swing.JSeparator();
        SeparadorU = new javax.swing.JSeparator();
        SeparadorC = new javax.swing.JSeparator();
        contrasena_text = new javax.swing.JPasswordField();
        InicioSesionBtm = new javax.swing.JButton();
        fondoV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Hotel.setBackground(new java.awt.Color(255, 204, 204));
        Hotel.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Hotel.setForeground(new java.awt.Color(255, 255, 255));
        Hotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hotel.setText("banco Generico");
        Hotel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        CinicioSesion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        CinicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        CinicioSesion.setText("Iniciar sesion");

        Cusuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cusuario.setForeground(new java.awt.Color(255, 255, 255));
        Cusuario.setText("Usuario");

        Ccontrasena.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Ccontrasena.setForeground(new java.awt.Color(255, 255, 255));
        Ccontrasena.setText("constraseña");

        usuario_text.setBackground(new java.awt.Color(0, 0, 0));
        usuario_text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usuario_text.setForeground(new java.awt.Color(204, 204, 204));
        usuario_text.setBorder(null);
        usuario_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuario_textMousePressed(evt);
            }
        });

        contrasena_text.setBackground(new java.awt.Color(0, 0, 0));
        contrasena_text.setForeground(new java.awt.Color(204, 204, 204));
        contrasena_text.setBorder(null);
        contrasena_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasena_textMousePressed(evt);
            }
        });

        InicioSesionBtm.setBackground(new java.awt.Color(0, 153, 0));
        InicioSesionBtm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        InicioSesionBtm.setForeground(new java.awt.Color(255, 255, 255));
        InicioSesionBtm.setText("iniciar sesión");
        InicioSesionBtm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InicioSesionBtm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InicioSesionBtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioSesionBtmMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InicioSesionBtmMousePressed(evt);
            }
        });
        InicioSesionBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSesionBtmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InicioSesionBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CinicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ccontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuario_text, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addComponent(SeparadorU)
                        .addComponent(SeparadorC)
                        .addComponent(contrasena_text))
                    .addComponent(SeparadorH, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CinicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeparadorU, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Ccontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasena_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeparadorC, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(InicioSesionBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 540, 500));

        fondoV.setForeground(new java.awt.Color(255, 153, 0));
        fondoV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_verde.jpg"))); // NOI18N
        fondoV.setText("jLabel1");
        bg.add(fondoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 270, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario_textMousePressed
        
    }//GEN-LAST:event_usuario_textMousePressed

    private void contrasena_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasena_textMousePressed

    }//GEN-LAST:event_contrasena_textMousePressed

    private void InicioSesionBtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesionBtmMouseClicked
        InicioSesionBtm.setBackground(new Color(255,204,51));
    }//GEN-LAST:event_InicioSesionBtmMouseClicked

    private void InicioSesionBtmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesionBtmMousePressed

    }//GEN-LAST:event_InicioSesionBtmMousePressed

    private void InicioSesionBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSesionBtmActionPerformed
        String Usuario = usuario_text.getText().trim();
        String passwordIngresado = new String(contrasena_text.getPassword()).trim();
        
        String UsuarioC = "Cliente";
        String ConstraseñaC = "cliente123";
        
        String passwordC = new String(contrasena_text.getPassword());
        
        if(usuario_text.getText().equals(UsuarioC) && passwordC.equals(ConstraseñaC)){
            //ingresar la interfaz del lado del cliente
        }
        
        String UsuarioCa1 = "Caja1";
        String ConstraseñaCa1 = "caja123";
        
        String passwordCa1 = new String(contrasena_text.getPassword());
        
        if(passwordIngresado.equals(ConstraseñaCa1) && Usuario.equals(UsuarioCa1)){
            Caja1 C1 = new Caja1();
            C1.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(  this, "usuario o contraseña incorrecto");
            System.out.println("Usuario ingresado: " + usuario_text.getText());
System.out.println("Contraseña ingresada: " + passwordCa1);
        }
        
        String UsuarioCa2 = "Caja2";
        String ConstraseñaCa2 = "caja456";
        
        String passwordCa2 = new String(contrasena_text.getPassword());
        
        if(usuario_text.getText().equals(UsuarioCa2) && passwordCa2.equals(ConstraseñaCa2)){
            Caja2 C2 = new Caja2();
            C2.setVisible(true);
            this.setVisible(false);
        }
        String UsuarioCa3 = "Caja3";
        String ConstraseñaCa3 = "caja789";
        
        String passwordCa3 = new String(contrasena_text.getPassword());
        
        if(usuario_text.getText().equals(UsuarioCa3) && passwordCa3.equals(ConstraseñaCa3)){
            Caja3 C3 = new Caja3();
            C3.setVisible(true);
            this.setVisible(false);
        }
        String UsuarioS = "Caja3";
        String ConstraseñaS = "cliente123";
        
        String passwordS = new String(contrasena_text.getPassword());
        
        if(usuario_text.getText().equals(UsuarioS) && passwordS.equals(ConstraseñaS)){
            //ingresar la interfaz del lado del cliente
        }

    }//GEN-LAST:event_InicioSesionBtmActionPerformed

    private void setImageLabel(JLabel labelname, String root ){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
            labelname.setIcon(icon);
            this.repaint();
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ccontrasena;
    private javax.swing.JLabel CinicioSesion;
    private javax.swing.JLabel Cusuario;
    private javax.swing.JLabel Hotel;
    private javax.swing.JButton InicioSesionBtm;
    private javax.swing.JSeparator SeparadorC;
    private javax.swing.JSeparator SeparadorH;
    private javax.swing.JSeparator SeparadorU;
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField contrasena_text;
    private javax.swing.JLabel fondoV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario_text;
    // End of variables declaration//GEN-END:variables
}
