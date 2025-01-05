public class App {
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("    1. (=)     ");
        System.out.println("===============");

        int angka = 10;

        System.out.println("Angka = " + angka);

        System.out.println("================");
        System.out.println("    2. (+=)     ");
        System.out.println("================");

        int addition1 = 5;
        int addition2 = 5;

        System.out.println("Angka sebelum penugasan tambah = " + addition1);
        System.out.println("Angka sebelum penugasan tambah = " + addition2);

        addition1 += 10;
        addition2 = addition2 + 10;

        System.out.println("Angka setelah penugasan tambah = " + addition1);
        System.out.println("Angka setelah penugasan tambah = " + addition2);

        System.out.println("===============");
        System.out.println("    3. (-=)    ");
        System.out.println("===============");

        int subtraction1 = 5; 
        int subtraction2 = 5;
        
        System.out.println("Angka sebelum penugasan pengurangan = " + subtraction1);
        System.out.println("Angka sebelum penugasan pengurangan = " + subtraction2);

        subtraction1 -= 3;
        subtraction2 = subtraction2 - 3;

        System.out.println("Angka setelah penugasan pengurangan = " + subtraction1);
        System.out.println("Angka setelah penugasan pengurangan = " + subtraction2);

        System.out.println("===============");
        System.out.println("    4. (*=)    ");
        System.out.println("===============");

        int multiplication1 = 10;
        int multiplication2 = 10;

        System.out.println("Angka sebelum penugasan perkalian = " + multiplication1);
        System.out.println("Angka sebelum penugasan perkalian = " + multiplication2);

        multiplication1 *= 5;
        multiplication2 = multiplication2 * 5;

        System.out.println("Angka setelah penugasan perkalian = " + multiplication1);
        System.out.println("Angka setelah penugasan perkalian = " + multiplication2);

        System.out.println("===============");
        System.out.println("    5. (/=)    ");
        System.out.println("===============");

        float division1 = 10;
        float division2 = 10;

        System.out.println("Angka sebelum penugasan pembagian = " + division1);
        System.out.println("Angka sebelum penugasan pembagian = " + division2);

        division1 /= 2;
        division2 = division2 / 2;

        System.out.println("Angka setelah penugasan pembagian = " + division1);
        System.out.println("Angka setelah penugasan pembagian = " + division1);

        System.out.println("================");
        System.out.println("    6. (%=)     ");
        System.out.println("================");

        int modulus1 = 10;
        int modulus2 = 10;

        System.out.println("Angka sebelum penugasan sisa bagi = " + modulus1);
        System.out.println("Angka sebelum penugasan sisa bagi = " + modulus2);

        modulus1 %= 2;
        modulus2 = modulus2 %= 2;

        System.out.println("Angka setelah penugasan sisa bagi = " + modulus1);
        System.out.println("Angka setelah penugasan sisa bagi = " + modulus2);
    }
}
