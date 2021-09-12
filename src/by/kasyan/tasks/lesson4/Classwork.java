package by.kasyan.tasks.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Classwork {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n;
        n = in.nextInt();
        int mass[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = RANDOM.nextInt(50 - 0 + 1) + 0;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (mass[i][j] % 2 == 0) {
                        sum += mass[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма четных элементов на главной диагонале равна: " + sum);
    }

}
