package Main;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditTransaksi extends JFrame {
    private JTextField notaField;
    private JTextField keteranganField;
    private JTextField jumlahBarangField;
    private JTextField hargaField;
    private JTextField catatanField;
    private JTextField tanggalField;


    public EditTransaksi(int id) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        Connection conn = dataSource.getConnection();
        // Set frame properties
        setTitle("Edit Data Transaksi Dengan ID: " + id);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the current frame
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel with labels, text fields, and an "Edit" button
        JPanel panel = new JPanel(new GridLayout(6, 2));

        // Add labels and text fields
        panel.add(new JLabel("No. Nota:"));
        notaField = new JTextField();
        panel.add(notaField);

        panel.add(new JLabel("Tanggal (YYYY-MM-DD):"));
        tanggalField = new JTextField();
        panel.add(tanggalField);

        panel.add(new JLabel("Jumlah Barang:"));
        jumlahBarangField = new JTextField();
        panel.add(jumlahBarangField);

        panel.add(new JLabel("Total Harga:"));
        hargaField = new JTextField();
        panel.add(hargaField);

        panel.add(new JLabel("Catatan:"));
        catatanField = new JTextField();
        panel.add(catatanField);
        

        // Add "Edit" button
        JButton editButton = new JButton("Edit");
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);

        panel.add(cancelButton);
        panel.add(editButton);

        add(panel);

        fetchDataFromDatabase(id);
        editButton.addActionListener(e -> {
            try {
                String queryUpdate = "UPDATE transaksi SET no_nota = ?, tanggal = ?, jumlah_barang = ?, " +
                        "catatan = ?, updated_at = NOW() WHERE id = ?";

                String tipeTransaksi = fetchTransactionType(id);

                if ("restock".equals(tipeTransaksi)) {
                    queryUpdate = "UPDATE transaksi SET no_nota = ?, tanggal = ?, jumlah_barang = ?, " +
                            "catatan = ?, total_harga_beli = ?, updated_at = NOW() WHERE id = ?";
                } else if ("penjualan".equals(tipeTransaksi)) {
                    queryUpdate = "UPDATE transaksi SET no_nota = ?, tanggal = ?, jumlah_barang = ?, " +
                            "catatan = ?, total_harga_jual = ?, updated_at = NOW() WHERE id = ?";
                }

                PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);

                psUpdate.setString(1, notaField.getText());
                psUpdate.setString(2, tanggalField.getText());
                psUpdate.setInt(3, Integer.parseInt(jumlahBarangField.getText()));
                psUpdate.setString(4, catatanField.getText());

                if ("restock".equals(tipeTransaksi)) {
                    psUpdate.setInt(5, Integer.parseInt(hargaField.getText()));
                } else if ("penjualan".equals(tipeTransaksi)) {
                    psUpdate.setInt(5, Integer.parseInt(jumlahBarangField.getText()));
                }
                psUpdate.setInt(6, id);

                psUpdate.executeUpdate();
                psUpdate.close();

                JOptionPane.showMessageDialog(null, "Data berhasil di update! silahkan refresh", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException | SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error updating data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> dispose());

        setVisible(true);
    }
    private void fetchDataFromDatabase(int id) {
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "";

            dataSource.setUrl(DB_URL);
            dataSource.setUser(DB_USERNAME);
            dataSource.setPassword(DB_PASSWORD);

            Connection conn = dataSource.getConnection();

            String querySelect = "SELECT * FROM transaksi WHERE id = ?";
            try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                psSelect.setInt(1, id);
                try (ResultSet rs = psSelect.executeQuery()) {
                    if (rs.next()) {
                        notaField.setText(rs.getString("no_nota"));
                        tanggalField.setText(rs.getString("tanggal"));
                        jumlahBarangField.setText(String.valueOf(rs.getInt("jumlah_barang")));
                        catatanField.setText(rs.getString("catatan"));

                        String tipeTransaksi = rs.getString("tipe_transaksi");
                        
                        if ("restock".equals(tipeTransaksi)) {
                            hargaField.setText(String.valueOf(rs.getInt("total_harga_beli")));
                        } else if ("penjualan".equals(tipeTransaksi)) {
                            hargaField.setText(String.valueOf(rs.getInt("total_harga_jual")));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private static String fetchTransactionType(int id) {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        String tipe = null;
        String querySelectName = "SELECT tipe_transaksi FROM transaksi WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement psSelectNote = conn.prepareStatement(querySelectName)) {
            psSelectNote.setInt(1, id);

            try (ResultSet rsNoNota = psSelectNote.executeQuery()) {
                if (rsNoNota.next()) {
                    tipe = rsNoNota.getString("tipe_transaksi");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipe;
    }
}
