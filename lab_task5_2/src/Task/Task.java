package Task;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scan = new Scanner(System.in);
        int n;
        int k;
        int min;
        int max;

        Input in = new Input();

        System.out.print("Введите порядок матрицы: ");
        while(true) {
            n = in.readInt(scan);

            if(n > 0) {
                break;
            } else {
                System.out.print("Порядок матрицы не может быть не положительным числом! Попробуйте снова: ");
            }
        }

        System.out.print("Введите нижнюю границу значений элементов матрицы: ");
        min = in.readInt(scan);

        System.out.print("Введите верхнюю границу значений элементов матрицы: ");
        while (true) {
            max = in.readInt(scan);

            if(max >= min) {
                break;
            } else {
                System.out.print("Верхняя граница значений не может быть меньше нижней границы! Попробуйте снова: ");
            }
        }

        int matrix[][] = task.getRandomMatrix(n, min, max);

        System.out.println("Сгенерированная матрица:");
        task.showMatrix(matrix);

        System.out.print("\nВведите номер слоя, который хотите перевернуть: ");
        while (true) {
            k = in.readInt(scan);

            if(k <= ((n % 2 == 0) ? n / 2 : n / 2 + 1) && k > 0) {
                break;
            } else {
                System.out.print("В матрице нет такого слоя! Попробуйте снова: ");
            }
        }
        scan.close();

        task.flipLayerMatrix(matrix, k);

        System.out.println("Преобразованная матрица:");
        task.showMatrix(matrix);
    }

    public int[][] getRandomMatrix(int n, int min, int max) {
        int matrix[][] = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = min + (int)(Math.random() * ((max - min) + 1));
            }
        }

        return matrix;
    }

    public void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void flipLayerMatrix(int[][] matrix, int k) {
        int n = matrix.length;

        for (int i = k - 1; i < n - k; i++) {
            int tmp = matrix[k - 1][i];
            matrix[k - 1][i] = matrix[n - i - 1][k - 1];
            matrix[n - i - 1][k - 1] = matrix[n - k][n - i - 1];
            matrix[n - k][n - i - 1] = matrix[i][n - k];
            matrix[i][n - k] = tmp;
        }

    }
}
