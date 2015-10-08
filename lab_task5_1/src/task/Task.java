package task;

import java.util.Scanner;
import java.util.Vector;

public class Task {
    private int min;
    private int min2;
    private int max;
    private int max2;
    private int nMin;
    private int nMin2;
    private int nMax;
    private int nMax2;

    public static void main(String[] args) {
        Task task = new Task();
        Scanner scan = new Scanner(System.in);
        int n;
        int v_min;
        int v_max;

        Input in = new Input();

        System.out.print("Введите кол-во элементов в векторе: ");
        while(true) {
            n = in.readInt(scan);

            if(n > 0) {
                break;
            } else {
                System.out.print("Кол-во элементов не может быть не положительным числом! Попробуйте снова: ");
            }
        }

        System.out.print("Введите нижнюю границу значений элементов вектора: ");
        v_min = in.readInt(scan);

        System.out.print("Введите верхнюю границу значений элементов вектора: ");
        while (true) {
            v_max = in.readInt(scan);

            if(v_max < v_min) {
                System.out.print("Верхняя граница значений не может быть меньше нижней границы! Попробуйте снова: ");
                continue;
            }

            break;
        }

        Vector<Integer> v = new Vector<Integer>(n);

        for(int i = 1; i <= n; i++)
            v.add(v_min + (int)(Math.random() * ((v_max - v_min) + 1)));

        System.out.println("Сгенерированный вектор: " + v + "\n");

        task.search2(v, n);

        if(task.getMin() == task.getMax())
            System.out.println("Таких элементов не существует");
        else {
            System.out.println("min2 = " + task.getMin2() + "  nMin2 = " + (task.getnMin2() + 1));
            System.out.println("max2 = " + task.getMax2() + "  nMax2 = " + (task.getnMax2() + 1));

            task.flip(v, task.getnMin2(), task.getnMax2());

            System.out.println("Преобразованный вектор: " + v);
        }
    }

    private void search2(Vector<Integer> v, int n) {
        if(v.get(0) < v.get(1)) {
            setMin(v.get(0), 0);
            setMin2(v.get(1), 1);
            setMax(v.get(1), 1);
            setMax2(v.get(0), 0);
        }
        else {
            setMin(v.get(1), 1);
            setMin2(v.get(0), 0);
            setMax(v.get(0), 0);
            setMax2(v.get(1), 1);
        }

        for (int i = 2; i < n; i++) {
            if (v.get(i) < min) {
                setMin2(min, nMin);
                setMin(v.get(i), i);
            }
            else if(v.get(i) < min2 && v.get(i) != min) {
                setMin2(v.get(i), i);
            }

            if(v.get(i) > max) {
                setMax2(max, nMax);
                setMax(v.get(i), i);
            }
            else if(v.get(i) > max2 && v.get(i) != max) {
                setMax2(v.get(i), i);
            }
        }
    }

    private void flip(Vector<Integer> v, int start, int end) {
        if (start > end) {
            start += end;
            end = start - end;
            start -= end;
        }

        start++;
        end--;

        for (int i = 0; i <= (end - start) / 2; i++) {
            Integer t = v.get(start + i);
            v.set(start + i, v.get(end - i));
            v.set(end - i, t);
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min, int nMin) {
        this.min = min;
        this.nMin = nMin;
    }

    public int getMin2() {
        return min2;
    }

    public void setMin2(int min2, int nMin2) {
        this.min2 = min2;
        this.nMin2 = nMin2;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max, int nMax) {
        this.max = max;
        this.nMax = nMax;
    }

    public int getMax2() {
        return max2;
    }

    public void setMax2(int max2, int nMax2) {
        this.max2 = max2;
        this.nMax2 = nMax2;
    }

    public int getnMin2() {
        return nMin2;
    }

    public int getnMax2() {
        return nMax2;
    }

}

