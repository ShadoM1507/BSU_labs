package task;

import util.Table;

import java.util.Scanner;

public class Task {
    private double a1;
    private double a2;

    public static void main(String[] args) {
        int n;
        double v;
        Task task = new Task();
        Input in = new Input();
        Table table = new Table();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите n не меньше 2-х: ");
        n = in.readInt(scan);
        System.out.print("Введите положительный a1: ");
        task.setA1(in.readDouble(scan));
        System.out.print("Введите положительный а2: ");
        task.setA2(in.readDouble(scan));

        table.startDrawing();
        table.addToTable(task.getA1());
        table.addToTable(task.getA2());

        for (int i = 1; i <= n - 2; i++) {
            v = task.nextVar(i);
            table.addToTable(v);
        }

        scan.close();
    }

    private double nextVar(int k) {
        a1 = Math.pow(a2, 1d / (k + 1)) / Math.pow(a1, 1d / k);

        a1 += a2;
        a2 = a1 - a2;
        a1 -= a2;

        return a2;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }
}
