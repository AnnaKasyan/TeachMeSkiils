package by.kasyan.tasks.lesson4.task3;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы: ");
        int n = in.nextInt();
        in.close();

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = RANDOM.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int productMainDiagonal = 1;
        int productSecondaryDiagonal = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    productMainDiagonal *= array[i][j];
                }
            }
            for (int j = n - 1 - i; j >= 0; j--) {
                productSecondaryDiagonal *= array[i][j];
                break;
            }
        }
        System.out.println("Прозведение элементов главной диагонали: " + productMainDiagonal);
        System.out.println("Произведение элементов побочной диагонали: " + productSecondaryDiagonal);

        if (productMainDiagonal > productSecondaryDiagonal) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else if (productMainDiagonal < productSecondaryDiagonal) {
            System.out.println("Произведение элементов побочной диагонали больше");
        } else {
            System.out.println("Произведение элементов главной диагонали равно произведению побочной диагонали");
        }
    }
}
