# 📘 Catatan Tugas

Folder ini berisi penjelasan singkat dari tugas yang saya dapat di kuliah.

## Daftar Tugas
- [📘 Catatan Tugas](#-catatan-tugas)
  - [Daftar Tugas](#daftar-tugas)
    - [1. Program Pembayaran Spp](#1-program-pembayaran-spp)
    - [2. Program Print Paham](#2-program-print-paham)

### 1. Program Pembayaran Spp

1. **Pertanyaan:**
   - Nominal spp 2.900.000
   - Jika pembayaran > spp "Lunas"
   - Jika pembayaran < spp "Belum Lunas"
   - Menampilkan biodata user

2. **Penjelasan Program:**
   1. Mendapatkan biodata user :
        ```java
        // panggil class Scanner
        import java.util.Scanner;

        // membuat class object baru dengan nama userInput
        Scanner userInput = new Scanner(System.in);

        // Input Biodata User
        System.out.print("Masukkan Nama: ");
        String nama = userInput.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = userInput.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = userInput.nextLine();

        System.out.print("Masukkan Semester: ");
        byte semester = userInput.nextByte();

    - **Penjelasan:**
        - Scanner dalam java di gunakan untuk membaca input dari user.

   2. Input nominal pembayaran user
        ```java
        // Input Pembayaran
        System.out.print("Masukkan jumlah pembayaran SPP: Rp. ");
        double pembayaran = userInput.nextDouble();

    - **Penjelasan:**
        - Menggunakan variabel "double" agar bisa menerima pembayaran dengan nominal yang besar

   3. Cek status Pembayaran
        ```java
        // Cek Status Pembayaran
        if (pembayaran > nominalSpp) {
            kembali = pembayaran - nominalSpp;
            statusPembayaran = "Lunas";
        } else if (pembayaran < nominalSpp) {
            kurang = nominalSpp - pembayaran;
            statusPembayaran = "Belum Lunas";
        } else {
            statusPembayaran = "Lunas"; 
        }

    - **Penjelasan:**
        - Jika pembayaran > nominalSpp maka lakukan pengurangan dari pembayaran - nominalSpp untuk mendapatkan uang kembalian user

        - Jika pembayaran < nominalSpp maka lakukan pengurangan dari nominalSpp - pembayaran
    
        - Jika pembayaran == nominalSpp maka inisialisasi statusPembayaran dengan "Lunas"  

   4. Ubah format decimal
        ```java
        // import class DecimalFormat
        import java.text.DecimalFormat;

        // membuat class object baru dengan nama df
        DecimalFormat df = new DecimalFormat("#,###");

    - **Penjelasan:**
        - DecimalFormat dalam java di gunakan untuk merubah format decimal dengan pattern tertentu, dan dalam kasus saya menggunakan pattern "#, ###". "#" sebagai penanda angka dan "," sebagai pemisah ribuan contoh: 1,200,000

   5. Tampilkan output hasil pembayaran
        ```java
        // Output Hasil
        System.out.println("================================================");
        System.out.println("            Detail Pembayaran SPP               ");
        System.out.println("================================================");
        System.out.println("Nama              : " + nama);
        System.out.println("NIM               : " + nim);
        System.out.println("Prodi             : " + prodi);
        System.out.println("Semester          : " + semester);
        System.out.println("================================================");
        System.out.println("Nominal SPP       : Rp. " + df.format(nominalSpp));
        System.out.println("Pembayaran        : Rp. " + df.format(pembayaran));
        System.out.println("Kembalian         : Rp. " + df.format(kembali));
        System.out.println("Kurang            : Rp. " + df.format(kurang));
        System.out.println("================================================");
        System.out.println("Status Pembayaran : " + statusPembayaran);

### 2. Program Print Paham

1. **Pertanyaan:**
    - Buatlah aplikasi untuk menampilkan teks “PAHAM” sebanyak keinginan user.

2. **Penjelasan Program:**
   1. Mendapatkan input dari user
        ```java
        // panggil class Scanner
        import java.util.Scanner;

        // membuat class object baru dengan nama userInput
        Scanner userInput = new Scanner(System.in);

        // mengambil input dari user
        System.out.print("Masukkan jumlah looping kata: ");
        int input = userInput.nextInt();
    
    - **Penjelasan:**
        - System.in adalah cara Scanner untuk mendapatkan input user dari keyboard

        - nextInt() adalah method Scanner yang di gunakan untuk memasukkan input user ke dalam variabel integer

   2. Looping kata berdasarkan input
        ```java
        // looping kata
        for(int i = 1; i <= input; i++) {
            System.out.println("Looping ke -" + i + " : " + word);
        }

    - **Penjelasan:**
        - Melakukan looping dengan kondisi, jika i <= input maka cetak "Looping ke -1 : Paham"