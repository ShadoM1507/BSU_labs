package util;

public class Table {
    static int n = 0;

    public static void drawStart() {
        System.out.println("\n+------------+------------+");
        System.out.println("|    Сумма   |  Значение  |");
        System.out.println("+------------+------------+");
    }

    public static void addToTable(double s) {
        n++;

        System.out.print("|");
        System.out.printf("%7s", "s" + n);
        System.out.printf("%6s", "|");
        System.out.printf("%9.2f", s);
        System.out.printf("%4s%n", "|");
        System.out.println("+------------+------------+");
    }
}
