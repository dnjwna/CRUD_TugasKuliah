# Aplikasi CRUD Tugas Kuliah

Aplikasi berbasis Java Swing untuk mencatat, mengedit, dan menghapus daftar tugas kuliah. Dibangun sebagai proyek UAS menggunakan:

- Java (Swing)
- MySQL + JDBC
- JDateChooser (untuk input tanggal)
- FlatLaf (untuk tampilan modern)
- NetBeans (IDE utama)

---

## 🎯 Fitur Utama

✅ Tambah data tugas  
✅ Edit dan hapus data berdasarkan ID  
✅ Input tanggal deadline dengan JDateChooser  
✅ Tabel interaktif untuk melihat semua data  
✅ Statistik: total tugas, jumlah mata kuliah, deadline terdekat  
✅ Fitur pencarian berdasarkan nama mata kuliah  
✅ Sortir otomatis berdasarkan tanggal deadline  
✅ Tampilan modern dengan FlatLaf (Dark mode)

---

## 💻 Cara Menjalankan

1. Import project ke NetBeans
2. Pastikan MySQL aktif dan sudah membuat database + tabel
3. Ubah koneksi DB di `KoneksiMysql.java` jika perlu
4. Jalankan class `Main.java`

---

## ⚙️ Struktur Tabel MySQL

```sql
CREATE TABLE tugas (
  id_tugas VARCHAR(10) PRIMARY KEY,
  mata_kuliah VARCHAR(50),
  deskripsi TEXT,
  deadline DATE
);
