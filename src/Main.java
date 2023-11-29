

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jetbrains.annotations.NotNull;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/pbo_tubes?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                Connection conn = dataSource.getConnection();

                System.out.println("""
                        1. Lihat Seluruh Obat
                        2. Tambah Obat
                        3. Edit Obat
                        4. Hapus Obat
                        5. Exit""");

                System.out.println("\nPilih Menu: ");
                int pilih = scanner.nextInt();
                switch (pilih) {
                    case 1 -> showDataObat(conn);
                    case 2 -> addObat(conn);
                    case 3 -> editDataObat(conn);
                    case 4 -> deleteDataObat(conn);
                    case 5 -> System.exit(0);
                    default -> System.out.println("Input salah");
                }

                // Close the connection
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Exception accessing data: " + ex.getMessage());
            }

        } while (true);
    }

    private static void showDataObat(@NotNull Connection conn) throws SQLException {
        String querySelect = "SELECT * FROM obat";
        PreparedStatement psSelect = conn.prepareStatement(querySelect);

        // Execute the query and retrieve the results
        ResultSet rs = psSelect.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String nama_obat = rs.getString("nama_obat");
            int stock = rs.getInt("stock");
            int harga = rs.getInt("harga");
            String tanggal_masuk = rs.getString("tanggal_masuk");
            String expired = rs.getString("expired");
            String no_batch = rs.getString("no_batch");

            System.out.println("ID: " + id);
            System.out.println("Nama Obat: " + nama_obat);
            System.out.println("Stock: " + stock);
            System.out.println("Harga: " + harga);
            System.out.println("Tanggal Masuk: " + tanggal_masuk);
            System.out.println("Expired: " + expired);
            System.out.println("No. Batch: " + no_batch);
            System.out.println("--------------------------------");
        }
        psSelect.close();
        rs.close();
    }

    private static void addObat(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan Nama Obat: ");
        String nama_obat = scanner.nextLine();
        System.out.println("Masukan Jumlah Obat: ");
        int stock = scanner.nextInt();
        System.out.println("Masukan Harga Obat: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Masukan Tanggal Masuk Obat: ");
        String tanggal_masuk = scanner.nextLine();
        System.out.println("Masukan Tanggal Expired Obat: ");
        String expired = scanner.nextLine();
        System.out.println("Masukan Nomor Batch Obat: ");
        String no_batch = scanner.nextLine();
        String queryAdd = "INSERT INTO obat (nama_obat, stock, harga, tanggal_masuk, expired, no_batch, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setString(1, nama_obat);
        psAdd.setInt(2, stock);
        psAdd.setDouble(3, harga);
        psAdd.setString(4, tanggal_masuk);
        psAdd.setString(5, expired);
        psAdd.setString(6, no_batch);

        psAdd.executeUpdate();

        psAdd.close();
    }

    private static void editDataObat(@NotNull Connection conn) throws SQLException {
        boolean continueEditing = true; //flag for edting
        System.out.println("Masukan ID Obat yang akan di edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println("""
                        1. Nama Obat
                        2. Stock Obat
                        3. Harga Obat
                        4. Tanggal Masuk Obat
                        5. Tanggal Expired Obat
                        6. Nomor Batch Obat
                        7. Exit""");
            System.out.println("Pilih data yang mau di edit");

            try {
                int pilih = scanner.nextInt();
                scanner.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("Masukan Nama Obat: ");
                        String nama_obat = scanner.nextLine();
                        String queryUpdate = "UPDATE obat SET nama_obat = ? WHERE id = ?";
                        PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, nama_obat);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 2:
                        System.out.println("Masukan Jumlah Obat: ");
                        int stock = scanner.nextInt();
                        queryUpdate = "UPDATE obat SET stock = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setInt(1, stock);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 3:
                        System.out.println("Masukan Harga Obat: ");
                        double harga = scanner.nextDouble();
                        queryUpdate = "UPDATE obat SET harga = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setDouble(1, harga);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 4:
                        System.out.println("Masukan Tanggal Masuk Obat: ");
                        String tanggal_masuk = scanner.nextLine();
                        queryUpdate = "UPDATE obat SET tanggal_masuk = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, tanggal_masuk);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 5:
                        System.out.println("Masukan Tanggal Expired Obat: ");
                        String expired = scanner.nextLine();
                        queryUpdate = "UPDATE obat SET expired = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, expired);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 6:
                        System.out.println("Masukan No. Obat: ");
                        String no_batch = scanner.nextLine();
                        queryUpdate = "UPDATE obat SET no_batch = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, no_batch);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 7://to exit editing page and back to the main menu
                        System.out.println("Kembali ke menu utama.");
                        continueEditing = false;
                        break;
                    default:
                        System.out.println("Input salah");
                }
            } catch (InputMismatchException e) {//if user input the wrong data type
                System.out.println("Input tidak valid. Silakan coba lagi.");
                scanner.nextLine();
            }
        } while (continueEditing);
    }

    private static void deleteDataObat(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan ID Obat yang akan di hapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String queryDelete = "DELETE FROM obat WHERE id = ?";
        PreparedStatement psDelete = conn.prepareStatement(queryDelete);
        psDelete.setInt(1, id);

        psDelete.executeUpdate();
        psDelete.close();
        //h
    }

}