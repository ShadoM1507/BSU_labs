package task;

import java.util.Vector;

public class Task {
    static final int N = 10;
    static final int V_MIN = -5;
    static final int V_MAX = 10;

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(N);
        int min;
        int min2;
        int max;
        int max2;
        int nMin;
        int nMin2;
        int nMax;
        int nMax2;

        for(int i = 1; i <= N; i++)
            v.add(V_MIN + (int)(Math.random() * ((V_MAX - V_MIN) + 1)));

        System.out.println("Сгенерированный вектор: " + v + "\n");

        if(v.get(0) < v.get(1)) {
            min = v.get(0);
            min2 = v.get(1);
            nMin = 0;
            nMin2 = 1;

            max = v.get(1);
            max2 = v.get(0);
            nMax = 1;
            nMax2 = 0;
        }
        else {
            min = v.get(1);
            min2 = v.get(0);
            nMin = 1;
            nMin2 = 0;

            max = v.get(0);
            max2 = v.get(1);
            nMax =0;
            nMax2 = 1;
        }

        for (int i = 2; i < N - 1; i++) {
            if (v.get(i) < min) {
                min2 = min;
                nMin2 = nMin;
                min = v.get(i);
                nMin = i;
            }
            else if(v.get(i) < min2 && v.get(i) != min) {
                min2 = v.get(i);
                nMin2 = i;
            }

            if(v.get(i) > max) {
                max2 = max;
                nMax2 = nMax;
                max = v.get(i);
                nMax = i;
            }
            else if(v.get(i) > max2 && v.get(i) != max) {
                max2 = v.get(i);
                nMax2 = i;
            }
        }

        if(min == max)
            System.out.println("Таких элементов не существует");
        else {
            System.out.println("min2 = " + min2 + "  nMin2 = " + (nMin2 + 1));
            System.out.println("max2 = " + max2 + "  nMax2 = " + (nMax2 + 1));

            flip(v, nMin2, nMax2);

            System.out.println("Преобразованный вектор: " + v);
        }
    }

    private static void flip(Vector<Integer> v, int start, int end) {
        if (start > end) {
            start += end;
            end = start - end;
            start -= end;
        }

        start++;
        end--;

        for (int i = 0; i < (end - start) / 2; i++) {
            Integer t = v.get(start + i);
            v.set(start + i, v.get(end - i));
            v.set(end - i, t);
        }
    }
}
