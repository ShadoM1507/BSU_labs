package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public Input() {
    }

    public double readDouble(Scanner scan) {
        double data;

        try {
            data = scan.nextDouble();
            if(data <= 0) {
                throw new InputNotPositive("Вы ввели не положительное число! Попробуйте снова: ");
            }
        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            scan.next();
            data = readDouble(scan);
        } catch (InputNotPositive e) {
            System.out.print(e.getMessage());
            data = readDouble(scan);
        }

        return data;
    }

    public int readInt(Scanner scan) {
        int data;

        try {
            data = scan.nextInt();
            if(data < 2) {
                System.out.print("Введённое вами число не соответсвует установленым границам. Попробуйте снова: ");
                data = readInt(scan);
            }
        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            scan.next();
            data = readInt(scan);
        }

        return data;
    }
}