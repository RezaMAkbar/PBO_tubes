package Main;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HapusOpname extends JFrame {
    private JTextField idObatField;

    public HapusOpname() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbo?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        Connection conn = dataSource.getConnection();
        // Set frame properties
        setTitle("Hapus Data");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the current frame
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel with labels, text fields, and an "Edit" button
        JPanel panel = new JPanel(new GridLayout(2, 2));

        // Add labels and text fields
        panel.add(new JLabel("ID Stock Opname:"));
        idObatField = new JTextField();
        panel.add(idObatField);

        // Add "Hapus" button
        JButton hapusButton = new JButton("Hapus");
        JButton cancelButton = new JButton("Cancel");

        hapusButton.setPreferredSize(new Dimension(50, 10));
        cancelButton.setPreferredSize(new Dimension(50, 10));

        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.RED);

        panel.add(cancelButton);
        panel.add(hapusButton);

        // Add panel to the frame
        add(panel);

        // Set up the action listener for the "Edit" button
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this data?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    try {
                        // Delete the data based on the entered values
                        String queryDelete = "DELETE FROM stok_opname WHERE id = ?";
                        PreparedStatement psDelete = conn.prepareStatement(queryDelete);
                        psDelete.setInt(1, Integer.parseInt(idObatField.getText()));

                        psDelete.executeUpdate();
                        psDelete.close();

                        // Close the frame after updating
                        dispose();
                    } catch (NumberFormatException | SQLException ex) {
                        ex.printStackTrace();
                        // Handle the exception as needed
                        JOptionPane.showMessageDialog(null, "Error deleting data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
