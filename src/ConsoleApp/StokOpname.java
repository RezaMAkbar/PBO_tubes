package ConsoleApp;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StokOpname {
    static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/pbo_tubes?serverTimezone=Asia/Jakarta";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";

        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);


        do {
            try {
                Connection conn = dataSource.getConnection();

                System.out.println("""
                        1. Lihat Seluruh Data
                        2. Tambah Data
                        3. Edit Data
                        4. Hapus Obat
                        5. Exit""");

                System.out.println("\nPilih Menu: ");
                int pilih = scanner.nextInt();
                switch (pilih) {
                    case 1 -> showDataStockOpname(conn);
                    case 2 -> addData(conn);
                    case 3 -> editData(conn);
                    case 4 -> deleteData(conn);
                    case 5 -> System.exit(0);
                    default -> System.out.println("Menu Tidak Ada");
                }

                // Close the connection
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Exception accessing data: " + ex.getMessage());
            }

        } while (true);
    }
    private static void showDataStockOpname(@NotNull Connection conn) throws SQLException {
        String querySelect = "SELECT * FROM stok_opname";
        PreparedStatement psSelect = conn.prepareStatement(querySelect);

        // Execute the query and retrieve the results
        ResultSet rs = psSelect.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            int id_obat = rs.getInt("id_obat");
            String keterangan = rs.getString("keterangan");
            int sisa_stock = rs.getInt("sisa_stock");
            int stok_keluar = rs.getInt("stok_keluar");
            String tanggal_simpan = rs.getString("tanggal_simpan");
            String tempat_simpan = rs.getString("tempat_simpan");

            System.out.println("ID: " + id);
            System.out.println("ID Obat: " + id_obat);
            System.out.println("Tanggal Simpan (YYYY/MM/DD): " + tanggal_simpan);
            System.out.println("Stok Keluar: " + stok_keluar);
            System.out.println("Sisa Stock: " + sisa_stock);
            System.out.println("Tempat Simpan: " + tempat_simpan);
            System.out.println("Keterangan: " + keterangan);
            System.out.println("--------------------------------");
        }
        psSelect.close();
        rs.close();
    }
    private static void addData(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan ID Obat: ");
        int id_obat = scanner.nextInt();
        System.out.println("Masukan Sisa Stock: ");
        int sisa_stock = scanner.nextInt();
        System.out.println("Masukan Stock Keluar: ");
        int stok_keluar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Masukan Tanggal Simpan (YYYY/MM/DD): ");
        String tanggal_simpan = scanner.nextLine();
        System.out.println("Masukan Tempat Simpan: ");
        String tempat_simpan = scanner.nextLine();
        System.out.println("Masukan Keterangan: ");
        String keterangan = scanner.nextLine();
        String queryAdd = "INSERT INTO stok_opname (id_obat, sisa_stock, stok_keluar, tanggal_simpan, tempat_simpan, keterangan, created_at)" +
                "VALUES (?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setInt(1, id_obat);
        psAdd.setInt(2, sisa_stock);
        psAdd.setInt(3, stok_keluar);
        psAdd.setString(4, tanggal_simpan);
        psAdd.setString(5, tempat_simpan);
        psAdd.setString(6, keterangan);

        psAdd.executeUpdate();

        psAdd.close();
    }
    private static void editData(@NotNull Connection conn) throws SQLException {
        boolean continueEditing = true; //flag for edting
        System.out.println("Masukan ID Stock Opname yang akan di edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println("""
                        1. Tanggal Simpan
                        2. Stock Keluar
                        3. Sisa Stock
                        4. Tempat Simpan
                        5. Keterangan
                        6. Exit""");
            System.out.println("Pilih data yang mau di edit");

            try {
                int pilih = scanner.nextInt();
                scanner.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("Masukan Tanggal Simpan (YYYY/MM/DD: ");
                        String tanggal_simpan = scanner.nextLine();
                        String queryUpdate = "UPDATE stok_opname SET tanggal_simpan = ? WHERE id = ?";
                        PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, tanggal_simpan);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 2:
                        System.out.println("Masukan Stock Keluar: ");
                        int stok_keluar = scanner.nextInt();
                        queryUpdate = "UPDATE stok_opname SET stok_keluar = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setInt(1, stok_keluar);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 3:
                        System.out.println("Masukan Sisa Stock: ");
                        int sisa_stock = scanner.nextInt();
                        queryUpdate = "UPDATE stok_opname SET sisa_stock = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setInt(1, sisa_stock);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 4:
                        System.out.println("Masukan Tempat Simpan: ");
                        String tempat_simpan = scanner.nextLine();
                        queryUpdate = "UPDATE stok_opname SET tempat_simpan = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, tempat_simpan);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 5:
                        System.out.println("Masukan Keterangan: ");
                        String keterangan = scanner.nextLine();
                        queryUpdate = "UPDATE stok_opname SET keterangan = ? WHERE id = ?";
                        psUpdate = conn.prepareStatement(queryUpdate);

                        psUpdate.setString(1, keterangan);
                        psUpdate.setInt(2, id);

                        psUpdate.executeUpdate();
                        psUpdate.close();
                        break;
                    case 6:
                        //to exit editing page and back to the main menu
                        System.out.println("Kembali ke menu utama.");
                        continueEditing = false;
                        break;
                    default:
                        System.out.println("Menu Tidak Ada");
                }
            } catch (InputMismatchException e) {//if user input the wrong data type
                System.out.println("Input tidak valid. Silakan coba lagi.");
                scanner.nextLine();
            }
        } while (continueEditing);
    }
    private static void deleteData(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan ID Stock Opname yang akan di hapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String queryDelete = "DELETE FROM stok_opname WHERE id = ?";
        PreparedStatement psDelete = conn.prepareStatement(queryDelete);
        psDelete.setInt(1, id);

        psDelete.executeUpdate();
        psDelete.close();
        //testing h
    }
}
