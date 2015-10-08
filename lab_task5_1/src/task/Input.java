package task;

import java.util.Scanner;

public class Input {
    public int readInt(Scanner scan) {
        Integer data;

        while(true) {
            if(scan.hasNextInt()) {
                data = scan.nextInt();
                break;
            } else {
                System.out.print("Неверный ввод! Попробуйте снова: ");
                scan.next();
            }
        }

        return data;
    }
}
