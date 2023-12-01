package ConsoleApp;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Transaksi {
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
                        1. Lihat Seluruh Data
                        2. Tambah Data
                        3. Edit Data
                        4. Hapus Data
                        5. Exit""");

                System.out.println("\nPilih Menu: ");
                int pilih = scanner.nextInt();
                switch (pilih) {
                    case 1 -> showDataTransaksi(conn);
                    case 2 -> addDataTransaksi(conn);
                    case 3 -> editDataTransaksi(conn);
                    case 4 -> deleteDataTransaksi(conn);
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

    private static void showDataTransaksi(@NotNull Connection conn) throws SQLException {
        String querySelect = "SELECT * FROM transaksi";
        PreparedStatement psSelect = conn.prepareStatement(querySelect);

        // Execute the query and retrieve the results
        ResultSet rs = psSelect.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            int id_obat = rs.getInt("id_obat");
            String tipe_transaksi = rs.getString("tipe_transaksi");
            String no_nota = rs.getString("no_nota");
            String username = rs.getString("username");
            int total_harga_beli = rs.getInt("total_harga_beli");
            int total_harga_jual = rs.getInt("total_harga_jual");
            String tanggal = rs.getString("tanggal");
            int jumlah_barang = rs.getInt("jumlah_barang");
            String catatan = rs.getString("catatan");

            System.out.println("ID: " + id);
            System.out.println("ID Obat: " + id_obat);
            System.out.println("Tipe Transaksi: " + tipe_transaksi);
            System.out.println("username: " + username);
            System.out.println("no_nota: " + no_nota);
            System.out.println("Total Harga Beli: " + total_harga_beli);
            System.out.println("Total Harga Jual: " + total_harga_jual);
            System.out.println("Tanggal (YYYY/MM/DD): " + tanggal);
            System.out.println("Jumlah Barang: " + jumlah_barang);
            System.out.println("Catatan: " + catatan);
            System.out.println("--------------------------------");
        }
        psSelect.close();
        rs.close();
    }

    private static void addDataPembelian(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan ID Obat: ");
        String id_obat = scanner.nextLine();
        System.out.println("Masukan Username: ");
        String username = scanner.nextLine();
        System.out.println("Masukan No. Nota: ");
        String no_nota = scanner.nextLine();
        System.out.println("Masukan Tanggal (YYYY/MM/DD): ");
        String tanggal = scanner.nextLine();
        System.out.println("Masukan Total Harga: ");
        double total_harga_beli = scanner.nextDouble();
        System.out.println("Masukan Jumlah Barang: ");
        int jumlah_barang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Catatan: ");
        String catatan = scanner.nextLine();
        String queryAdd = "INSERT INTO transaksi (id_obat, tipe_transaksi, username, no_nota, tanggal, total_harga_beli, " +
                "jumlah_barang, catatan, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setString(1, id_obat);
        psAdd.setString(2, "pembelian");
        psAdd.setString(3, username);
        psAdd.setString(4, no_nota);
        psAdd.setString(5, tanggal);
        psAdd.setDouble(6, total_harga_beli);
        psAdd.setInt(7, jumlah_barang);
        psAdd.setString(8, catatan);

        psAdd.executeUpdate();
        psAdd.close();
    }
    private static void addDataPenjualan(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan ID Obat: ");
        String id_obat = scanner.nextLine();
        System.out.println("Masukan Username: ");
        String username = scanner.nextLine();
        System.out.println("Masukan Tanggal (YYYY/MM/DD): ");
        String tanggal = scanner.nextLine();
        System.out.println("Masukan Total Harga: ");
        double total_harga_jual = scanner.nextDouble();
        System.out.println("Masukan Jumlah Barang: ");
        int jumlah_barang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Catatan: ");
        String catatan = scanner.nextLine();
        String queryAdd = "INSERT INTO transaksi (id_obat, tipe_transaksi, username, tanggal, total_harga_jual, " +
                "jumlah_barang, catatan, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setString(1, id_obat);
        psAdd.setString(2, "penjualan");
        psAdd.setString(3, username);
        psAdd.setString(4, tanggal);
        psAdd.setDouble(5, total_harga_jual);
        psAdd.setInt(6, jumlah_barang);
        psAdd.setString(7, catatan);

        psAdd.executeUpdate();
        psAdd.close();
    }
    private static void addDataTransaksi(@NotNull Connection conn) throws SQLException {
        boolean continueEditing = true;

        do {
            System.out.println("""
                        1. Pembelian
                        2. Penjualan
                        3. Exit""");
            System.out.println("Pilih Tipe Transaksi: ");

            try {
                int pilih = scanner.nextInt();
                scanner.nextLine();

                switch (pilih) {
                    case 1 -> addDataPembelian(conn);
                    case 2 -> addDataPenjualan(conn);
                    case 3 -> {
                        System.out.println("Kembali ke menu utama.");
                        continueEditing = false;
                    }
                    default -> System.out.println("Input salah");
                }
            } catch (InputMismatchException e) {//if user input the wrong data type
                System.out.println("Input tidak valid. Silakan coba lagi.");
                scanner.nextLine();
            }
        } while (continueEditing);
    }
    private static String getTipeTransaksi(Connection conn, int id) {
        String tipeTransaksi = "";

        try {
            String query = "SELECT tipe_transaksi FROM transaksi WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setInt(1, id);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        tipeTransaksi = rs.getString("tipe_transaksi");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipeTransaksi;
    }
    private static void editDataTransaksi(@NotNull Connection conn) throws SQLException {

        boolean continueEditing = true;
        System.out.println("Masukan ID Transaksi yang akan di edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        do {//untuk berbasis konsol bisa edit tipe transaksi, jika terjadi kesalahan
            System.out.println("""
                        1. Tipe Transaksi
                        2. Username
                        3. Tanggal
                        4. Total Harga
                        5. Jumlah Barang
                        6. Catatan
                        7. Exit""");
            System.out.println("Pilih data yang mau di edit");

            try {
                int pilih = scanner.nextInt();
                scanner.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("Masukan Tipe Transaksi: ");
                        String tipe_transaksi = scanner.nextLine();
                        String queryUpdate = "UPDATE transaksi SET tipe_transaksi = ? WHERE id = ?";
                        PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, tipe_transaksi);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 2:
                        System.out.println("Masukan Username: ");
                        String username = scanner.nextLine();
                        queryUpdate = "UPDATE transaksi SET username = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, username);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 3:
                        System.out.println("Masukan Tanggal (YYYY/MM/DD): ");
                        String tanggal = scanner.nextLine();
                        queryUpdate = "UPDATE transaksi SET tanggal = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, tanggal);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 4:
                        System.out.println("Masukan Total Harga: ");
                        String total_harga = scanner.nextLine();
                        String tipe = getTipeTransaksi(conn, id);
                        String columnName;
                        if ("pembelian".equals(tipe)) {
                            columnName = "total_harga_beli";
                        } else if ("penjualan".equals(tipe)) {
                            columnName = "total_harga_jual";
                        } else {
                            System.out.println("Tipe transaksi tidak valid.");
                            break;
                        }

                        queryUpdate = "UPDATE transaksi SET " + columnName + " = ? WHERE id = ?";
                        try (PreparedStatement psUpdateIn = conn.prepareStatement(queryUpdate)) {
                            psUpdateIn.setString(1, total_harga);
                            psUpdateIn.setInt(2, id);

                            psUpdateIn.executeUpdate();
                        } catch (SQLException e) {
                            e.printStackTrace(); // Handle the exception appropriately
                        }
                        break;
                    case 5:
                        System.out.println("Masukan Jumlah Barang: ");
                        String jumlah_barang = scanner.nextLine();
                        queryUpdate = "UPDATE transaksi SET jumlah_barang = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, jumlah_barang);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 6:
                        System.out.println("Catatan: ");
                        String catatan = scanner.nextLine();
                        queryUpdate = "UPDATE transaksi SET catatan = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, catatan);
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

    private static void deleteDataTransaksi(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan ID Transaksi yang akan di hapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String queryDelete = "DELETE FROM transaksi WHERE id = ?";
        PreparedStatement psDelete = conn.prepareStatement(queryDelete);
        psDelete.setInt(1, id);

        psDelete.executeUpdate();
        psDelete.close();
        //testing h
    }
}
