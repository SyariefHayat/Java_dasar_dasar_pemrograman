public class App {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("    Casting     ");
        System.out.println("================");

        System.out.println("===================");
        System.out.println("1. Widening Casting");
        System.out.println("===================");

        System.out.println("Mengubah nilai angka yang lebih kecil ke nilai yang lebih besar");
        System.out.println("dan ini di lakukan secara otomatis, contoh:");
        System.out.println("byte -> short -> int -> long -> float -> double");

        byte iniByte = 10;
        System.out.println("iniByte: " + iniByte);

        short iniShort = iniByte;
        System.out.println("iniShort: " + iniShort);

        int iniInt = iniShort;
        System.out.println("iniInt: " + iniInt);

        long iniLong = iniInt;
        System.out.println("iniLong: " + iniLong);

        float iniFloat = iniLong;
        System.out.println("iniFloat: " + iniFloat);

        double iniDouble = iniFloat;
        System.out.println("iniDouble: " + iniDouble);

        System.out.println("====================");
        System.out.println("2. Narrowing Casting");
        System.out.println("====================");

        System.out.println("Mengubah nilai angka yang lebih besar ke nilai yang lebih kecil");
        System.out.println("dan harus dilakukan secara manual, contoh:");
        System.out.println("double -> float -> long -> int -> short -> byte");

        double iniDouble2 = 20.5;
        System.out.println("iniDouble2: " + iniDouble2);

        float iniFloat2 = (float) iniDouble2;
        System.out.println("iniFloat2: " + iniFloat2);

        long iniLong2 = (long) iniFloat2;
        System.out.println("iniLong2: " + iniLong2);

        int iniInt2 = (int) iniLong2;
        System.out.println("iniInt2: " + iniInt2);

        short iniShort2 = (short) iniInt2;
        System.out.println("iniShort2: " + iniShort2);

        byte iniByte2 = (byte) iniShort2;
        System.out.println("iniByte2: " + iniByte2);
    }
}
