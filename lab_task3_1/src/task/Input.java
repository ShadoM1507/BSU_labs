package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public int readInt(Scanner scan) {
        int data;

        try {
            data = scan.nextInt();

        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            scan.next();
            data = readInt(scan);
        }

        return data;
    }
}