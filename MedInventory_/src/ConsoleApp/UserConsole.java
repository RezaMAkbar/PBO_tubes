package ConsoleApp;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

public class UserConsole {
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
                        1. Lihat Seluruh User
                        2. Sign in
                        3. Exit""");

                System.out.println("\nPilih Menu: ");
                int pilih = scanner.nextInt();
                scanner.nextLine();
                switch (pilih) {
                    case 1 -> showDataUser(conn);
                    case 2 -> addUser(conn);
                    case 3 -> System.exit(0);
                    default -> System.out.println("Input salah");
                }

                // Close the connection
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Exception accessing data: " + ex.getMessage());
            }

        } while (true);
    }
    private static void showDataUser(@NotNull Connection conn) throws SQLException {
        String querySelect = "SELECT * FROM users";
        PreparedStatement psSelect = conn.prepareStatement(querySelect);

        // Execute the query and retrieve the results
        ResultSet rs = psSelect.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String name = rs.getString("name");
            String email = rs.getString("email");

            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Nama: " + name);
            System.out.println("Email: " + email);
            System.out.println("--------------------------------");
        }
        psSelect.close();
        rs.close();
    }
    private static void addUser(@NotNull Connection conn) throws SQLException {
        System.out.println("Masukan Username : ");
        String username = scanner.nextLine();
        System.out.println("Masukan Nama: ");
        String name = scanner.nextLine();
        System.out.println("Masukan Email: ");
        String email = scanner.nextLine();
        System.out.println("Masukan Password: ");
        String password = scanner.nextLine();


        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        String queryAdd = "INSERT INTO users (username, name, email, password, created_at)" +
                "VALUES (?, ?, ?, ?, NOW())";
        PreparedStatement psAdd = conn.prepareStatement(queryAdd);

        psAdd.setString(1, username);
        psAdd.setString(2, name);
        psAdd.setString(3, email);
        psAdd.setString(4, hashedPassword);

        psAdd.executeUpdate();

        psAdd.close();
    }
}
