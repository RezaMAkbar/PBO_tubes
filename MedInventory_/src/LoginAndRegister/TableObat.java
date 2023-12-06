/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginAndRegister;

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
import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author gede.astugmail.com
 */
public class TableObat extends javax.swing.JFrame {

    /**
     * Creates new form TableObat
     */
    public TableObat() {
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
        refresh = new javax.swing.JButton();
        tambahObat = new javax.swing.JButton();
        hapusObat = new javax.swing.JButton();
        daftarObatLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        daftarObat = new javax.swing.JButton();
        daftarRiwayat = new javax.swing.JButton();
        daftarStockOpname = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        tambahObat.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 16)); // NOI18N
        tambahObat.setForeground(new java.awt.Color(19, 118, 248));
        tambahObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegister/increase.png"))); // NOI18N
        tambahObat.setText("Tambah Obat Baru");
        tambahObat.setActionCommand("Tambah Obat Baru");
        tambahObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    tambahObatActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        hapusObat.setBackground(new java.awt.Color(19, 118, 248));
        hapusObat.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 16)); // NOI18N
        hapusObat.setForeground(new java.awt.Color(255, 255, 255));
        hapusObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegister/decrease.png"))); // NOI18N
        hapusObat.setText("Hapus Obat");
        hapusObat.setActionCommand("Hapus Obat");
        hapusObat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        hapusObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    hapusObatActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        refresh.setBackground(new java.awt.Color(19, 118, 248));
        refresh.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegister/refreshWhite.png"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(249, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tambahObat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusObat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tambahObat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(hapusObat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        daftarObatLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 30)); // NOI18N
        daftarObatLabel.setForeground(new java.awt.Color(255, 255, 255));
        daftarObatLabel.setText("Daftar Obat - Obatan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(daftarObatLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(daftarObatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        daftarObat.setBackground(new java.awt.Color(19, 118, 248));
        daftarObat.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        daftarObat.setForeground(new java.awt.Color(255, 255, 255));
        daftarObat.setText("Daftar Obat-Obatan");
        daftarObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarObatActionPerformed(evt);
            }
        });

        daftarRiwayat.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        daftarRiwayat.setForeground(new java.awt.Color(19, 118, 248));
        daftarRiwayat.setText("Daftar Riwayat Transaksi");
        daftarRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarRiwayatActionPerformed(evt);
            }
        });

        daftarStockOpname.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        daftarStockOpname.setForeground(new java.awt.Color(19, 118, 248));
        daftarStockOpname.setText("Daftar Stock Opname");
        daftarStockOpname.setActionCommand("Daftar Stock Opname");
        daftarStockOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarStockOpnameActionPerformed(evt);
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
                                .addComponent(daftarObat, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(daftarRiwayat)
                                .addGap(18, 18, 18)
                                .addComponent(daftarStockOpname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(daftarRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(daftarStockOpname, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(daftarObat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Nama Obat", "Tanggal Kadaluarsa", "Jumlah Stock", "Harga", "Actions"
                }
        ));
        try {
            showDataObat(tableObat);
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
        // Set the cell renderer for the Actions column
        tableObat.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());

        // Set the cell editor for the Actions column
        tableObat.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor());

        jScrollPane1.setViewportView(tableObat);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, Short.MAX_VALUE))
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

    private void tambahObatActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_tambahObatActionPerformed
        AddObatTest addObat = new AddObatTest();
    }//GEN-LAST:event_tambahObatActionPerformed

    private void hapusObatActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_hapusObatActionPerformed
        HapusObat hapusObat1 = new HapusObat();
    }//GEN-LAST:event_hapusObatActionPerformed

    private void tableObatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableObatPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tableObatPropertyChange

    private void daftarObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarObatActionPerformed

    private void daftarRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarRiwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarRiwayatActionPerformed

    private void daftarStockOpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarStockOpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarStockOpnameActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try {
            showDataObat(tableObat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
          //clear the current  frame
            // Option 1: Dispose of the current frame
            dispose();

            // Option 2: Terminate the Java Virtual Machine (JVM)
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed


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
            java.util.logging.Logger.getLogger(TableObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton tambahObat;
    private javax.swing.JButton hapusObat;
    private javax.swing.JButton daftarObat;
    private javax.swing.JButton daftarRiwayat;
    private javax.swing.JButton daftarStockOpname;
    private javax.swing.JButton refresh;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel daftarObatLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableObat;
    // End of variables declaration//GEN-END:variables

    //method and whatnot.
    private static void showDataObat(@NotNull JTable tableObat) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/pbo_tubes?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        try (Connection conn = dataSource.getConnection()) {
            String querySelect = "SELECT * FROM obat";
            try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                try (ResultSet rs = psSelect.executeQuery()) {
                    DefaultTableModel tableModel = (DefaultTableModel) tableObat.getModel();
                    tableModel.setRowCount(0);

                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String nama_obat = rs.getString("nama_obat");
                        int stock = rs.getInt("stock");
                        int harga = rs.getInt("harga");
                        String expired = rs.getString("expired");

                        // Add a new row to the table
                        Object[] row = {id, nama_obat, expired, stock, harga, "Edit Obat"};
                        tableModel.addRow(row);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
            setText("Edit Obat");
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

        public ButtonEditor() {
            button = new JButton("Edit Obat");
            button.setOpaque(true);
            button.addActionListener(this);
        }

        @Override
        public Object getCellEditorValue() {
            return clickedValue;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            clickedValue = (value != null) ? value.toString() : "Edit Obat";
            clickedRow = row;

            button.setText(clickedValue);
            return button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Retrieve the ID from the clicked row
            int id = (int) tableObat.getValueAt(clickedRow, 0);

            // Open test frame and pass the ID
            try {
                editObatTest editFrame = new editObatTest(id);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }


            fireEditingStopped();
        }
    }
}