/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author gede.astugmail.com
 */
public class TableStockOpname extends javax.swing.JFrame {

    /**
     * Creates new form TableObat
     */
    public TableStockOpname() {
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        daftarObatButton = new javax.swing.JButton();
        daftarTransaksiButton = new javax.swing.JButton();
        daftarStockOpnameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableObat = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medinventory");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 118, 248));

        jPanel2.setBackground(new java.awt.Color(19, 118, 248));

        deleteButton.setBackground(new java.awt.Color(19, 118, 248));
        deleteButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 16)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/decrease.png")))); // NOI18N
        deleteButton.setText("Hapus Stock Opname Obat");
        deleteButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    deleteButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        addButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(19, 118, 248));
        addButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/increase.png")))); // NOI18N
        addButton.setText("Tambah Stock Opname Untuk Obat");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(19, 118, 248));
        refreshButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 16)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/refreshWhite.png")))); // NOI18N
        refreshButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(296, Short.MAX_VALUE)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daftar Stock Obat Opname ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        daftarObatButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        daftarObatButton.setForeground(new java.awt.Color(19, 118, 248));
        daftarObatButton.setText("Daftar Obat-Obatan");
        daftarObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarObatButtonActionPerformed(evt);
            }
        });

        daftarTransaksiButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        daftarTransaksiButton.setForeground(new java.awt.Color(19, 118, 248));
        daftarTransaksiButton.setText("Daftar Riwayat Transaksi");
        daftarTransaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarTransaksiButtonActionPerformed(evt);
            }
        });

        daftarStockOpnameButton.setBackground(new java.awt.Color(19, 118, 248));
        daftarStockOpnameButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        daftarStockOpnameButton.setForeground(new java.awt.Color(255, 255, 255));
        daftarStockOpnameButton.setText("Daftar Stock Opname");
        daftarStockOpnameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarStockOpnameButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 118, 248));
        jLabel1.setText("MedInventory");

        exitButton.setBackground(new java.awt.Color(19, 118, 248));
        exitButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Keluar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(daftarObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(daftarTransaksiButton)
                                .addGap(18, 18, 18)
                                .addComponent(daftarStockOpnameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(daftarTransaksiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(daftarStockOpnameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(daftarObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
        );

        tableObat.setAutoCreateRowSorter(true);
        tableObat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 118, 248)));
        tableObat.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        tableObat.setForeground(new java.awt.Color(19, 118, 248));
        tableObat.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Nama Obat", "ID Obat", "Harga Obat", "Actions"
                }
        ));
        try {
            showData(tableObat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tableObat.setRowHeight(30);
        tableObat.setSelectionBackground(new java.awt.Color(51, 51, 255));

        tableObat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableObatPropertyChange(evt);
            }
        });
        tableObat.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());

    //    tableObat.getColumnModel().getColumn(11).setCellEditor(new ButtonEditor());
        jScrollPane1.setViewportView(tableObat);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableObatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableObatPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tableObatPropertyChange

    private void daftarObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarObatButtonActionPerformed
        TableObat obat = new TableObat();
        obat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftarObatButtonActionPerformed

    private void daftarTransaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarTransaksiButtonActionPerformed
        TableTransaksi transaksi = new TableTransaksi();
        transaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftarTransaksiButtonActionPerformed

    private void daftarStockOpnameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarStockOpnameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarStockOpnameButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin keluar?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            //clear the current  frame
            // Option 1: Dispose of the current frame
            dispose();

            // Option 2: Terminate the Java Virtual Machine (JVM)
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_deleteButtonActionPerformed
        HapusOpname deleteOpname = new HapusOpname();
        deleteOpname.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddOpname addOpname = new AddOpname();
        addOpname.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        try {
            showData(tableObat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TableStockOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableStockOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableStockOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableStockOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableStockOpname().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton daftarObatButton;
    private javax.swing.JButton daftarTransaksiButton;
    private javax.swing.JButton daftarStockOpnameButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton addButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableObat;
    // End of variables declaration//GEN-END:variables
    private void showData(@NotNull JTable tableObat) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        // Use a set to keep track of unique id_obat values
        Set<Integer> uniqueIdObats = new HashSet<>();

        try (Connection conn = dataSource.getConnection()) {
            String querySelect = "SELECT so.*, o.nama_obat, o.no_batch, o.expired, o.harga " +
                    "FROM stok_opname so " +
                    "JOIN obat o ON so.id_obat = o.id";
            try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                try (ResultSet rs = psSelect.executeQuery()) {
                    DefaultTableModel tableModel = (DefaultTableModel) tableObat.getModel();
                    tableModel.setRowCount(0);

                    while (rs.next()) {
                        int id = rs.getInt("id");
                        int id_obat = rs.getInt("id_obat");
                        // Check if id_obat is already present in the set
                        if (!uniqueIdObats.contains(id_obat)) {
                            String nama_obat = rs.getString("nama_obat");
                            int harga = rs.getInt("harga");

                            Object[] row = {id, nama_obat, id_obat, harga, "Lihat Spesifik"};
                            tableModel.addRow(row);
                            ButtonEditor buttonEditor = new ButtonEditor();
                            buttonEditor.setId(id);
                            tableObat.getColumnModel().getColumn(4).setCellEditor(buttonEditor);

                            // Add id_obat to the set
                            uniqueIdObats.add(id_obat);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static String fetchMedNote(String id_obat) {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        String noNota = null;
        String querySelectName = "SELECT no_nota FROM transaksi WHERE id_obat = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement psSelectNote = conn.prepareStatement(querySelectName)) {
            psSelectNote.setString(1, id_obat);

            try (ResultSet rsNoNota = psSelectNote.executeQuery()) {
                if (rsNoNota.next()) {
                    noNota = rsNoNota.getString("no_nota");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return noNota;
    }
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
            setText("Lihat Spesifik");
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return this;
        }
    }

    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private JButton button;
        private String clickedValue;
        private int clickedRow;
        private int id;

        public ButtonEditor() {
            button = new JButton("Lihat Spesifik");
            button.setOpaque(true);
            button.addActionListener(this);
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public Object getCellEditorValue() {
            return clickedValue;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            clickedValue = (value != null) ? value.toString() : "Lihat Spesifik";
            clickedRow = row;

            button.setText(clickedValue);
            return button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Retrieve the ID from the clicked row
            int id = (int) tableObat.getValueAt(clickedRow, 2);

            // Open test frame and pass the ID
            TableStockOpnameDetailed tableStockOpnameDetailed = new TableStockOpnameDetailed(id);
            tableStockOpnameDetailed.setVisible(true);
            // Show or set up the frame as needed
            fireEditingStopped();
        }
    }

}