/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesoop;

/**
 *
 * @author Inside
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tubesoop.LoketOnline;


public class tabelkonten extends javax.swing.JFrame {

    private Connection koneksi;
    
    /**
     * Creates new form tabelkonten
     */
    public tabelkonten(/*String Nama, String ID, String Pesanan, String Biaya*/) {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
        
    }
    
    
private void KoneksiDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
            System.err.println(cnf.getMessage());
        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/loketonline", "root", "");
            System.out.println("Koneksi Database Berhasil");
        } catch (SQLException se) {
            System.out.println("Koneksi Database Gagal : " + se);
        } catch (Exception e) {

        }

    }
    /*String Nama, Alamat, Pesanan, Biaya;

    public tabelkonten(String val1, String val2, String val3, String val4) {
        initComponents();
        this.Nama = val1;
        this.Alamat = val2;
        this.Pesanan = val3;
        this.Biaya = val4;
        
        AddDataToTable();
        TampilData();
    }
    
    void AddDataToTable(){
        
        DefaultTableModel dt = (DefaultTableModel) tblpesanan.getModel();
        
        Vector v = new Vector();
        
        v.add(Nama);
        v.add(Alamat);
        v.add(Pesanan);
        v.add(Biaya);
        
        dt.addRow(v);
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpesanan = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETAIL PESANAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        tblpesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "No.ID", "Pesanan", "Biaya"
            }
        ));
        tblpesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpesanan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 61, -1, 91));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 198, -1, -1));

        jButton2.setText("Hapus");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 198, -1, -1));

        jButton3.setText("Update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 14, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, 10));

        jButton4.setText("Ubah");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jButton5.setText("Proceed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubesoop/tabel.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 550, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoketOnline pm = new LoketOnline();
        pm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin" + "ingin menghapus data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0){
        String sql="DELETE FROM `orderan` WHERE `Nama`='"+jLabel2.getText().trim()+"'";
        try {
            Statement stat = koneksi.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil " + "di Hapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
            stat.close();
            jLabel2.setText("");
            
            TampilData();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2MouseClicked
    }
    private void tblpesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpesananMouseClicked
        int baris = tblpesanan.getSelectedRow();
        if(baris != -1){
            jLabel2.setText(tblpesanan.getValueAt(baris, 0).toString());
            
        }
    }//GEN-LAST:event_tblpesananMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        tabelkonten x=new tabelkonten();
        x.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        String sql="UPDATE FROM `orderan` WHERE `Nama`='"+jLabel2.getText().trim()+"'";
        try {
            Statement stat = koneksi.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil " + "di Hapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
            stat.close();
            jLabel2.setText("");
            
            TampilData();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try{
            int baris = tblpesanan.getSelectedRow();
            if (baris != 1){
               String Nama = (tblpesanan.getValueAt(baris, 0).toString());
               String Alamat = (tblpesanan.getValueAt(baris, 1).toString());
               String Pesanan = (tblpesanan.getValueAt(baris, 2).toString());
               String Biaya = (tblpesanan.getValueAt(baris, 3).toString());
               
               LoketOnline pm = new LoketOnline(Nama, Alamat, Pesanan, Biaya);
               pm.setVisible(true);
               dispose();
            }
            
        }catch (Exception e){
             
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Memproses Pembelian Atas Nama "+jLabel2.getText() + " ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0){
            JOptionPane.showMessageDialog(null, "Data Berhasil " + "Diproses!", "Result", JOptionPane.INFORMATION_MESSAGE );
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel)tblpesanan.getModel()).setRowCount(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void TampilData() {
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("ID");
        model.addColumn("Pembelian");
        model.addColumn("Biaya");
        tblpesanan.setModel(model);

        try {
            Statement stat = koneksi.createStatement();
            ResultSet data = stat.executeQuery("SELECT * FROM orderan");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("Nama"),
                    data.getString("ID"),
                    data.getString("Pembelian"),
                    data.getString("Biaya")
                });
            }

            
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan :" + e);

        }
    }

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
            java.util.logging.Logger.getLogger(tabelkonten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelkonten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelkonten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelkonten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelkonten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblpesanan;
    // End of variables declaration//GEN-END:variables
}
