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

public class EditObat extends JFrame {
    private JTextField namaObatField;
    private JTextField expiredField;
    private JTextField stockField;
    private JTextField hargaField;
    private JTextField tanggalMasukField;
    private JTextField tempatSimpanField;


    public EditObat(int id) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        Connection conn = dataSource.getConnection();
             // Set frame properties
        setTitle("Edit Obat Dengan ID: " + id);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the current frame
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel with labels, text fields, and an "Edit" button
        JPanel panel = new JPanel(new GridLayout(7, 2));

        // Add labels and text fields
        panel.add(new JLabel("Nama Obat:"));
        namaObatField = new JTextField();
        panel.add(namaObatField);

        panel.add(new JLabel("Tanggal Masuk (YYYY-MM-DD):"));
        tanggalMasukField = new JTextField();
        panel.add(tanggalMasukField);

        panel.add(new JLabel("Tanggal Expired (YYYY-MM-DD):"));
        expiredField = new JTextField();
        panel.add(expiredField);

        panel.add(new JLabel("Jumlah Obat:"));
        stockField = new JTextField();
        panel.add(stockField);

        panel.add(new JLabel("Harga Obat:"));
        hargaField = new JTextField();
        panel.add(hargaField);

        panel.add(new JLabel("Tempat Simpan:"));
        tempatSimpanField = new JTextField();
        panel.add(tempatSimpanField);

        // Add "Edit" button
        JButton editButton = new JButton("Edit");
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);

        panel.add(cancelButton);
        panel.add(editButton);

        add(panel);

        fetchDataFromDatabase(id);
        fetchStorageFromDatabase(id);
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Update the database based on the entered values
                    String queryUpdate = "UPDATE obat SET nama_obat = ?, expired = ?, stock = ?, harga = ?, tanggal_masuk = ? WHERE id = ?";
                    PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);

                    psUpdate.setString(1, namaObatField.getText());
                    psUpdate.setString(2, expiredField.getText());
                    psUpdate.setInt(3, Integer.parseInt(stockField.getText()));
                    psUpdate.setDouble(4, Double.parseDouble(hargaField.getText()));
                    psUpdate.setString(5, tanggalMasukField.getText());
                    psUpdate.setInt(6, id);

                    psUpdate.executeUpdate();
                    psUpdate.close();

                    String queryUpdate2 = "UPDATE stok_opname SET tempat_simpan = ?, WHERE id_obat = ?";
                    PreparedStatement psUpdate2 = conn.prepareStatement(queryUpdate2);

                    psUpdate2.setString(1, tempatSimpanField.getText());
                    psUpdate2.setInt(2, id);

                    psUpdate2.executeUpdate();
                    psUpdate2.close();

                    JOptionPane.showMessageDialog(null, "Data berhasil di update! silahkan refresh", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException | SQLException ex) {
                    ex.printStackTrace();
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
            String querySelect = "SELECT * FROM obat WHERE id = ?";
            try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                psSelect.setInt(1, idObat);
                try (ResultSet rs = psSelect.executeQuery()) {
                    if (rs.next()) {
                        namaObatField.setText(rs.getString("nama_obat"));
                        expiredField.setText(rs.getString("expired"));
                        stockField.setText(String.valueOf(rs.getInt("stock")));
                        hargaField.setText(String.valueOf(rs.getInt("harga")));
                        tanggalMasukField.setText(rs.getString("tanggal_masuk"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void fetchStorageFromDatabase(int idObat) {
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
            String querySelect = "SELECT tempat_simpan FROM stok_opname WHERE id_obat = ?";
            try (PreparedStatement psSelect = conn.prepareStatement(querySelect)) {
                psSelect.setInt(1, idObat);
                try (ResultSet rs = psSelect.executeQuery()) {
                    if (rs.next()) {
                        tempatSimpanField.setText(rs.getString("tempat_simpan"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

