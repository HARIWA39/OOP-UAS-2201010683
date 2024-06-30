package laundry.manager;

/**
 *
 * @author Hariwa
 * 29/6/2024
 * 
 */

public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        this.setLocationRelativeTo(null);
        labelAdmin.setText("Selamat Datang, "+String.valueOf(adm.nameAdm));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAdmin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Pelanggan = new javax.swing.JMenuItem();
        jMenuItem_Admin = new javax.swing.JMenuItem();
        menuCucian = new javax.swing.JMenu();
        jMenuItem_CucianMasuk = new javax.swing.JMenuItem();
        jMenuItem_Laporan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        labelAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenu1.setText("Data");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem_Pelanggan.setText("Pelanggan");
        jMenuItem_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PelangganActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Pelanggan);

        jMenuItem_Admin.setText("Admin");
        jMenuItem_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AdminActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Admin);

        jMenuBar1.add(jMenu1);

        menuCucian.setText("Transaksi");

        jMenuItem_CucianMasuk.setText("Transaksi Cucian");
        jMenuItem_CucianMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CucianMasukActionPerformed(evt);
            }
        });
        menuCucian.add(jMenuItem_CucianMasuk);

        jMenuItem_Laporan.setText("Laporan Transaksi");
        jMenuItem_Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_LaporanActionPerformed(evt);
            }
        });
        menuCucian.add(jMenuItem_Laporan);

        jMenuBar1.add(menuCucian);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAdmin)
                .addContainerGap(1022, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelAdmin)
                .addContainerGap(556, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem_PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PelangganActionPerformed
        // TODO add your handling code here:
        new Pelanggan().show();
    }//GEN-LAST:event_jMenuItem_PelangganActionPerformed

    private void jMenuItem_CucianMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CucianMasukActionPerformed
        // TODO add your handling code here:
        new CucianMasuk().show();
    }//GEN-LAST:event_jMenuItem_CucianMasukActionPerformed

    private void jMenuItem_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AdminActionPerformed
        // TODO add your handling code here:
        new Admin().show();
    }//GEN-LAST:event_jMenuItem_AdminActionPerformed

    private void jMenuItem_LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_LaporanActionPerformed
        // TODO add your handling code here:
        new LaporanTransaksi().show();
    }//GEN-LAST:event_jMenuItem_LaporanActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Admin;
    private javax.swing.JMenuItem jMenuItem_CucianMasuk;
    private javax.swing.JMenuItem jMenuItem_Laporan;
    private javax.swing.JMenuItem jMenuItem_Pelanggan;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JMenu menuCucian;
    // End of variables declaration//GEN-END:variables
}
