package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    protected static double inputDouble() {
        double data;
        Scanner scan = new Scanner(System.in);

        try {
            data = scan.nextDouble();
            if(data == 0)
                throw new InputZeroException("Введён ноль! Попробуйте снова: ");
        } catch(InputMismatchException e) {
            System.out.print("Неверный ввод! Попробуйте снова: ");
            data = inputDouble();
        } catch (InputZeroException e) {
            System.out.print(e.getMessage());
            data = inputDouble();
        }

        return data;
    }
}
