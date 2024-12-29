public class App {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("        Type Data      ");
        System.out.println("=======================");

        System.out.println("============");
        System.out.println("    Number  ");
        System.out.println("============");
        
        System.out.println("============");
        System.out.println("   1. Byte  ");
        System.out.println("============");
        byte angkaBesar = Byte.MAX_VALUE;
        byte angkaKecil = Byte.MIN_VALUE;
        System.out.println("Contoh: Angka Besar = " + angkaBesar);
        System.out.println("Contoh: Angka Kecil = " + angkaKecil);
        
        System.out.println("================");
        System.out.println("    2. Short    ");
        System.out.println("================");
        short angkaBesarShort = Short.MAX_VALUE;
        short angkaKecilShort = Short.MIN_VALUE;
        System.out.println("Contoh: Angka Besar = " + angkaBesarShort);
        System.out.println("Contoh: Angka Kecil = " + angkaKecilShort);
        
        System.out.println("================");
        System.out.println("    3. Integer  ");
        System.out.println("================");
        int angkaBesarInt = Integer.MAX_VALUE;
        int angkaKecilInt = Integer.MIN_VALUE;
        System.out.println("Contoh: Angka Besar = " + angkaBesarInt);
        System.out.println("Contoh: Angka Kecil = " + angkaKecilInt);
        
        System.out.println("============");
        System.out.println("   4. Long  ");
        System.out.println("============");
        long angkaBesarLong = Long.MAX_VALUE;
        long angkaKecilLong = Long.MIN_VALUE;
        System.out.println("Contoh: Angka Besar = " + angkaBesarLong);
        System.out.println("Contoh: Angka Kecil = " + angkaKecilLong);

        System.out.println("====================");
        System.out.println("    Floating point  ");
        System.out.println("====================");

        System.out.println("================");
        System.out.println("    1. Float    ");
        System.out.println("================");
        float bilanganPecahanFloat = 3.14f;
        System.out.println("Contoh: Bilangan Pecahan = " + bilanganPecahanFloat);

        System.out.println("================");
        System.out.println("    2. Double   ");
        System.out.println("================");
        double bilanganPecahan = 3.14;
        System.out.println("Contoh: Bilangan Pecahan = " + bilanganPecahan);

        // boolean
        System.out.println("======================");
        System.out.println("3. Boolean");
        System.out.println("======================");
        boolean benar = true;
        boolean salah = false;
        System.out.println("Contoh: Benar = " + benar);
        System.out.println("Contoh: Salah = " + salah);

        // string
        System.out.println("======================");
        System.out.println("4. String");
        System.out.println("======================");
        String kata = "Hello, World!";
        System.out.println("Contoh: Kata = " + kata);

        // char
        System.out.println("======================");
        System.out.println("5. Char");
        System.out.println("======================");
        char huruf = 'A';
        System.out.println("Contoh: Huruf = " + huruf);
    }
}
