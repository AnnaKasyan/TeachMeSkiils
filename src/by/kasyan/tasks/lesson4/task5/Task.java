package by.kasyan.tasks.lesson4.task5;

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

        System.out.println("Исходная матрица: ");
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = RANDOM.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Транспонированная матрица: ");
        int[][] trans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[i][j] = array[j][i];
                System.out.print(trans[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
