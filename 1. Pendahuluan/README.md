### PENJELASAN

Dalam bab ini kita membuat file **App.java**, yang di gunakan untuk menampilkan "Hello, World!" ke layar.

### SYNTAX

1.  **Package src;**
    - Baris ini mendefinisikan bahwa file App.java adalah bagian dari package bernama src.
    - Package digunakan untuk mengorganisasi kode dalam proyek Java, seperti folder untuk menyimpan file.

2.  **public class App {...}**
    - Setiap baris kode yang berjalan di Java harus berada di dalam class.
    - Baris ini mendefinisikan sebuah kelas bernama App.
    - Nama file harus sama dengan nama kelas karena Java mewajibkan nama file .java sesuai dengan nama kelas publik.
    - nama kelas harus selalu dimulai dengan huruf kapital pertama.

3.  **public static void main(String[] args){...}**
    - Public : Method ini dapat diakses dari mana saja.
    - Static : Method ini milik kelas (App) dan dapat dijalankan tanpa membuat objek kelas terlebih dahulu.
    - Void : Method ini tidak mengembalikan nilai apa pun.
    - Main : Nama dari method ini
    - String[] args : Parameter ini digunakan untuk menerima argumen dari command line.

Ini adalah entry point atau titik awal eksekusi program Java. Jika method main tidak ada dalam di dalam program maka akan terjadi error