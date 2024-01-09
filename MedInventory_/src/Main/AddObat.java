/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author gede.astugmail.com
 */
public class AddObat extends JFrame {

    /**
     * Creates new form AddRiwayatTransaksi
     */
    public AddObat() {
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

        jFrame1 = new JFrame();
        jProgressBar1 = new JProgressBar();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        addTransactionButton = new JButton();
        addStockOpnameButton = new JButton();
        addObatButton = new JButton();
        jPanel3 = new JPanel();
        // idTextField = new javax.swing.JTextField();
        namaObatTextField = new JTextField();
        expiredTextField = new JTextField();
        stockTextField = new JTextField();
        hargaTextField = new JTextField();
        tanggalMasukTextField = new JTextField();
        noBatchTextField = new JTextField();
        // idLabel = new javax.swing.JLabel();
        namaObatLabel = new JLabel();
        expiredLabel = new JLabel();
        stockLabel = new JLabel();
        hargaLabel = new JLabel();
        tanggalMasukLabel = new JLabel();
        noBatchLabel = new JLabel();
        addObatLabel = new JLabel();
        emptyInputButton = new JButton();
        cancelButton = new JButton();
        saveButton = new JButton();

        GroupLayout jFrame1Layout = new GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(19, 118, 248));

        addTransactionButton.setBackground(new Color(19, 118, 248));
        addTransactionButton.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        addTransactionButton.setForeground(new Color(255, 255, 255));
        addTransactionButton.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/transactionWhite.png")))); // NOI18N
        addTransactionButton.setText("Tambah Transaksi");
        addTransactionButton.setBorder(new javax.swing.border.LineBorder(new Color(255, 255, 255), 3, true));
        addTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransactionButtonActionPerformed(evt);
            }
        });

        addStockOpnameButton.setBackground(new Color(19, 118, 248));
        addStockOpnameButton.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        addStockOpnameButton.setForeground(new Color(255, 255, 255));
        addStockOpnameButton.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/infuseWhite.png")))); // NOI18N
        addStockOpnameButton.setText("Tambah Opname");
        addStockOpnameButton.setBorder(new javax.swing.border.LineBorder(new Color(255, 255, 255), 3, true));
        addStockOpnameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockOpnameButtonActionPerformed(evt);
            }
        });

        addObatButton.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        addObatButton.setForeground(new Color(19, 118, 248));
        addObatButton.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/medic.png")))); // NOI18N
        addObatButton.setText("Ambil Tanggal Sekarang");
        addObatButton.setBorder(new javax.swing.border.LineBorder(new Color(19, 118, 248), 1, true));
        addObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObatButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addObatButton, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addTransactionButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addStockOpnameButton, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(addTransactionButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addStockOpnameButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addObatButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(255, 255, 255));

        //idTextField.setText("Id");

        namaObatTextField.setText("Nama Obat");

        expiredTextField.setText("Tanggal Kadaluarsa");

        stockTextField.setText("Jumlah Stock");

        hargaTextField.setText("Harga");

        tanggalMasukTextField.setText("Tanggal Masuk");

        noBatchTextField.setText("No. Batch");

        // idLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        // idLabel.setForeground(new java.awt.Color(19, 118, 248));
        // idLabel.setText("ID");

        namaObatLabel.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        namaObatLabel.setForeground(new Color(19, 118, 248));
        namaObatLabel.setText("Nama Obat");

        expiredLabel.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        expiredLabel.setForeground(new Color(19, 118, 248));
        expiredLabel.setText("Tanggal Kadaluarsa (YYYY-MM-DD)");

        stockLabel.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        stockLabel.setForeground(new Color(19, 118, 248));
        stockLabel.setText("Jumlah Stock");

        hargaLabel.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        hargaLabel.setForeground(new Color(19, 118, 248));
        hargaLabel.setText("Harga");

        tanggalMasukLabel.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        tanggalMasukLabel.setForeground(new Color(19, 118, 248));
        tanggalMasukLabel.setText("Tanggal Masuk (YYYY-MM-DD)");

        noBatchLabel.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        noBatchLabel.setForeground(new Color(19, 118, 248));
        noBatchLabel.setText("No. Batch");

        addObatLabel.setFont(new Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        addObatLabel.setForeground(new Color(19, 118, 248));
        addObatLabel.setIcon(new ImageIcon(getClass().getResource("/Main/medic.png"))); // NOI18N
        addObatLabel.setText("Tambah Obat");

        emptyInputButton.setFont(new Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        emptyInputButton.setForeground(new Color(19, 118, 248));
        emptyInputButton.setText("Kosongkan Input");
        emptyInputButton.setBorder(new javax.swing.border.LineBorder(new Color(19, 118, 248), 2, true));
        emptyInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyInputButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new Color(19, 118, 248));
        cancelButton.setFont(new Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        cancelButton.setForeground(new Color(255, 255, 255));
        cancelButton.setText("Batal");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new Color(19, 118, 248));
        saveButton.setFont(new Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        saveButton.setForeground(new Color(255, 255, 255));
        saveButton.setText("Simpan");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });


        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addObatLabel)
                                .addGap(320, 320, 320))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(stockLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(stockTextField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(expiredLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(expiredTextField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(namaObatLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(namaObatTextField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
                                        // .addGroup(jPanel3Layout.createSequentialGroup()
                                        //   .addComponent(idLabel)
                                        //   .addGap(18, 18, 18)
                                        // .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(tanggalMasukLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(tanggalMasukTextField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(noBatchLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(noBatchTextField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(hargaLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(hargaTextField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(saveButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(emptyInputButton, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))))))
                                .addGap(218, 218, 218))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(addObatLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                //.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                //.addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                //.addComponent(idLabel))
                                //.addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(namaObatTextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(namaObatLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tanggalMasukTextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tanggalMasukLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(expiredTextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(expiredLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(stockTextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stockLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(noBatchTextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(noBatchLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(hargaTextField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hargaLabel))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(emptyInputButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransactionButtonActionPerformed
        AddTransaction transaction = new AddTransaction();
        transaction.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addTransactionButtonActionPerformed

    private void addStockOpnameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockOpnameButtonActionPerformed
        AddOpname opname = new AddOpname();
        opname.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addStockOpnameButtonActionPerformed

    private void addObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObatButtonActionPerformed
        Timestamp currentTimestamp = new Timestamp(new Date().getTime());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentTimestamp);

        tanggalMasukTextField.setText(formattedDate);
    }//GEN-LAST:event_addObatButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObatButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_addObatButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObatButtonActionPerformed
        try {
            if (isAnyTextFieldEmpty()) {
                showErrorMessage("Mohon isi semua field");
                return;
            }

            if (isIntegerField()) {
                showErrorMessage("Field yang memerlukan angka harus berupa angka/integer");
                return;
            }

            try (Connection conn = connection()) {
                insertToDB(conn);
                showSuccessfulMessage("Data berhasil dimasukan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addObatButtonActionPerformed

    private void emptyInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyInputButtonActionPerformed
        clearTextFields(this.getContentPane());
    }//GEN-LAST:event_emptyInputButtonActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton addTransactionButton;
    private JButton emptyInputButton;
    private JButton cancelButton;
    private JButton addStockOpnameButton;
    private JButton addObatButton;
    private JButton saveButton;
    private JFrame jFrame1;
    //private javax.swing.JLabel idLabel;
    private JLabel namaObatLabel;
    private JLabel expiredLabel;
    private JLabel stockLabel;
    private JLabel hargaLabel;
    private JLabel addObatLabel;
    private JLabel tanggalMasukLabel;
    private JLabel noBatchLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JProgressBar jProgressBar1;
    //private javax.swing.JTextField idTextField;
    private JTextField namaObatTextField;
    private JTextField expiredTextField;
    private JTextField stockTextField;
    private JTextField hargaTextField;
    private JTextField tanggalMasukTextField;
    private JTextField noBatchTextField;
    // End of variables declaration//GEN-END:variables
    private void clearTextFields(Container container) {
        //clear all text field
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            } else if (component instanceof Container) {
                clearTextFields((Container) component);
            }
        }
    }

    private Connection connection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        return dataSource.getConnection();
    }

    private boolean isAnyTextFieldEmpty() {
        JTextField[] requiredTextFields = {tanggalMasukTextField, hargaTextField, stockTextField, noBatchTextField, tanggalMasukTextField,
                expiredTextField};

        for (JTextField textField : requiredTextFields) {
            if (textField.getText().trim().isEmpty()) {
                return true; // if one text field is empty
            }
        }
        return false; // if all not empty
    }

    private boolean isIntegerField() {
        JTextField[] requiredIntegerFields = {stockTextField, hargaTextField};

        for (JTextField textField : requiredIntegerFields) {
            String fieldValue = textField.getText().trim();
            if (fieldValue.isEmpty()) {
                continue; //Skip empty field
            }

            try {
                Integer.parseInt(fieldValue);
            } catch (NumberFormatException e) {
                return true; // if one field is not an int
            }
        }
        return false; // if all requiered fields is int
    }


    private void insertToDB(Connection conn) throws SQLException {
        String queryAdd = "INSERT INTO obat (nama_obat, stock, harga, tanggal_masuk, expired, no_batch, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setString(1, namaObatTextField.getText());
        psAdd.setInt(2, Integer.parseInt(stockTextField.getText()));
        psAdd.setDouble(3, Double.parseDouble(hargaTextField.getText()));
        psAdd.setString(4, tanggalMasukTextField.getText());
        psAdd.setString(5, expiredTextField.getText());
        psAdd.setString(6, noBatchTextField.getText());

        psAdd.executeUpdate();

        psAdd.close();
    }
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Gagal", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccessfulMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }
}
