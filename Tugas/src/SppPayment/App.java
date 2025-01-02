package SppPayment;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        // membuat class object baru dengan nama userInput
        Scanner userInput = new Scanner(System.in);

        // inisialisasi
        final double nominalSpp = 2900000;
        double kembali = 0.0;
        double kurang = 0.0;

        // deklarasi
        String statusPembayaran;

        System.out.println("================================================");
        System.out.println("            Program Pembayaran Spp              ");
        System.out.println("================================================");

        // Input Biodata User
        System.out.print("Masukkan Nama: ");
        String nama = userInput.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = userInput.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = userInput.nextLine();

        System.out.print("Masukkan Semester: ");
        byte semester = userInput.nextByte();

        // Input Pembayaran
        System.out.print("Masukkan jumlah pembayaran SPP: Rp. ");
        double pembayaran = userInput.nextDouble();

        // Cek Status Pembayaran
        if (pembayaran > nominalSpp) {

            // jika nilai pembayaran lebih besar dari nominal spp
            kembali = pembayaran - nominalSpp;
            statusPembayaran = "Lunas";

        } else if (pembayaran < nominalSpp) {

            // jika nilai pembayaran lebih kecil dari nominal spp
            kurang = nominalSpp - pembayaran;
            statusPembayaran = "Belum Lunas";

        } else {

            // jika nilai pembayaran sama dengan nominal spp
            statusPembayaran = "Lunas"; 
        }

        // ubah format decimal
        DecimalFormat df = new DecimalFormat("#,###");

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

        // Tutup Scanner
        userInput.close();
    }
}
