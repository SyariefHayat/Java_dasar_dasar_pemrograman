import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("Program Hitung Nilai Huruf");
        System.out.println("==========================");

        Scanner userInput = new Scanner(System.in);

        // deklarasi
        int nilai;

        // input nilai user
        System.out.print("Masukkan Nilai Anda: ");
        nilai = userInput.nextInt();

        if (nilai > 70 && nilai <= 100) {

            // jika nilai lebih besar dari 70
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

        // tutup scanner
        userInput.close();
    }
}
