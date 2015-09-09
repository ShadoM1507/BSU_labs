package task;

import util.Table;

public class Task {
    public static void main(String[] args) {
        int n;
        double s = 0;

        System.out.print("Введите n: ");
        n = Input.inputInt();

        Table.drawStart();
        s = computation(n);

        System.out.println("\nf = 0.5");
        System.out.println("S стремится к f");
    }

    private static double computation(int n) {
        double s = 1d / 3;
        Table.addToTable(s);

        for(int i = 2; i <= n; i++) {
            double t = i * (2 * i - 1);
            s = s * (t / (t - 1));
            Table.addToTable(s);
        }

        return s;
    }
}
