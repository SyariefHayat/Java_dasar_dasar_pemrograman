public class App {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("    1. Equal to (==)    ");
        System.out.println("========================");

        int equal1 = 10;
        int equal2 = 10;

        System.out.println("Apakah " + equal1 + " == " + equal2 + " : " + (equal1 == equal2));

        String equal3 = "10";
        String equal4 = "20";

        System.out.println("Apakah " + equal3 + " == " + equal4 + " : " + (equal3 == equal4));

        System.out.println("=========================");
        System.out.println("    2. Not equal (!=)    ");
        System.out.println("=========================");

        int not1 = 10;
        int not2 = 10;

        System.out.println("Apakah " + not1 + " != " + not2 + " : " + (not1 != not2));

        String not3 = "10";
        String not4 = "20";

        System.out.println("Apakah " + not3 + " != " + not4 + " : " + (not3 != not4));

        System.out.println("===========================");
        System.out.println("    3. Greater than (>)    ");
        System.out.println("===========================");

        int greater1 = 20;
        int greater2 = 10;

        System.out.println("Apakah " + greater1 + " > " + greater2 + " : " + (greater1 > greater2));

        int greater3 = 10;
        int greater4 = 10;

        System.out.println("Apakah " + greater3 + " > " + greater4 + " : " + (greater3 > greater4));

        System.out.println("========================");
        System.out.println("    4. Less than (<)    ");
        System.out.println("========================");

        int less1 = 10;
        int less2 = 20;

        System.out.println("Apakah " + less1 + " < " + less2 + " : " + (less1 < less2));

        int less3 = 10;
        int less4 = 10;

        System.out.println("Apakah " + less3 + " < " + less4 + " : " + (less3 < less4));

        System.out.println("========================================");
        System.out.println("    5. Greater than or equal to (>=)    ");
        System.out.println("========================================");

        int greaterthan1 = 20;
        int greaterthan2 = 10;

        System.out.println("Apakah " + greaterthan1 + " >= " + greaterthan2 + " : " + (greaterthan1 >= greaterthan2));
        
        int greaterthan3 = 10;
        int greaterthan4 = 10;

        System.out.println("Apakah " + greaterthan3 + " >= " + greaterthan4 + " : " + (greaterthan3 >= greaterthan4));

        System.out.println("=====================================");
        System.out.println("    6. Less than or equal to (<=)    ");
        System.out.println("=====================================");

        int lessthan1 = 10;
        int lessthan2 = 20;

        System.out.println("Apakah " + lessthan1 + " <= " + lessthan2 + " : " + (lessthan1 <= lessthan2));

        int lessthan3 = 10;
        int lessthan4 = 10;

        System.out.println("Apakah " + lessthan3 + " <= " + lessthan4 + " : " + (lessthan3 <= lessthan4));
    }
}
