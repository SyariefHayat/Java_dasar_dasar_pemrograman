# Latihan

Folder ini berisi penjelasan singkat dari latihan yang saya dapat di kuliah.

## Daftar isi
- [Latihan](#latihan)
  - [Daftar isi](#daftar-isi)
    - [1. Program Konversi Nilai](#1-program-konversi-nilai)

### 1. Program Konversi Nilai

1. **Pertanyaan:**
    - Buatlah program yang menerima nilai ujian user
    - Jika nilai 100 - 71 maka nilai "A" & "Lulus"
    - Jika nilai 70 - 61 maka nilai "B" & "Lulus"
    - Jika nilai 60 - 0 maka nilai "C" & "Tidak Lulus"

2. **Penjelasan Program:**
    1. Mendapatkan input nilai dari user
        ```java
        import java.util.Scanner;

        Scanner userInput = new Scanner(System.in);

        // deklarasi
        int nilai;

        // input nilai user
        System.out.print("Masukkan Nilai Anda: ");
        nilai = userInput.nextInt();

    - **Penjelasan:**
        - Scanner dalam java di gunakan untuk membaca input dari user.
        - System.in adalah cara Scanner untuk mendapatkan input user dari keyboard
        - nextInt() adalah method Scanner yang di gunakan untuk memasukkan input user ke dalam variabel integer

    2. Cek nilai user
        ```java
        if (nilai > 70 && nilai <= 100) {
            // jika nilai lebih besar dari 70 dan lebih kecil dari 100
            System.out.println("Anda mendapat nilai: A");
            System.out.println("Selamat anda Lulus!");
        } else if (nilai > 60 && nilai <= 70) {
            // jika nilai lebih besar dari 60 dan kurang dari 70
            System.out.println("Anda mendapat nilai: B");
            System.out.println("Selamat anda Lulus!");
        } else {
            // jika nilai lebih kecil dari 60
            System.out.println("Anda mendapat nilai: C");
            System.out.println("Maaf anda tidak Lulus!");
        }

    - **Penjelasan:**
        - && adalah operator perbandingan yang akan menghasilkan true jika dua kondisi benar dan bernilai false jika salah satu kondisi benar / kedua kondisi salah