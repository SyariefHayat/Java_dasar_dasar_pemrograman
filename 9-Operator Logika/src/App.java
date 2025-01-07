public class App {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("    1. Logical AND (&&)    ");
        System.out.println("===========================");

        int and1 = 10;
        int and2 = 5;

        System.out.println(and1 + " > 5" + " && " + and2 + " < 10" + " = " + (and1 > 5 && and2 < 10));
        System.out.println(and1 + " < 5" + " && " + and2 + " < 10" + " = " + (and1 < 5 && and2 < 10));
        System.out.println(and1 + " > 5" + " && " + and2 + " > 10" + " = " + (and1 > 5 && and2 > 10));
        System.out.println(and1 + " < 5" + " && " + and2 + " > 10" + " = " + (and1 < 5 && and2 > 10));

        System.out.println("==========================");
        System.out.println("    2. Logical OR (||)    ");
        System.out.println("==========================");

        int or1 = 10;
        int or2 = 5;

        System.out.println(or1 + " > 5" + " || " + or2 + " < 10" + " = " + (or1 > 5 || or2 < 10));
        System.out.println(or1 + " < 5" + " || " + or2 + " < 10" + " = " + (or1 < 5 || or2 < 10));
        System.out.println(or1 + " > 5" + " || " + or2 + " > 10" + " = " + (or1 > 5 || or2 > 10));
        System.out.println(or1 + " < 5" + " || " + or2 + " > 10" + " = " + (or1 < 5 || or2 > 10));

        System.out.println("==========================");
        System.out.println("    3. Logical NOT (!)    ");
        System.out.println("==========================");

        int not1 = 10;
        int not2 = 5;

        System.out.println(not1 + " > 5" + " || " + not2 + " < 10" + " = " + !(not1 > 5 || not2 < 10));
        System.out.println(not1 + " < 5" + " || " + not2 + " < 10" + " = " + !(not1 < 5 || not2 < 10));
        System.out.println(not1 + " > 5" + " || " + not2 + " > 10" + " = " + !(not1 > 5 || not2 > 10));
        System.out.println(not1 + " < 5" + " || " + not2 + " > 10" + " = " + !(not1 < 5 || not2 > 10));
    }
}
