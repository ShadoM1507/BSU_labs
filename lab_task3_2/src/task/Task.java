package task;

import util.Table;

public class Task {
    static double a1;
    static double a2;

    public static void main(String[] args) {
        int n;

        System.out.print("Введите n не меньше 2-х: ");
        n = Input.inputInt();
        System.out.print("Введите положительный a1: ");
        a1 = Input.inputDouble();
        System.out.print("Введите положительный а2: ");
        a2 = Input.inputDouble();

        Table.drawStart();
        Table.addToTable(a1);
        Table.addToTable(a2);

        for(int i = 1; i <= n - 2; i++) {
            Table.addToTable(nextVar(i));
        }
    }

    private static double nextVar(int k) {
        double t = Math.pow(a2, 1d/(k + 1));
        a1 = Math.pow(a2, 1d/(k + 1)) / Math.pow(a1, 1d/k);

        a1 += a2;
        a2 = a1 - a2;
        a1 -= a2;

        return a2;
    }
}
