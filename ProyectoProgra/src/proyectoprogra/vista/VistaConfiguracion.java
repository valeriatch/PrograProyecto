/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author vtrejosc
 */
public class VistaConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form VitsaConfiguracion
     */
    public VistaConfiguracion() {
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

        checkbox = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        IngresarNombre = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        contrasenna = new javax.swing.JPasswordField();
        IngreseContrasenna = new javax.swing.JLabel();
        IngresarContraConfirm = new javax.swing.JLabel();
        confirmContrasenna = new javax.swing.JPasswordField();
        titleUsuario = new javax.swing.JLabel();
        RolUsuario = new javax.swing.JLabel();
        AceptarBttn = new javax.swing.JButton();
        administradorCheck = new javax.swing.JCheckBox();
        PlataformaCheck = new javax.swing.JCheckBox();
        volverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        IngresarNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IngresarNombre.setText("Ingrese el nombre de usuario: ");

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        contrasenna.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        IngreseContrasenna.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IngreseContrasenna.setText("Ingrese una contraseña:");

        IngresarContraConfirm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IngresarContraConfirm.setText("Confirme la contraseña ingresada:");

        confirmContrasenna.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        titleUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleUsuario.setText("Creación de usuario");

        RolUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RolUsuario.setText("Seleccione el rol que desea para este usuario:");

        AceptarBttn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AceptarBttn.setText("Aceptar");
        AceptarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBttnActionPerformed(evt);
            }
        });

        checkbox.add(administradorCheck);
        administradorCheck.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        administradorCheck.setText("Administrador");
        administradorCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorCheckActionPerformed(evt);
            }
        });

        checkbox.add(PlataformaCheck);
        PlataformaCheck.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PlataformaCheck.setText("Plataforma");
        PlataformaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlataformaCheckActionPerformed(evt);
            }
        });

        volverBtn.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IngresarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IngreseContrasenna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contrasenna)
                                    .addComponent(nombreUsuario)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RolUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(IngresarContraConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(confirmContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(administradorCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(PlataformaCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(557, 557, 557)
                        .addComponent(AceptarBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverBtn)
                .addGap(153, 153, 153)
                .addComponent(titleUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(449, 449, 449))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(titleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverBtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(IngresarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(contrasenna, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IngreseContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(IngresarContraConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(confirmContrasenna, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addComponent(RolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(administradorCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AceptarBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlataformaCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarBttnActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void administradorCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_administradorCheckActionPerformed

    private void PlataformaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlataformaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlataformaCheckActionPerformed

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
            java.util.logging.Logger.getLogger(VistaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConfiguracion().setVisible(true);
            }
        });
    }

    public JButton getAceptarBttn() {
        return AceptarBttn;
    }

    public void setAceptarBttn(JButton AceptarBttn) {
        this.AceptarBttn = AceptarBttn;
    }

    public JCheckBox getPlataformaCheck() {
        return PlataformaCheck;
    }

    public void setPlataformaCheck(JCheckBox PlataformaCheck) {
        this.PlataformaCheck = PlataformaCheck;
    }

    public JCheckBox getAdministradorCheck() {
        return administradorCheck;
    }

    public void setAdministradorCheck(JCheckBox administradorCheck) {
        this.administradorCheck = administradorCheck;
    }

    public JPasswordField getConfirmContrasenna() {
        return confirmContrasenna;
    }

    public void setConfirmContrasenna(JPasswordField confirmContrasenna) {
        this.confirmContrasenna = confirmContrasenna;
    }

    public JPasswordField getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(JPasswordField contrasenna) {
        this.contrasenna = contrasenna;
    }

    public JTextField getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(JTextField nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public JButton getVolverBtn() {
        return volverBtn;
    }

    public void setVolverBtn(JButton volverBtn) {
        this.volverBtn = volverBtn;
    }

    public ButtonGroup getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(ButtonGroup checkbox) {
        this.checkbox = checkbox;
    }
    
    public void iniciar()
    {
        setLocationRelativeTo(null);
        setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBttn;
    private javax.swing.JLabel IngresarContraConfirm;
    private javax.swing.JLabel IngresarNombre;
    private javax.swing.JLabel IngreseContrasenna;
    private javax.swing.JCheckBox PlataformaCheck;
    private javax.swing.JLabel RolUsuario;
    private javax.swing.JCheckBox administradorCheck;
    private javax.swing.ButtonGroup checkbox;
    private javax.swing.JPasswordField confirmContrasenna;
    private javax.swing.JPasswordField contrasenna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JLabel titleUsuario;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
