package task;

import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        String str;
        Stack<String> s = new Stack<String>();

        System.out.print("Введите строку: ");
        str = Input.inputLine();

        int start = 0;
        int end = str.indexOf(" ");
        while(true) {
            if (end == -1) {
                s.push(str.substring(start, str.length()));
                break;
            }
            s.push(str.substring(start, end));

            start = end + 1;
            end = str.indexOf(" ", start);
        }

        while(!s.isEmpty())
            System.out.print(s.pop() + " ");
    }
}
