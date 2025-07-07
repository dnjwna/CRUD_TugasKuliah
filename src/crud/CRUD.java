package crud;
import java.sql.*;

public class CRUD {
    Connection con;
    Statement st;
    ResultSet rs;

    private String id, matkul, deskripsi, deadline;

    public CRUD() throws SQLException {
        con = KoneksiMysql.koneksiDB();
        st = con.createStatement();
    }

    public void setID(String id) { this.id = id; }
    public void setMatkul(String m) { this.matkul = m; }
    public void setDeskripsi(String d) { this.deskripsi = d; }
    public void setDeadline(String d) { this.deadline = d; }

    public String getID() { return id; }
    public String getMatkul() { return matkul; }
    public String getDeskripsi() { return deskripsi; }
    public String getDeadline() { return deadline; }

    public void simpanData() throws SQLException {
        String sql = "INSERT INTO tugas VALUES ('" + id + "','" + matkul + "','" + deskripsi + "','" + deadline + "')";
        st.executeUpdate(sql);
    }

    public void ubahData() throws SQLException {
        String sql = "UPDATE tugas SET mata_kuliah='" + matkul + "', deskripsi='" + deskripsi + "', deadline='" + deadline + "' WHERE id_tugas='" + id + "'";
        st.executeUpdate(sql);
    }

    public void hapusData() throws SQLException {
        String sql = "DELETE FROM tugas WHERE id_tugas='" + id + "'";
        st.executeUpdate(sql);
    }

    public ResultSet tampilData() throws SQLException {
        return st.executeQuery("SELECT * FROM tugas");
    }
}
