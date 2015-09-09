package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    protected static double inputDouble() {
        double data;
        Scanner scan = new Scanner(System.in);

        try {
            data = scan.nextDouble();

        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            data = inputDouble();
        }

        return data;
    }
}
