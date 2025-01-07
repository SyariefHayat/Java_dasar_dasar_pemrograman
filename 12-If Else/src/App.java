public class App {
    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("    IF    ");
        System.out.println("==========");

        System.out.println("If di gunakan untuk satu kondisi:");

        int nilai1 = 15;

        if (nilai1 > 10) {
            System.out.println("Jika kondisi if benar");
        }

        if (nilai1 < 10) {
            System.out.println("Jika kondis if salah");
        }

        System.out.println("===============");
        System.out.println("    IF Else    ");
        System.out.println("===============");

        System.out.println("If Else fi gunakan untuk dua kondisi");
        
        int nilai2 = 15;

        if (nilai2 > 10) {
            System.out.println("Jika kondisi if benar");
        } else {
            System.out.println("Jika kondisi if salah");
        }

        System.out.println("=========================");
        System.out.println("    If Else & Else If    ");
        System.out.println("=========================");

        System.out.println("If Else & Else If gunakan untuk lebih dari dua kondisi");

        int nilai3 = 15;

        if (nilai3 > 10) {
            System.out.println("Jika kondisi if benar");
        } else if (nilai3 > 5) {
            System.out.println("Jika kondisi else if benar");
        } else {
            System.out.println("Jika kondisi if dan else if salah");
        }
    }
}
