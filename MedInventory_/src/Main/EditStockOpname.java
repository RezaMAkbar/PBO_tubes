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

public class EditStockOpname extends JFrame {
    private JTextField tempatSimpanField;
    private JTextField keteranganField;
    private JTextField stockMasukField;
    private JTextField stockSisaField;
    private JTextField stockKeluarField;
    private JTextField tanggalCatatField;


    public EditStockOpname(int id) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        Connection conn = dataSource.getConnection();
        // Set frame properties
        setTitle("Edit Data Stock Opname Dengan ID: " + id);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the current frame
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel with labels, text fields, and an "Edit" button
        JPanel panel = new JPanel(new GridLayout(7, 2));

        // Add labels and text fields
        panel.add(new JLabel("Tempat Simpan:"));
        tempatSimpanField = new JTextField();
        panel.add(tempatSimpanField);

        panel.add(new JLabel("Tanggal Catat:"));
        tanggalCatatField = new JTextField();
        panel.add(tanggalCatatField);

        panel.add(new JLabel("Stock Masuk:"));
        stockMasukField = new JTextField();
        panel.add(stockMasukField);

        panel.add(new JLabel("Stock Keluar:"));
        stockKeluarField = new JTextField();
        panel.add(stockKeluarField);

        panel.add(new JLabel("Stock Sisa:"));
        stockSisaField = new JTextField();
        panel.add(stockSisaField);

        panel.add(new JLabel("Keterangan:"));
        keteranganField = new JTextField();
        panel.add(keteranganField);

        // Add "Edit" button
        JButton editButton = new JButton("Edit");
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);

        panel.add(cancelButton);
        panel.add(editButton);

        add(panel);

        fetchDataFromDatabase(id);
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Update the database based on the entered values
                    String queryUpdate = "UPDATE stok_opname SET tempat_simpan = ?, tanggal_catat = ?, stok_masuk = ?, stok_keluar = ?, " +
                            "sisa_stock = ?, keterangan = ?, updated_at = NOW() WHERE id = ?";
                    PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);

                    psUpdate.setString(1, tempatSimpanField.getText());
                    psUpdate.setString(2, tanggalCatatField.getText());
                    psUpdate.setInt(3, Integer.parseInt(stockMasukField.getText()));
                    psUpdate.setInt(4, Integer.parseInt(stockKeluarField.getText()));
                    psUpdate.setInt(5, Integer.parseInt(stockSisaField.getText()));
                    psUpdate.setString(6, keteranganField.getText());
                    psUpdate.setInt(7, id);

                    psUpdate.executeUpdate();
                    psUpdate.close();

                    JOptionPane.showMessageDialog(null, "Data berhasil di update! silahkan refresh", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException | SQLException ex) {
                    ex.printStackTrace();
                    // Handle exception as needed
                    JOptionPane.showMessageDialog(null, "Error updating data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Display the frame
        setVisible(true);
    }
    private void fetchDataFromDatabase(int idObat) {
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "";

            dataSource.setUrl(DB_URL);
            dataSource.setUser(DB_USERNAME);
            dataSource.setPassword(DB_PASSWORD);

            Connection conn = dataSource.getConnection();

            // Fetch data from db based with medicine ID
            String querySelect = "SELECT * FROM stok_opname WHERE id = ?";
            try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                psSelect.setInt(1, idObat);
                try (ResultSet rs = psSelect.executeQuery()) {
                    if (rs.next()) {
                        tempatSimpanField.setText(rs.getString("tempat_simpan"));
                        tanggalCatatField.setText(rs.getString("tanggal_catat"));
                        stockMasukField.setText(String.valueOf(rs.getInt("stok_masuk")));
                        stockKeluarField.setText(String.valueOf(rs.getInt("stok_keluar")));
                        stockSisaField.setText(String.valueOf(rs.getInt("sisa_stock")));
                        keteranganField.setText(rs.getString("keterangan"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
