package task;

public class Task {
    public static void main(String[] args) {
        String str;
        int n = 0;
        int start = -1;
        int max = 1;
        int maxStart = 0;
        int maxEnd = 1;

        System.out.print("Введите строку: ");
        str = Input.inputLine();

        for(int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1) + 1) {
                if(start == -1)
                    start = i -1;

                n++;
            }
            else if (n > 0) {
                if (n > max) {
                    max = n;
                    maxStart = start;
                    maxEnd = i;
                    n = 0;
                    start = -1;
                }
            }
        }

        if  (n > max) {
            maxStart = start;
            maxEnd = str.length();
        }

        System.out.println(str.substring(maxStart, maxEnd));
    }
}
