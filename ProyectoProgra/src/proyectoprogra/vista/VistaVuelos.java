/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import proyectoprogra.modelo.Aerolinea;

/**
 *
 * @author Jeremy
 */
public class VistaVuelos extends javax.swing.JFrame {

    /**
     * Creates new form VistaVuelos
     */
    public VistaVuelos() {
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
        Volverbtn = new javax.swing.JButton();
        aerolineaL = new javax.swing.JLabel();
        nVueloL = new javax.swing.JLabel();
        salidaL = new javax.swing.JLabel();
        destinoL = new javax.swing.JLabel();
        horaSalidaL = new javax.swing.JLabel();
        horallegadaL = new javax.swing.JLabel();
        creacionL = new javax.swing.JLabel();
        nVuelotxf = new javax.swing.JTextField();
        partidatxf = new javax.swing.JTextField();
        destinotxf = new javax.swing.JTextField();
        horasalidatxf = new javax.swing.JTextField();
        horallegadatxf = new javax.swing.JTextField();
        creaciontxf = new javax.swing.JTextField();
        registrarbtn = new javax.swing.JButton();
        comboBoxAero = new javax.swing.JComboBox<>();
        duracionVueloL = new javax.swing.JLabel();
        duracionVuelotxf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Volverbtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Volverbtn.setText("Volver");

        aerolineaL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        aerolineaL.setText("Ingrese aerolínea");

        nVueloL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nVueloL.setText("N. de vuelo");

        salidaL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        salidaL.setText("Partida");

        destinoL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        destinoL.setText("Destino");

        horaSalidaL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        horaSalidaL.setText("Fecha y hora de salida");

        horallegadaL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        horallegadaL.setText("Fecha y hora de llegada");

        creacionL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        creacionL.setText("Fecha de creacion");

        nVuelotxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        partidatxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        partidatxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidatxfActionPerformed(evt);
            }
        });

        destinotxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        horasalidatxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        horallegadatxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        creaciontxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        creaciontxf.setEnabled(false);

        registrarbtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        registrarbtn.setText("Registrar");

        comboBoxAero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        duracionVueloL.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        duracionVueloL.setText("Duracion vuelo");

        duracionVuelotxf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aerolineaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nVueloL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salidaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(destinoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horaSalidaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horallegadaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(creacionL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(duracionVueloL, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(120, 120, 120)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nVuelotxf)
                                .addComponent(partidatxf)
                                .addComponent(destinotxf)
                                .addComponent(horasalidatxf)
                                .addComponent(horallegadatxf)
                                .addComponent(creaciontxf, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addComponent(comboBoxAero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(duracionVuelotxf)))
                        .addComponent(registrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volverbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxAero)
                    .addComponent(aerolineaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nVueloL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nVuelotxf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partidatxf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salidaL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinoL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinotxf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaSalidaL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasalidatxf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horallegadaL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horallegadatxf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracionVueloL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracionVuelotxf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(creacionL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(creaciontxf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(registrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getVolverbtn() {
        return Volverbtn;
    }

    public void setVolverbtn(JButton Volverbtn) {
        this.Volverbtn = Volverbtn;
    }
    
    public JTextField getCreaciontxf() {
        return creaciontxf;
    }

    public void setCreaciontxf(JTextField creaciontxf) {
        this.creaciontxf = creaciontxf;
    }

    public JTextField getDestinotxf() {
        return destinotxf;
    }

    public void setDestinotxf(JTextField destinotxf) {
        this.destinotxf = destinotxf;
    }

    public JTextField getHorallegadatxf() {
        return horallegadatxf;
    }

    public void setHorallegadatxf(JTextField horallegadatxf) {
        this.horallegadatxf = horallegadatxf;
    }

    public JTextField getHorasalidatxf() {
        return horasalidatxf;
    }

    public void setHorasalidatxf(JTextField horasalidatxf) {
        this.horasalidatxf = horasalidatxf;
    }

    public JTextField getnVuelotxf() {
        return nVuelotxf;
    }

    public void setnVuelotxf(JTextField nVuelotxf) {
        this.nVuelotxf = nVuelotxf;
    }

    public JTextField getPartidatxf() {
        return partidatxf;
    }

    public void setPartidatxf(JTextField partidatxf) {
        this.partidatxf = partidatxf;
    }

    public JButton getRegistrarbtn() {
        return registrarbtn;
    }

    public void setRegistrarbtn(JButton registrarbtn) {
        this.registrarbtn = registrarbtn;
    }

    public JTextField getDuracionVuelotxf() {
        return duracionVuelotxf;
    }

    public void setDuracionVuelotxf(JTextField duracionVuelotxf) {
        this.duracionVuelotxf = duracionVuelotxf;
    }
    
    public void iniciar()
    {
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public JComboBox<String> getComboBoxAero() {
        return comboBoxAero;
    }

    public void setComboBoxAero(JComboBox<String> comboBoxAero) {
        this.comboBoxAero = comboBoxAero;
    }
    
    private void partidatxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidatxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partidatxfActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volverbtn;
    private javax.swing.JLabel aerolineaL;
    private javax.swing.JComboBox<String> comboBoxAero;
    private javax.swing.JLabel creacionL;
    private javax.swing.JTextField creaciontxf;
    private javax.swing.JLabel destinoL;
    private javax.swing.JTextField destinotxf;
    private javax.swing.JLabel duracionVueloL;
    private javax.swing.JTextField duracionVuelotxf;
    private javax.swing.JLabel horaSalidaL;
    private javax.swing.JLabel horallegadaL;
    private javax.swing.JTextField horallegadatxf;
    private javax.swing.JTextField horasalidatxf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nVueloL;
    private javax.swing.JTextField nVuelotxf;
    private javax.swing.JTextField partidatxf;
    private javax.swing.JButton registrarbtn;
    private javax.swing.JLabel salidaL;
    // End of variables declaration//GEN-END:variables

    
}
