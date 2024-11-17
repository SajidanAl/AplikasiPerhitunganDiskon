/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
/**
 *
 * @author user
 */
public class DiskonFrame extends javax.swing.JFrame {

    /**
     * Creates new form DiskonFrame
     */
    public DiskonFrame() {
        initComponents();
        sliderDiskon.setMinimum(0); // Diskon minimum
        sliderDiskon.setMaximum(30); // Diskon maksimum
        sliderDiskon.setValue(0); // Nilai awal
        sliderDiskon.setMajorTickSpacing(5); // Interval tanda besar
        sliderDiskon.setPaintTicks(true);
        sliderDiskon.setPaintLabels(true);
        
        sliderDiskon.addChangeListener(e -> {
            int sliderValue = sliderDiskon.getValue();
            cbDiskon.setSelectedItem(sliderValue + "%");
        });

        cbDiskon.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedItem = (String) e.getItem();
                int value = Integer.parseInt(selectedItem.replace("%", ""));
                sliderDiskon.setValue(value);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Diskon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        txtHargaAsli = new javax.swing.JTextField();
        cbDiskon = new javax.swing.JComboBox<>();
        sliderDiskon = new javax.swing.JSlider();
        txtKodeKupon = new javax.swing.JTextField();
        txtHargaAkhir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayat = new javax.swing.JTextArea();
        txtPenghematan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Harga Asli");

        Diskon.setText("Pilih Diskon");

        jLabel3.setText("Kode Kupon");

        jLabel4.setText("Harga Akhir");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        txtHargaAsli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHargaAsliFocusGained(evt);
            }
        });

        cbDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "10", "15", "20", "25", "30" }));
        cbDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiskonActionPerformed(evt);
            }
        });

        txtKodeKupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeKuponActionPerformed(evt);
            }
        });

        txtHargaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaAkhirActionPerformed(evt);
            }
        });

        txtRiwayat.setColumns(20);
        txtRiwayat.setRows(5);
        jScrollPane1.setViewportView(txtRiwayat);

        txtPenghematan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenghematanActionPerformed(evt);
            }
        });

        jLabel5.setText("Penghematan");

        jLabel2.setText("Riwayat Perhitungan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Diskon)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKodeKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbDiskon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHargaAsli, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(191, 191, 191)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHargaAkhir, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPenghematan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(229, 229, 229)))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHargaAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diskon))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnHitung)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenghematan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        cbDiskon.getAccessibleContext().setAccessibleName("");
        cbDiskon.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeKuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKuponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKuponActionPerformed

    private void txtHargaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaAkhirActionPerformed

    private void txtPenghematanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenghematanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPenghematanActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        try {
        // Ambil harga asli
        double hargaAsli = Double.parseDouble(txtHargaAsli.getText());

        // Ambil persentase diskon dari ComboBox
        int persentaseDiskon = Integer.parseInt(cbDiskon.getSelectedItem().toString());

        // Hitung penghematan dan harga akhir
        double penghematan = hargaAsli * persentaseDiskon / 100;
        double hargaAkhir = hargaAsli - penghematan;

        // Periksa kode kupon
        String kodeKupon = txtKodeKupon.getText().trim();
        if (kodeKupon.equalsIgnoreCase("DISKON10")) {  
        }
     
        if (kodeKupon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kode kupon tidak diisi. Diskon tidak akan diterapkan.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            persentaseDiskon = 0;// Atur diskon ke 0 jika kode kupon tidak diisi
            penghematan = 0;// Atur penghematan ke 0 jika kode kupon tidak diisi
            hargaAkhir = hargaAsli;// Atur hargaAkhir ke 0 jika kode kupon tidak diisi
        }
        
        // Tampilkan hasil
        txtPenghematan.setText(String.format("Rp %.2f", penghematan));
        txtHargaAkhir.setText(String.format("Rp %.2f", hargaAkhir));

        // Tambahkan ke riwayat
        txtRiwayat.append(String.format(
            "Harga Asli: Rp %.2f, Diskon: %d%%, Penghematan: Rp %.2f, Harga Akhir: Rp %.2f\n",
            hargaAsli, persentaseDiskon, penghematan, hargaAkhir));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnHitungActionPerformed

    
    private void cbDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiskonActionPerformed

    }//GEN-LAST:event_cbDiskonActionPerformed

    private void txtHargaAsliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHargaAsliFocusGained
        txtHargaAsli.setText("");
        txtKodeKupon.setText("");
        txtPenghematan.setText("");
        txtHargaAkhir.setText("");
    }//GEN-LAST:event_txtHargaAsliFocusGained
    

        
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
            java.util.logging.Logger.getLogger(DiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiskonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Diskon;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cbDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sliderDiskon;
    private javax.swing.JTextField txtHargaAkhir;
    private javax.swing.JTextField txtHargaAsli;
    private javax.swing.JTextField txtKodeKupon;
    private javax.swing.JTextField txtPenghematan;
    private javax.swing.JTextArea txtRiwayat;
    // End of variables declaration//GEN-END:variables


    private static class e {

            private static void getStateChange() {}
        }
        private static class integer {
        }
    }


