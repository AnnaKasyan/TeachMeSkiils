package by.kasyan.tasks.lesson4.task3;

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

        int product_main_diagonal = 1;
        int product_secondary_diagonal = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    product_main_diagonal *= array[i][j];
                }
            }
            for (int j = n - 1 - i; j >= 0; j--) {
                product_secondary_diagonal *= array[i][j];
                break;
            }
        }
        System.out.println("Прозведение элементов главной диагонали: " + product_main_diagonal);
        System.out.println("Произведение элементов побочной диагонали: " + product_secondary_diagonal);

        if (product_main_diagonal > product_secondary_diagonal) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else if (product_main_diagonal < product_secondary_diagonal) {
            System.out.println("Произведение элементов побочной диагонали больше");
        } else {
            System.out.println("Произведение элементов главной диагонали равно произведению побочной диагонали");
        }
    }
}
