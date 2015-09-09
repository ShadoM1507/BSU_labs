package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    protected static String inputLine() {
        String str = new String();
        Scanner scan = new Scanner(System.in);

        try {
            str = scan.nextLine();

        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            str = inputLine();
        }

        return str;
    }
}
