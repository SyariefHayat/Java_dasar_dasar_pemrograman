package PrintPaham;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("Program Menampilkan Paham Sesuai Keinginan User");
        System.out.println("===============================================");

        // inisialisasi
        final String word = "Paham";

        // membuat class object baru dengan nama userInput
        Scanner userInput = new Scanner(System.in);

        // mengambil input dari user
        System.out.print("Masukkan looping kata: ");
        int input = userInput.nextInt();

        // looping kata
        for(int i = 1; i <= input; i++) {
            System.out.println("Looping ke -" + i + " : " + word);
        }

        // tutup scanner
        userInput.close();
    }
}
