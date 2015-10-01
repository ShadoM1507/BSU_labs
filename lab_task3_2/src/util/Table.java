package util;

public class Table {
    private int n = 0;

    public void startDrawing() {
        System.out.println("\n+------------+------------+");
        System.out.println("| Переменная |  Значение  |");
        System.out.println("+------------+------------+");
    }

    public void addToTable(double a) {
        n++;

        System.out.print("|");
        System.out.printf("%7s", "a" + n);
        System.out.printf("%6s", "|");
        System.out.printf("%9.2f", a);
        System.out.printf("%4s%n", "|");
        System.out.println("+------------+------------+");
    }
}
