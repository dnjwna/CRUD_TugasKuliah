package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiMysql {
    static Connection koneksi;
    public static Connection koneksiDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/crud12345678";
            String user = "root";
            String pass = ""; // ganti jika pakai password
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }
}
