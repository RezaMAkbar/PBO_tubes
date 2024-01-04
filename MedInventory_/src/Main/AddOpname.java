/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author gede.astugmail.com
 */
public class AddOpname extends javax.swing.JFrame {

    /**
     * Creates new form AddRiwayatTransaksi
     */
    public AddOpname() {
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        totalHargaField = new javax.swing.JTextField();
        stockKeluarField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tambahTransaksiButton = new javax.swing.JButton();
        tambahOpnameButton = new javax.swing.JButton();
        addObatButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        idObatField = new javax.swing.JTextField();
        tempatSimpanField = new javax.swing.JTextField();
        tanggalField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emptyInputButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        keteranganField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stockMasukField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        stockSisaField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        stockKeluarField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

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

        jLabel7.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 118, 248));
        jLabel7.setText("Total Harga");

        totalHargaField.setText("Total Harga");

        stockKeluarField.setText("Keluar");
        stockKeluarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockKeluarFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(19, 118, 248));
        jLabel12.setText("Keluar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(19, 118, 248));

        tambahTransaksiButton.setBackground(new java.awt.Color(19, 118, 248));
        tambahTransaksiButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        tambahTransaksiButton.setForeground(new java.awt.Color(255, 255, 255));
        tambahTransaksiButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/transactionWhite.png")))); // NOI18N
        tambahTransaksiButton.setText("Tambah Transaction");
        tambahTransaksiButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        tambahTransaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahTransaksiButtonActionPerformed(evt);
            }
        });

        tambahOpnameButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        tambahOpnameButton.setForeground(new java.awt.Color(19, 118, 248));
        tambahOpnameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/infuse.png"))); // NOI18N
        tambahOpnameButton.setText("Ambil Nama Obat");
        tambahOpnameButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 118, 248), 3, true));
        tambahOpnameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahOpnameButtonActionPerformed(evt);
            }
        });

        addObatButton.setBackground(new java.awt.Color(19, 118, 248));
        addObatButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        addObatButton.setForeground(new java.awt.Color(255, 255, 255));
        addObatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/obatWhite.png"))); // NOI18N
        addObatButton.setText("Tambah Obat");
        addObatButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        addObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambahTransaksiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambahOpnameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahTransaksiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahOpnameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        idObatField.setText("ID Obat");
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

        jLabel1.setBackground(new java.awt.Color(19, 118, 248));
        jLabel1.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 118, 248));
        jLabel1.setText("ID Obat");

        jLabel2.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 118, 248));
        jLabel2.setText("Tempat Simpan");

        jLabel3.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 118, 248));
        jLabel3.setText("Tanggal");

        jLabel6.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 118, 248));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/infuse.png"))); // NOI18N
        jLabel6.setText("Tambah Opname");

        emptyInputButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        emptyInputButton.setForeground(new java.awt.Color(19, 118, 248));
        emptyInputButton.setText("Kosongkan Input");
        emptyInputButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 118, 248), 2, true));
        emptyInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyInputButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(19, 118, 248));
        cancelButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 13)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Batal");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(19, 118, 248));
        saveButton.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel9.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 118, 248));
        jLabel9.setText("Keterangan");

        stockMasukField.setText("Masuk");
        stockMasukField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMasukFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(19, 118, 248));
        jLabel10.setText("Masuk & Keluar");

        stockSisaField.setText("Sisa");
        stockSisaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockSisaFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 118, 248));
        jLabel13.setText("Sisa");

        stockKeluarField.setText("Keluar");
        stockKeluarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockKeluarFieldActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(19, 118, 248));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/ic_sharp-search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 200, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(370, 370, 370))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(idObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(stockMasukField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stockKeluarField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(stockSisaField)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(emptyInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tempatSimpanField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addComponent(keteranganField)
                            .addComponent(tanggalField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempatSimpanField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keteranganField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockMasukField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockKeluarField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockSisaField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emptyInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahTransaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransactionButtonActionPerformed
        AddTransaction transaction = new AddTransaction();
        transaction.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addTransactionButtonActionPerformed

    private void tambahOpnameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOpnameButtonActionPerformed
        int selectedId = PopUpInputIDObat.getSelectedId();
        setIdObat(selectedId);

        String id = getIdObat();
        //   System.out.println(id);
        idObatField.setText(id);
        String loggedInUser = Login.getLoggedInUser();

        // Check if loggedInUser is empty then set it to "empty"
        if (loggedInUser == null || loggedInUser.trim().isEmpty()) {
            loggedInUser = "empty";
        }
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
        // TODO add your handling code here:
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOpname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOpname().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton tambahTransaksiButton;
    private javax.swing.JButton emptyInputButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton tambahOpnameButton;
    private javax.swing.JButton addObatButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField idObatField;
    private javax.swing.JTextField stockKeluarField;
    private javax.swing.JTextField stockSisaField;
   // private javax.swing.JTextField stockKeluarField;
    private javax.swing.JTextField tempatSimpanField;
    private javax.swing.JTextField tanggalField;
    private javax.swing.JTextField totalHargaField;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JTextField stockMasukField;
    private String idObat;
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
        JTextField[] requiredIntegerFields = {stockMasukField, stockKeluarField, stockSisaField, idObatField};

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
      //  int selectedObatId = Integer.parseInt((String) Objects.requireNonNull(idObatComboBox.getSelectedItem()));

        String queryAdd = "INSERT INTO stok_opname (id_obat, tempat_simpan, tanggal_catat, stok_masuk, stok_keluar, sisa_stock, keterangan, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, NOW())";
            PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setInt(1, Integer.parseInt(idObatField.getText()));
        psAdd.setString(2, tempatSimpanField.getText());
        psAdd.setString(3, tanggalField.getText());
        psAdd.setInt(4, Integer.parseInt(stockMasukField.getText()));
        psAdd.setInt(5, Integer.parseInt(stockKeluarField.getText()));
        psAdd.setInt(6, Integer.parseInt(stockSisaField.getText()));
        psAdd.setString(7, keteranganField.getText());

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