public class App {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("    Switch    ");
        System.out.println("==============");

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jum'at");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Ahad");
                break;
            default:
                break;
        }
    }
}
