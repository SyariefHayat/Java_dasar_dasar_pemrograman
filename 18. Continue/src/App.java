public class App {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("    Continue While    ");
        System.out.println("======================");

        int nilaiAwal = 1;
        while (nilaiAwal <= 10) {
            nilaiAwal++;
            if (nilaiAwal % 2 == 0) {
                System.out.println("loop ke: " + nilaiAwal);
                continue;
            }
        }

        System.out.println("====================");
        System.out.println("    Continue For    ");
        System.out.println("====================");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("loop ke: " + i);
                continue;
            }
        }
    }
}
