# Exception Handling dalam Java - Laporan Praktikum

## Informasi Praktikum
- **Mata Kuliah**: Pemrograman Berorientasi Objek
- Nama : Siti Rahma Alia
- Nim : 20230040023

---

##  Daftar Isi

1. [Tujuan Praktikum](#-tujuan-praktikum)
2. [Ringkasan Percobaan](#-ringkasan-percobaan)
3. [Hasil Praktikum](#-hasil-praktikum)
   - [Percobaan 1: Penanganan ArrayIndexOutOfBoundsException](#percobaan-1-penanganan-arrayindexoutofboundsexception)
   - [Percobaan 2: Exception dalam Loop](#percobaan-2-exception-dalam-loop)
   - [Percobaan 3: ArithmeticException](#percobaan-3-arithmeticexception)
   - [Percobaan 4: Multiple Exception Handling](#percobaan-4-multiple-exception-handling)
   - [Percobaan 5: Metode Informasi Exception](#percobaan-5-metode-informasi-exception)
   - [Percobaan 6: Penggunaan throw](#percobaan-6-penggunaan-throw)
   - [Percobaan 7: Custom Exception Message](#percobaan-7-custom-exception-message)
   - [Percobaan 8: throws dan finally](#percobaan-8-throws-dan-finally)
   - [Percobaan 9: Exception Propagation](#percobaan-9-exception-propagation)
   - [Percobaan 10: IOException](#percobaan-10-ioexception)
   - [Percobaan 11: Custom Exception (Throwable)](#percobaan-11-custom-exception-throwable)
   - [Percobaan 12: Custom Exception (Exception)](#percobaan-12-custom-exception-exception)
4. [Analisis dan Pembelajaran](#-analisis-dan-pembelajaran)

---

## Tujuan Praktikum

Praktikum ini bertujuan untuk memahami konsep fundamental exception handling dalam Java, meliputi:

- **Memahami** berbagai jenis exception yang umum terjadi
- **Menguasai** penggunaan blok try-catch-finally
- **Mengimplementasikan** multiple exception handling
- **Membuat** custom exception classes
- **Menerapkan** best practices dalam error handling

Exception handling merupakan mekanisme penting dalam Java yang memungkinkan program menangani kondisi error secara elegan tanpa menyebabkan program berhenti mendadak.

---
## Hasil Praktikum

### Percobaan 1: Penanganan ArrayIndexOutOfBoundsException

**Masalah:** Program mencoba mengakses indeks array yang tidak valid
```java
int a[]=new int[5];
a[5]=100; // Error: indeks maksimal adalah 4
```

**Solusi:** Implementasi try-catch block
```java
try {
    a[5]=100;
} catch(Exception e) {
    System.out.println("Terjadi pelanggaran memory");
}
```

**Pembelajaran:** ArrayIndexOutOfBoundsException terjadi ketika mengakses elemen array di luar batas yang valid. Java melakukan bound checking untuk mencegah akses memori yang tidak aman.

---

### Percobaan 2: Exception dalam Loop

**Masalah:** Loop mengakses indeks array yang melebihi ukuran array
```java
String greeting[]={"Hello World!", "No, I mean it!", "Hello World"};
while(i<4) { // Array hanya memiliki 3 elemen
    System.out.println(greeting[i]);
    i++;
}
```

**Solusi:** Exception handling dengan reset mechanism
```java
try {
    System.out.println(greetings[i]);
    i++;
} catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("Resetting index value");
    i=0;
}
```

**Pembelajaran:** Exception dapat digunakan sebagai recovery mechanism, meskipun lebih baik mencegah dengan validasi kondisi loop.

---

### Percobaan 3: ArithmeticException

**Masalah:** Pembagian dengan nol menghasilkan ArithmeticException
```java
int bil=10;
System.out.println(bil/0); // Error matematika
```

**Solusi:** Specific exception handling
```java
try {
    System.out.println(bil/0);
} catch(ArithmeticException e) {
    System.out.println("Terjadi Aritmatika error");
} catch(Exception e) {
    System.out.println("Ini menghandle error yang terjadi");
}
```

**Pembelajaran:** Multiple catch blocks memungkinkan penanganan yang spesifik berdasarkan jenis exception. Urutan catch blocks penting - dari spesifik ke umum.

---

### Percobaan 4: Multiple Exception Handling

**Konsep:** Menangani berbagai jenis exception dalam satu try block
```java
try {
    System.out.println(bil/0);           // ArithmeticException
    System.out.println(b[3]);            // ArrayIndexOutOfBoundsException
} catch(ArithmeticException e) {
    System.out.println("Terjadi Aritmatika error");
} catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("Melebihi jumlah array");
}
```

**Pembelajaran:** Hanya satu exception yang dapat terjadi per eksekusi try block. Urutan statement dalam try block menentukan exception mana yang akan terjadi terlebih dahulu.

---

### Percobaan 5: Metode Informasi Exception

**Implementasi:** Eksplorasi berbagai metode untuk mendapatkan detail exception
```java
catch(ArithmeticException e) {
    System.out.println("Pesan error: ");
    System.out.println(e.getMessage());     // Pesan singkat
    System.out.println("Info stack erase");
    e.printStackTrace();                    // Stack trace lengkap
    e.printStackTrace(System.out);
}
```

**Pembelajaran:** 
- `getMessage()`: Pesan singkat exception
- `printStackTrace()`: Stack trace ke System.err
- `printStackTrace(System.out)`: Stack trace ke System.out

---

### Percobaan 6: Penggunaan throw

**Implementasi:** Manual exception throwing
```java
static void demo() {
    NullPointerException t = new NullPointerException("Coba Throw");
    throw t;
    // Kode setelah throw tidak akan dieksekusi
    System.out.println("Ini tidak lagi dicetak");
}
```

**Pembelajaran:** Kata kunci `throw` memungkinkan programmer melempar exception secara eksplisit. Eksekusi berhenti setelah throw statement.

---

### Percobaan 7: Custom Exception Message

**Implementasi:** Membuat exception dengan pesan custom
```java
try {
    throw new Exception("Here's my Exception");
} catch(Exception e) {
    System.out.println("e.getMessage():" + e.getMessage());
    System.out.println("e.toString():" + e.toString());
    e.printStackTrace();
}
```

**Pembelajaran:** Perbedaan antara `getMessage()`, `toString()`, dan `printStackTrace()` dalam memberikan informasi exception.

---

### Percobaan 8: throws dan finally

**Implementasi:** Delegasi exception handling dan cleanup operations
```java
public void methodB() throws IOException {
    System.out.println(20/0);
}

// Alternatif dengan try-catch-finally
try {
    o.methodB();
} catch(Exception e) {
    System.out.println("Error di Method B");
} finally {
    System.out.println("Ini selalu dicetak");
}
```

**Pembelajaran:** 
- `throws`: Mendelegasikan penanganan exception ke method pemanggil
- `finally`: Blok yang selalu dieksekusi untuk cleanup operations

---

### Percobaan 9: Exception Propagation

**Implementasi:** Exception yang berpindah melalui call stack
```java
public static String reverse(String s) throws Exception {
    if(s.length()==0) {
        throw new Exception();
    }
    // Logic reverse string
    return reverseStr;
}
```

**Pembelajaran:** Exception dapat dipropagasi dari method yang dipanggil ke method pemanggil, memungkinkan separation of concerns yang baik.

---

### Percobaan 10: IOException

**Implementasi:** File operations dengan exception handling
```java
try {
    RandomAccessFile books = new RandomAccessFile("books.txt","rw");
    // File operations
    books.close();
} catch(IOException e) {
    System.out.println("Indeks melebihi batas");
}
```

**Pembelajaran:** IOException adalah checked exception yang harus ditangani untuk operasi I/O. File operations memerlukan proper exception handling.

---

### Percobaan 11: Custom Exception (Throwable)

**Implementasi:** Membuat exception class dengan extending Throwable
```java
class RangeErrorException extends Throwable {
    public RangeErrorException(String s) {
        super(s);
    }
}
```

**Pembelajaran:** Custom exception memungkinkan error handling yang spesifik untuk domain aplikasi. Extending Throwable memberikan fleksibilitas maksimal.

---

### Percobaan 12: Custom Exception (Exception)

**Implementasi:** Business logic exception dengan extending Exception
```java
class MyException extends Exception {
    private String Teks;
    MyException(String s) {
        Teks="Exception generated by: "+s;
        System.out.println(Teks);
    }
}
```

**Pembelajaran:** Custom exception dapat memiliki behavior tambahan dan digunakan untuk mengimplementasikan business rules yang spesifik.

---

## 🔍 Analisis dan Pembelajaran

### Konsep Fundamental

1. **Exception Hierarchy**: Memahami hierarki exception dari Throwable → Exception → RuntimeException
2. **Checked vs Unchecked**: Perbedaan antara checked exceptions (harus ditangani) dan unchecked exceptions
3. **Exception Propagation**: Bagaimana exception berpindah melalui call stack
4. **Resource Management**: Penggunaan finally block untuk cleanup operations

### Best Practices

- **Specific Exception Handling**: Gunakan catch blocks yang spesifik daripada generic Exception
- **Meaningful Messages**: Berikan pesan yang informatif untuk debugging
- **Proper Cleanup**: Gunakan finally block untuk resource cleanup
- **Custom Exceptions**: Buat custom exception untuk business logic yang spesifik

### Pola Umum Exception Handling

1. **Try-Catch-Finally Pattern**
   ```java
   try {
       // Risky operations
   } catch(SpecificException e) {
       // Handle specific exception
   } catch(Exception e) {
       // Handle general exception
   } finally {
       // Cleanup operations
   }
   ```

2. **Method Declaration with throws**
   ```java
   public void methodName() throws IOException {
       // Operations that may throw IOException
   }
   ```

3. **Custom Exception Creation**
   ```java
   class CustomException extends Exception {
       public CustomException(String message) {
           super(message);
       }
   }
   ```

---
