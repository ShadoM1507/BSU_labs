package task;

public class Task {
    public static void main(String[] args) {
        double x;
        double a;
        double b;
        double c;

        System.out.print("Введите x, отличный от нуля: ");
        x = Input.inputDouble();

        a = Math.pow(3, 0.25) - Math.pow(Math.sqrt(3) / 2, 2/3) * Math.cos(x);
        b = Math.sin(3.2 * Math.pow(Math.E, 3 / 2)  * Math.pow(10, -5)
                + 5.1 * Math.pow(3.1, -3) * Math.pow(Math.E, 3 / x));
        c = Math.log10(0.2 * a * Math.cos(3.1 * x)) + Math.log(Math.pow(Math.E, 3/2) + Math.sin(x));

        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

