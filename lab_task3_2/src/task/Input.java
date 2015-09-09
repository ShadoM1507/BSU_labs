package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    protected static double inputDouble() {
        double data;
        Scanner scan = new Scanner(System.in);

        try {
            data = scan.nextDouble();
            if(data <= 0)
                throw new InputNotPositive("Вы ввели не положительное число! Попробуйте снова: ");
        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            data = inputDouble();
        } catch (InputNotPositive e) {
            System.out.print(e.getMessage());
            data = inputDouble();
        }

        return data;
    }

    protected static int inputInt() {
        int data;
        Scanner scan = new Scanner(System.in);

        try {
            data = scan.nextInt();
            if(data < 2)
                throw new InputMismatchException();
        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            data = inputInt();
        }

        return data;
    }
}