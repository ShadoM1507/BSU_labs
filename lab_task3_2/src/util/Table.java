package util;

public class Table {
    static int n = 0;

    public static void drawStart() {
        System.out.println("\n+------------+------------+");
        System.out.println("| Переменная |  Значение  |");
        System.out.println("+------------+------------+");
    }

    public static void addToTable(double a) {
        n++;

        System.out.print("|");
        System.out.printf("%7s", "a" + n);
        System.out.printf("%6s", "|");
        System.out.printf("%9.2f", a);
        System.out.printf("%4s%n", "|");
        System.out.println("+------------+------------+");
    }
}
