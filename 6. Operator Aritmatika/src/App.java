public class App {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("   1. Addition (+)  ");
        System.out.println("====================");

        int plus1 = 10;
        int plus2 = 10;
        int penjumlahan = plus1 + plus2;

        System.out.println(plus1 + " + " + plus2 + " = " + penjumlahan);
        System.out.println("10 + 20 = " + (10 + 20));

        System.out.println("========================");
        System.out.println("   2. Subtraction (-)   ");
        System.out.println("========================");

        int minus1 = 20;
        int minus2 = 10;
        int pengurangan = minus1 - minus2;
        
        System.out.println(minus1 + " - " + minus2 + " = " + pengurangan);
        System.out.println("20 - 10 = " + (20 - 10));

        System.out.println("============================");
        System.out.println("    3. Multiplication (*)   ");
        System.out.println("============================");

        float multi1 = 10;
        float multi2 = 20;
        float perkalian = multi1 * multi2;

        System.out.println(multi1 + " * " + multi2 + " = " + perkalian);
        System.out.println("10 * 20 = " + (10 * 20));

        System.out.println("=======================");
        System.out.println("    4. Division (/)    ");
        System.out.println("=======================");

        float bagi1 = 10;
        float bagi2 = 20;
        float pembagian = bagi1 / bagi2;

        System.out.println(bagi1 + " / " + bagi2 + " = " + pembagian);
        System.out.println("10 / 20 = " + (10 / 20));

        System.out.println("======================");
        System.out.println("    5. Modulus (%)    ");
        System.out.println("======================");

        int modulus1 = 10;
        int modulus2 = 20;
        int sisaBagi = modulus1 % modulus2;

        System.out.println(modulus1 + " % " + modulus2 + " = " + sisaBagi);
        System.out.println("10 % 20 = " + (10 % 20));

        System.out.println("=========================");
        System.out.println("    6. Increment (++)    ");
        System.out.println("=========================");

        int angka1 = 10;

        System.out.println("Angka sebelum increment = " + angka1);

        // increment
        angka1++;

        System.out.println("Angka sesudah increment = " + angka1);

        System.out.println("==========================");
        System.out.println("    7. Decrement (--)     ");
        System.out.println("==========================");

        int angka2 = 20;

        System.out.println("Angka sebelum decrement = " + angka2);

        // decrement
        angka2--;
        
        System.out.println("Angka sesudah decrement = " + angka2);
    }
}
