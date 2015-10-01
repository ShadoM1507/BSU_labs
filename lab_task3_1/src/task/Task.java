package task;

import util.Table;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int n;
        double s = 1d / 3;
        Input in = new Input();
        Scanner scan = new Scanner(System.in);
        Table table = new Table();
        Task task = new Task();

        try {
            System.out.print("Введите n: ");
            n = in.readInt(scan);

            table.startDrawing();

            if (n > 0) {
                table.addToTable(s);
            }
            task.computation(2, n, table, s);

            System.out.println("\nf = 0.5");

            if(n > 0) {
                System.out.println("S стремится к f");
            }
        } catch (java.lang.StackOverflowError e) {
            System.out.println("\nВнимание! Дальнейшее заполнение таблицы невозможно! Произошло переполнение стека!");
        }

    }

    private void computation(int i, int n, Table table, double s) {
        if (i > n) {
            return;
        }

        double t = i * (2 * i - 1);
        s = s * (t / (t - 1));
        table.addToTable(s);

        computation(i + 1, n, table, s);
    }
}
