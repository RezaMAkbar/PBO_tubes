/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author gede.astugmail.com
 */
public class PopUpInputIDObat extends javax.swing.JFrame {

    /**
     * Creates new form PopUpInputIDObat
     */
    public PopUpInputIDObat() {
        initComponents();
        addTransactionInstance = new AddTransaction();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaObatTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        cariObatButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        emptyInputButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(19, 118, 248));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cari ID Obat dengan Nama Obat");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        namaObatTextField.setText("Cari ID Obat dengan Nama");
        namaObatTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchButtonActionPerformed(e);
            }
        });


        searchButton.setBackground(new java.awt.Color(19, 118, 248));
        searchButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Main/ic_sharp-search.png")))); // NOI18N
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchButtonActionPerformed(e);
            }
        });


        cariObatButton.setBackground(new java.awt.Color(19, 118, 248));
        cariObatButton.setForeground(new java.awt.Color(255, 255, 255));
        cariObatButton.setText("Cari Obat");
        cariObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariObatButtonActionPerformed(evt);
            }
        });

        kembaliButton.setForeground(new java.awt.Color(19, 118, 248));
        kembaliButton.setText("Kembali");
        kembaliButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 118, 248)));
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        emptyInputButton.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        emptyInputButton.setForeground(new java.awt.Color(19, 118, 248));
        emptyInputButton.setText("Kosongkan Input");
        emptyInputButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 118, 248)));
        emptyInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyInputButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cariObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emptyInputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(namaObatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namaObatTextField)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emptyInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    private void cariObatButtonActionPerformed(java.awt.event.ActionEvent evt) {
       // System.out.println("Selected ID: " + selectedId);
        if (addTransactionInstance != null) {
         //   System.out.println("Before setIdObat method call");
            if (selectedId != 0) {
                addTransactionInstance.setIdObat(selectedId);
              //  System.out.println("After setIdObat method call");
            } else {
                JOptionPane.showMessageDialog(this, "No ID selected.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void emptyInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyInputButtonActionPerformed
        clearTextFields(this.getContentPane());
    }//GEN-LAST:event_emptyInputButtonActionPerformed

    public void setAddTransactionInstance(AddTransaction addTransactionInstance) {
        this.addTransactionInstance = addTransactionInstance;
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
            java.util.logging.Logger.getLogger(PopUpInputIDObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpInputIDObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpInputIDObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpInputIDObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpInputIDObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton searchButton;
    private javax.swing.JButton cariObatButton;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton emptyInputButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField namaObatTextField;
    private ArrayList<String> idObatList;
    public static AddTransaction addTransactionInstance;
    private static int selectedId;
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

    private void searchButtonActionPerformed(ActionEvent evt) {
        String namaObat = namaObatTextField.getText().trim();
        if (!namaObat.isEmpty()) {
            showMatchingObat(namaObat);
        } else {
            JOptionPane.showMessageDialog(this, "Nama obat tidak ditemukan atau tidak valid.");
        }
    }

    public static int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    private void showMatchingObat(String namaObat) {
        // Create new Frame to display the matching med name
        JFrame namaObatFrame = new JFrame("Matching Obat");
        namaObatFrame.setSize(400, 300);
      //  namaObatFrame.dispose();

        idObatList = matchMedicineNameWithID(namaObat);
        idObatList.sort(Comparator.comparingInt(id -> Integer.parseInt(id.split("\\(")[1].replace(")", ""))));

        // Create a TextArea to display the matching medicine name
        JTextArea matchingObatTextArea = new JTextArea();
        matchingObatTextArea.setEditable(false);
        boolean found = false;

        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "";

            dataSource.setUrl(DB_URL);
            dataSource.setUser(DB_USERNAME);
            dataSource.setPassword(DB_PASSWORD);



            try (Connection conn = dataSource.getConnection()) {
                String querySelect = "SELECT id, nama_obat FROM obat WHERE nama_obat LIKE ?";
                try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                    psSelect.setString(1, "%" + namaObat + "%");
                    try (ResultSet rs = psSelect.executeQuery()) {
                        while (rs.next()) {
                            String nama_obat = rs.getString("nama_obat");
                            int id = rs.getInt("id");
                            matchingObatTextArea.append(nama_obat + " (" + id + ")\n");
                            found = true;
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (!found) {
            JOptionPane.showMessageDialog(this, "Nama Obat tidak ditemukan.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
            namaObatFrame.dispose();
        } else {

            // Add TextArea to Frame
            JScrollPane scrollPane = new JScrollPane(matchingObatTextArea);
            namaObatFrame.add(scrollPane);

            // Add a mouse listener to the TextArea
            matchingObatTextArea.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int caretPosition = matchingObatTextArea.viewToModel(e.getPoint());
                    try {
                        int lineNumber = matchingObatTextArea.getLineOfOffset(caretPosition);
                        int startOffset = matchingObatTextArea.getLineStartOffset(lineNumber);
                        int endOffset = matchingObatTextArea.getLineEndOffset(lineNumber);

                        // Get the clicked line text
                        String clickedLine = matchingObatTextArea.getText().substring(startOffset, endOffset).trim();

                        // Extract the ID from the clicked line text
                        int idStartIndex = clickedLine.lastIndexOf("(") + 1;
                        int idEndIndex = clickedLine.lastIndexOf(")");

                        if (idEndIndex > idStartIndex) {
                            String idString = clickedLine.substring(idStartIndex, idEndIndex);
                            selectedId = Integer.parseInt(idString);
                        }

                        // Set the clicked line text to the namaObatTextField
                        namaObatTextField.setText(clickedLine);
                    } catch (BadLocationException | NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            namaObatFrame.setLocationRelativeTo(this);
     //       namaObatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            namaObatFrame.setVisible(true);
        }
    }
    private ArrayList<String> matchMedicineNameWithID(String namaObat) {
        ArrayList<String> idObatList = new ArrayList<>();
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "";

            dataSource.setUrl(DB_URL);
            dataSource.setUser(DB_USERNAME);
            dataSource.setPassword(DB_PASSWORD);

            try (Connection conn = dataSource.getConnection()) {
                String querySelect = "SELECT id FROM obat WHERE nama_obat = ?";
                try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                    psSelect.setString(1, namaObat);
                    try (ResultSet rs = psSelect.executeQuery()) {
                        while (rs.next()) {
                            String idObat = rs.getString("id");
                            idObatList.add(idObat);
                            System.out.println("Found ID: " + idObat); // Add this line for debugging
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idObatList;
    }
}

