package by.kasyan.tasks.lesson4.task4;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы: ");
        int n;
        n = in.nextInt();
        in.close();

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = RANDOM.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 2 - i; j >= 0; j--) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов, стоящих над побочной матрицей не включительно, равна: " + sum);
    }
}
