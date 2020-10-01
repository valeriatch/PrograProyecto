/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.vista;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author vtrejosc
 */
public class VistaAgregarCliente extends javax.swing.JFrame {

    public JTable getTableUsuarios() {
        return tableUsuarios;
    }

    public VistaAgregarCliente() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ApellidoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IDClienteTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AcompannantesTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        AgregarClienteBttn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        VolverRCBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Registro de Clientes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nombre:");

        nombreTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Apellidos: ");

        ApellidoTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ApellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese su número de cédula o pasaporte:");

        IDClienteTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IDClienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDClienteTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("¿Cuántas personas le acompañan?");

        AcompannantesTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "ID Cliente", "Num Acompañantes"
            }
        ));
        tableUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableUsuarios.setEnabled(false);
        jScrollPane1.setViewportView(tableUsuarios);

        AgregarClienteBttn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AgregarClienteBttn.setText("Agregar Cliente");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfildeusuario.jpg"))); // NOI18N

        VolverRCBttn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        VolverRCBttn.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverRCBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(AcompannantesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addComponent(IDClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarClienteBttn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VolverRCBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IDClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AcompannantesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarClienteBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDClienteTxtActionPerformed

    private void ApellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTxtActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    public JTextField getAcompannantesTxt() {
        return AcompannantesTxt;
    }

    public void setAcompannantesTxt(JTextField AcompannantesTxt) {
        this.AcompannantesTxt = AcompannantesTxt;
    }

    public JButton getAgregarClienteBttn() {
        return AgregarClienteBttn;
    }

    public void setAgregarClienteBttn(JButton AgregarClienteBttn) {
        this.AgregarClienteBttn = AgregarClienteBttn;
    }

    public JTextField getApellidoTxt() {
        return ApellidoTxt;
    }

    public void setApellidoTxt(JTextField ApellidoTxt) {
        this.ApellidoTxt = ApellidoTxt;
    }

    public JButton getVolverRCBttn() {
        return VolverRCBttn;
    }

    public void setVolverRCBttn(JButton VolverRCBttn) {
        this.VolverRCBttn = VolverRCBttn;
    }

    public JTextField getIDClienteTxt() {
        return IDClienteTxt;
    }

    public void setIDClienteTxt(JTextField IDClienteTxt) {
        this.IDClienteTxt = IDClienteTxt;
    }

    public JTextField getNombreTxt() {
        return nombreTxt;
    }

    public void setNombreTxt(JTextField nombreTxt) {
        this.nombreTxt = nombreTxt;
    }
    public void iniciar()    {
        setLocationRelativeTo(null);
        setVisible(true);
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
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcompannantesTxt;
    private javax.swing.JButton AgregarClienteBttn;
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JTextField IDClienteTxt;
    private javax.swing.JButton VolverRCBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration//GEN-END:variables
}
