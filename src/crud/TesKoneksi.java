package crud;

import java.sql.SQLException;

public class TesKoneksi {
    public static void main(String[] args) throws SQLException {
        if (KoneksiMysql.koneksiDB() != null) {
            System.out.println("Koneksi Berhasil!");
        } else {
            System.out.println("Koneksi Gagal!");
        }
    }
}
