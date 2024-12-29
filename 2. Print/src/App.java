public class App {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("       Print Dalam Java    ");
        System.out.println("===========================");

        // print
        System.out.println("======================");
        System.out.println("1. Print tanpa endline");
        System.out.println("======================");

        // contoh
        System.out.print("Hello");
        System.out.print(", ");
        System.out.print("World!\n");

        System.out.print(1 + ", ");
        System.out.print(2 + ", ");
        System.out.print(3 + "\n");

        // println
        System.out.println("=======================");
        System.out.println("2. Println dengan endline");
        System.out.println("=======================");

        // contoh
        System.out.println("Hello, World!");
        System.out.println(1 + ", " + 2 + ", " + 3);

        // printf
        System.out.printf("======================\n");
        System.out.printf("3. Printf dengan format\n");
        System.out.printf("======================\n");

        // contoh
        System.out.printf("%s, %s", "Hello", "World!");
        System.out.printf("\n%d, %d, %d%n", 1, 2, 3);
    }
}
