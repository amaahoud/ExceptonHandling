📖 Praktikum Exception Handling 
---
## Informasi Mahasiswa
- **Nama**: Siti Rahma Alia
- **Kelas**: TI23A  
- **NIM**: 20230040023
---
## 🔍 Hasil Analisis Percobaan

### Percobaan 1: `ArrayIndexOutOfBoundsException`
- **Error** : Mengakses indeks ke-5 dari array berukuran 5 menyebabkan `ArrayIndexOutOfBoundsException`.
- **Perbaikan**: Menggunakan `try-catch` untuk menangani error agar program tetap berjalan.
- **Tujuan**: Mengenalkan dasar exception handling saat bekerja dengan array.

### Percobaan 2: Perulangan Melebihi Indeks Array
- **Error**:Perulangan melebihi panjang array sehingga menimbulkan exception.
- **Perbaikan**: Menangani error dengan `try-catch` dan mereset nilai indeks.
- **Tujuan**: Menangani error yang berulang dalam struktur kontrol seperti loop.

### Percobaan 3: `ArithmeticException` (Pembagian dengan Nol)
- **Error:** Operasi `10 / 0` menimbulkan `ArithmeticException`.
- **Perbaikan:** Menangani error menggunakan blok `try-catch`.
- **Tujuan:** Menangani kesalahan aritmatika.

### Percobaan 4: Multiple Exception
- **Error:** Kombinasi error dari pembagian dengan nol dan akses array yang salah.
- **Perbaikan:** Menyusun beberapa blok `catch` untuk tiap jenis exception.
- **Tujuan:** Menangani banyak jenis exception dalam satu program.

### Percobaan 5: Menampilkan Detail Error
- **Fokus:** Menampilkan detail error (`getMessage()`, `printStackTrace()`).
- **Tujuan:** Mengetahui informasi yang bisa diperoleh dari sebuah exception.

### Percobaan 6: Manual `throw` Exception
- **Fokus:** Secara eksplisit melempar `NullPointerException`.
- **Tujuan:** Menunjukkan bahwa exception bisa dilempar secara manual.

### Percobaan 7: `throw` Exception dengan Pesan
- **Fokus:** Melempar objek `Exception` dengan pesan tertentu.
- **Tujuan:** Memahami metode dalam class `Exception` seperti `getMessage()` dan `printStackTrace()`.

### Percobaan 8: Penggunaan `throws` dan `finally`
- **Fokus:** Method dengan `throws`, dan implementasi `finally` untuk eksekusi akhir.
- **Tujuan:** Menjelaskan konsep `throws`, penanganan error, dan blok `finally`.

### Percobaan 9: Validasi Input Kosong
- **Fokus:** Fungsi melempar exception jika parameter string kosong.
- **Tujuan:** Menangani exception yang dilempar dari dalam fungsi.

### Percobaan 10: Penanganan `IOException` dalam File
- **Fokus:** Menggunakan `RandomAccessFile` untuk membaca/menulis file.
- **Tujuan:** Menangani error saat melakukan operasi file.

### Percobaan 11: Custom `Throwable` Class
- **Fokus:** Membuat class turunan dari `Throwable` dan melemparkannya.
- **Tujuan:** Mengetahui bahwa tidak hanya `Exception`, `Throwable` juga bisa digunakan.

### Percobaan 12: Custom Exception dengan `extends Exception`
- **Fokus:** Membuat class exception sendiri yang extends `Exception`.
- **Tujuan:** Memberikan penanganan error khusus untuk kondisi tertentu.

---

## Kesimpulan

- Exception Handling merupakan bagian penting dalam membuat program yang tangguh dan aman dari crash.
- Java menyediakan berbagai mekanisme seperti `try-catch`, `throw`, `throws`, dan `finally` untuk menangani error.
- Penanganan exception sebaiknya dilakukan secara spesifik dan terstruktur agar memudahkan debugging.
- Penggunaan custom exception membantu menyesuaikan penanganan error dengan kebutuhan aplikasi.

---
