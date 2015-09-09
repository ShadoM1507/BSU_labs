package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    protected static int inputInt() {
        int data;
        Scanner scan = new Scanner(System.in);

        try {
            data = scan.nextInt();

        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            data = inputInt();
        }

        return data;
    }
}