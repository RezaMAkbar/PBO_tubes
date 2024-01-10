/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author gede.astugmail.com
 */
public class AddOpnameFromSpesific extends JFrame {

    /**
     * Creates new form AddRiwayatTransaksi
     */
    public AddOpnameFromSpesific(int idObatFromTable) {
        initComponents();
        this.idObatFromTable = idObatFromTable;
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
        jLabel7 = new JLabel();
        totalHargaField = new JTextField();
        stockKeluarField = new JTextField();
        jLabel12 = new JLabel();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        tambahTransaksiButton = new JButton();
        tambahOpnameButton = new JButton();
        addObatButton = new JButton();
        jPanel3 = new JPanel();
        idObatField = new JTextField();
        tempatSimpanField = new JTextField();
        tanggalField = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel6 = new JLabel();
        emptyInputButton = new JButton();
        cancelButton = new JButton();
        saveButton = new JButton();
        keteranganField = new JTextField();
        jLabel9 = new JLabel();
        stockMasukField = new JTextField();
        jLabel10 = new JLabel();
        stockSisaField = new JTextField();
        jLabel13 = new JLabel();
        stockKeluarField = new JTextField();
        searchButton = new JButton();

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

        jLabel7.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new Color(19, 118, 248));
        jLabel7.setText("Total Harga");

        totalHargaField.setText("Total Harga");

        stockKeluarField.setText("Keluar");
        stockKeluarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockKeluarFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new Color(19, 118, 248));
        jLabel12.setText("Keluar");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(19, 118, 248));

        tambahTransaksiButton.setBackground(new Color(19, 118, 248));
        tambahTransaksiButton.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        tambahTransaksiButton.setForeground(new Color(255, 255, 255));
        tambahTransaksiButton.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/transactionWhite.png")))); // NOI18N
        tambahTransaksiButton.setText("Tambah Transaction");
        tambahTransaksiButton.setBorder(new javax.swing.border.LineBorder(new Color(255, 255, 255), 3, true));
        tambahTransaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahTransaksiButtonActionPerformed(evt);
            }
        });

        tambahOpnameButton.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        tambahOpnameButton.setForeground(new Color(19, 118, 248));
        tambahOpnameButton.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/infuse.png")))); // NOI18N
        tambahOpnameButton.setText("Ambil Data Obat Dengan ID: " + idObatFromTable);
        tambahOpnameButton.setBorder(new javax.swing.border.LineBorder(new Color(19, 118, 248), 3, true));
        tambahOpnameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    tambahOpnameButtonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        addObatButton.setBackground(new Color(19, 118, 248));
        addObatButton.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        addObatButton.setForeground(new Color(255, 255, 255));
        addObatButton.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/obatWhite.png")))); // NOI18N
        addObatButton.setText("Tambah Obat");
        addObatButton.setBorder(new javax.swing.border.LineBorder(new Color(255, 255, 255), 3, true));
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
                                .addComponent(addObatButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tambahTransaksiButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tambahOpnameButton, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tambahTransaksiButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tambahOpnameButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addObatButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(255, 255, 255));

        idObatField.setText(String.valueOf(idObatFromTable));
        idObatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idObatFieldActionPerformed(evt);
            }
        });

        tempatSimpanField.setText("Tempat Simpan");
        tempatSimpanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatSimpanFieldActionPerformed(evt);
            }
        });

        tanggalField.setText("Tanggal");
        tanggalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalFieldActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new Color(19, 118, 248));
        jLabel1.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new Color(19, 118, 248));
        jLabel1.setText("ID Obat");

        jLabel2.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(19, 118, 248));
        jLabel2.setText("Tempat Simpan");

        jLabel3.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new Color(19, 118, 248));
        jLabel3.setText("Tanggal");

        jLabel6.setFont(new Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new Color(19, 118, 248));
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/Main/infuse.png"))); // NOI18N
        jLabel6.setText("Tambah Opname");

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
        saveButton.setFont(new Font("Plus Jakarta Sans", 1, 18)); // NOI18N
        saveButton.setForeground(new Color(255, 255, 255));
        saveButton.setText("Simpan");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });


        keteranganField.setText("Keterangan");
        keteranganField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keteranganFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new Color(19, 118, 248));
        jLabel9.setText("Keterangan");

        stockMasukField.setText("Masuk");
        stockMasukField.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reduceStock();
            }
        });

        jLabel10.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new Color(19, 118, 248));
        jLabel10.setText("Masuk & Keluar");

        stockSisaField.setText("Sisa");
        stockSisaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockSisaFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel13.setForeground(new Color(19, 118, 248));
        jLabel13.setText("Sisa");

        stockKeluarField.setText("Keluar");
        stockKeluarField.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reduceStock();
            }
        });

        searchButton.setBackground(new Color(19, 118, 248));
        searchButton.setIcon(new ImageIcon(getClass().getResource("/Main/ic_sharp-search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 200, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(370, 370, 370))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(idObatField, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel13))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(stockMasukField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(stockKeluarField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(stockSisaField)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(emptyInputButton, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(saveButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9, GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tempatSimpanField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                                        .addComponent(keteranganField)
                                                        .addComponent(tanggalField, GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idObatField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tempatSimpanField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tanggalField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(keteranganField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(stockMasukField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stockKeluarField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(stockSisaField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(emptyInputButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(92, Short.MAX_VALUE))
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
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
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

    private void tambahTransaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransactionButtonActionPerformed
        AddTransaction transaction = new AddTransaction();
        transaction.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addTransactionButtonActionPerformed

    private void tambahOpnameButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_addOpnameButtonActionPerformed
        String idNow = String.valueOf(idObatFromTable);
        Connection conn = connection();
        TransaksiData transaksiData = fetchDataForTheIdWithSeparate(conn, idNow);
        ObatData obatData = fetchDataForTheId(conn, idNow);

        if (transaksiData != null) {
            int stockMasuk = transaksiData.getJumlahBarangMasuk();
            int stockKeluar = transaksiData.getJumlahBarangKeluar();
            int stockSisa = stockMasuk - stockKeluar;

            stockMasukField.setText(String.valueOf(stockMasuk));
            stockKeluarField.setText(String.valueOf(stockKeluar));
            stockSisaField.setText(String.valueOf(stockSisa));
        } else {
            stockMasukField.setText("0");
            stockKeluarField.setText("0");
        }

        if (obatData != null) {
            String namaObat = obatData.getNamaObat();
            double hargaObat = obatData.getHarga();

            // Concatenate namaObat and set it to idObatTextField
            idObatField.setText(idNow + " (" + namaObat + ")");

        } else {
            idObatField.setText(idNow + " (Not Found)");
        }


        Timestamp currentTimestamp = new Timestamp(new Date().getTime());

        //format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentTimestamp);

        tanggalField.setText(formattedDate);
    }//GEN-LAST:event_addOpnameButtonActionPerformed

    private void addObatButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AddObat obat = new AddObat();
        obat.setVisible(true);
        this.dispose();
    }

    private void emptyInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyInputButtonActionPerformed
        clearTextFields(this.getContentPane());
    }//GEN-LAST:event_emptyInputButtonActionPerformed

    private void tempatSimpanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaFieldActionPerformed

    private void tanggalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalFieldActionPerformed

    }//GEN-LAST:event_tanggalFieldActionPerformed

    private void idObatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noNotaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noNotaFieldActionPerformed

    private void expiredFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiredFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiredFieldActionPerformed

    private void keteranganFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keteranganFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keteranganFieldActionPerformed

    private void idObatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idObatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idObatComboBoxActionPerformed

    private void stockMasukFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMasukFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMasukFieldActionPerformed

    private void stockKeluarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockKeluarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockKeluarFieldActionPerformed

    private void stockSisaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisaStockFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sisaStockFieldActionPerformed

    private void keluarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluarFieldActionPerformed
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObatButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_addObatButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        PopUpInputIDObat popUpInputIDObat = new PopUpInputIDObat();
        AddTransaction instance = PopUpInputIDObat.addTransactionInstance;
        popUpInputIDObat.setAddTransactionInstance(instance);
        popUpInputIDObat.setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
    }
    public void setIdObat(int selectedId) {
        idObat = String.valueOf(selectedId);
        // System.out.println("setIdObat: " + idObat);

    }

    public String getIdObat() {
        return idObat;
    }
//    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
//        PopUpInputIDObat popUpInputIDObat = new PopUpInputIDObat();
//        AddTransaction instance = PopUpInputIDObat.addTransactionInstance;
//        popUpInputIDObat.setAddTransactionInstance(instance);
//        popUpInputIDObat.setVisible(true);
//    }

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
            java.util.logging.Logger.getLogger(AddOpnameFromSpesific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOpnameFromSpesific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOpnameFromSpesific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOpnameFromSpesific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOpnameFromSpesific(idObatFromTable).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton tambahTransaksiButton;
    private JButton emptyInputButton;
    private JButton cancelButton;
    private JButton tambahOpnameButton;
    private JButton addObatButton;
    private JButton saveButton;
    private JButton searchButton;
    private JFrame jFrame1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JProgressBar jProgressBar1;
    private JTextField idObatField;
    private JTextField stockKeluarField;
    private JTextField stockSisaField;
    // private javax.swing.JTextField stockKeluarField;
    private JTextField tempatSimpanField;
    private JTextField tanggalField;
    private JTextField totalHargaField;
    private JTextField keteranganField;
    private JTextField stockMasukField;
    private String idObat;
    private static int idObatFromTable;
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
    private boolean isAnyTextFieldEmpty() {
        JTextField[] requiredTextFields = {tanggalField, tempatSimpanField, keteranganField, stockMasukField,
                stockKeluarField, stockSisaField, idObatField};

        for (JTextField textField : requiredTextFields) {
            if (textField.getText().trim().isEmpty()) {
                return true; // if one text field is empty
            }
        }
        return false; // if all not empty
    }

    private boolean isIntegerField() {
        JTextField[] requiredIntegerFields = {stockMasukField, stockKeluarField, stockSisaField};

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
    private static List<String> fetchIDs(Connection conn) throws SQLException {
        List<String> id = new ArrayList<>();
        String querySelect = "SELECT id FROM obat";
        try (PreparedStatement psSelect = conn.prepareStatement(querySelect);
             ResultSet rs = psSelect.executeQuery()) {

            while (rs.next()) {
                int id_obat = rs.getInt("id");

                id.add(String.valueOf(id_obat));
            }
        }

        return id;
    }
    private void insertToDB(Connection conn) throws SQLException {
        int selectedId = PopUpInputIDObat.getSelectedId();
        setIdObat(selectedId);

        String id = String.valueOf(idObatFromTable);
        //  int selectedObatId = Integer.parseInt((String) Objects.requireNonNull(idObatComboBox.getSelectedItem()));

        String queryAdd = "INSERT INTO stok_opname (id_obat, tempat_simpan, tanggal_catat, stok_masuk, stok_keluar, sisa_stock, keterangan, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setInt(1, Integer.parseInt(id));
        psAdd.setString(2, tempatSimpanField.getText());
        psAdd.setString(3, tanggalField.getText());
        psAdd.setInt(4, Integer.parseInt(stockMasukField.getText()));
        psAdd.setInt(5, Integer.parseInt(stockKeluarField.getText()));
        psAdd.setInt(6, Integer.parseInt(stockSisaField.getText()));
        psAdd.setString(7, keteranganField.getText());

        psAdd.executeUpdate();

        psAdd.close();
    }
    private TransaksiData fetchDataForTheIdWithSeparate(Connection conn, String idObat) throws SQLException {
        String querySelect = "SELECT tipe_transaksi, jumlah_barang FROM transaksi WHERE id_obat = ? AND MONTH(tanggal) = MONTH(CURDATE())";

        int jumlahBarangMasuk = 0;
        int jumlahBarangKeluar = 0;

        try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
            psSelect.setString(1, idObat);

            try (ResultSet rs = psSelect.executeQuery()) {
                while (rs.next()) {
                    String tipe_transaksi = rs.getString("tipe_transaksi");
                    int jumlah_barang = rs.getInt("jumlah_barang");

                    // Separate and count based on tipe_transaksi
                    if (tipe_transaksi.equalsIgnoreCase("restock")) {
                        // Add to restock count
                        jumlahBarangMasuk += jumlah_barang;
                    } else if (tipe_transaksi.equalsIgnoreCase("penjualan")) {
                        // Add to penjualan count
                        jumlahBarangKeluar += jumlah_barang;
                    }
                }
            }
        }

        return new TransaksiData(jumlahBarangMasuk, jumlahBarangKeluar);
    }

    private ObatData fetchDataForTheId(Connection conn, String idObat) throws SQLException {
        String querySelect = "SELECT nama_obat, harga FROM obat WHERE id = ?";

        try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
            psSelect.setString(1, idObat);

            try (ResultSet rs = psSelect.executeQuery()) {
                while (rs.next()) {
                    String nama_obat = rs.getString("nama_obat");
                    double harga = rs.getDouble("harga");

                    return new ObatData(nama_obat, harga);
                }
            }
        }

        return null;
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Gagal", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccessfulMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }

    private void reduceStock() {
        try {
            int stockMasuk = Integer.parseInt(stockMasukField.getText());
            int stockKeluar = Integer.parseInt(stockKeluarField.getText());

            int stockSisa = stockMasuk - stockKeluar;

            stockSisaField.setText(Integer.toString(stockSisa));
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}