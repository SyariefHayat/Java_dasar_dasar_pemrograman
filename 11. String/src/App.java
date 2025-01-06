public class App {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("    String    ");
        System.out.println("==============");

        String teks = "Hello, World!";

        System.out.println(teks);

        System.out.println("==============");
        System.out.println("    Method    ");
        System.out.println("==============");

        String txt = "ABCDEFGHIJKLMNOPQESTUVWXYZ";
        System.out.println("Panjang string txt adalah: " + txt.length());
        System.out.println("uppercase string txt adalah: " + txt.toUpperCase());
        System.out.println("lowercase string txt adalah: " + txt.toLowerCase());
        System.out.println("lokasi text F adalah: " + txt.indexOf("F"));
    }
}
