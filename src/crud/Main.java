package crud;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Set FlatLaf sebelum semua komponen dibuat
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (Exception e) {
            System.err.println("Gagal memuat FlatLaf: " + e);
        }

        // Jalankan GUI di EDT
        SwingUtilities.invokeLater(() -> {
            try {
                Form_Tugas form = new Form_Tugas();
                form.setLocationRelativeTo(null); // center screen
                form.setVisible(true);
            } catch (SQLException e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(null, "Gagal membuka aplikasi: " + e.getMessage());
            }
        });
    }
}
