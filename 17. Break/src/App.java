public class App {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("    Break While    ");
        System.out.println("===================");

        int nilaiAwal = 1;
        while (nilaiAwal <= 10) {
            System.out.println("Loop ke: " + nilaiAwal);
            if (nilaiAwal == 5) {
                break;
            }
            nilaiAwal++;
        }

        System.out.println("=================");
        System.out.println("    Break For    ");
        System.out.println("=================");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop ke: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
