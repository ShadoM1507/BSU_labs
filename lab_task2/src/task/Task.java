package task;

import util.Factorial;

public class Task {


    public static void main(String[] args) {
        double x_beg;
        double x_end;
        double x_delta;
        double f;

        System.out.print("Введите начальное значение x: ");
        x_beg = Input.inputDouble();
        System.out.print("Введите конечное значение x: ");
        x_end = Input.inputDouble();
        System.out.print("Введите шаг переменной x: ");
        x_delta = Input.inputDouble();

        for(double j = x_beg; j <= x_end; j += x_delta)
        {
            if(j == 0)
                continue;

            System.out.println("\nx = " + j + ":");
            System.out.println("s = " + computation(j));

            f = Math.sin(j) / j;
            System.out.println("f(x) = " + f);
        }
    }

    private static double computation(double x) {
        final double EPS = 0.00000000001;
        double s = 0;
        double dif;
        double n = 0;

        do {
            dif = (Math.pow(-1, n) * Math.pow(x, 2 * n)) / Factorial.factorial(2 * n + 1);
            s += dif;
            n++;
        } while (Math.abs(dif) > EPS && n < 500);

        return s;
    }
}
