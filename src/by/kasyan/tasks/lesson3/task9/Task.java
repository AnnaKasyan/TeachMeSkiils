package by.kasyan.tasks.lesson3.task9;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное целое число: ");
        if (in.hasNextInt()) {
            int size = in.nextInt();
            if (size > 0) {

                int[] array = new int[size];
                int sum = 0;
                System.out.print("Массив: ");
                for (int i = 0; i < size; i++) {
                    array[i] = RANDOM.nextInt(16);
                    sum += array[i];
                    System.out.print(array[i] + " ");
                }
                System.out.println();

                int sumLeft = 0;
                for (int i = 0; i < array.length / 2; i++) {
                    sumLeft += array[i];
                }

                int sumRight = sum - sumLeft;
                if (sumLeft < sumRight) {
                    System.out.println("Сумма правой половины массива больше суммы левой половины массива");
                } else if (sumLeft > sumRight) {
                    System.out.println("Сумма левой половины массива больше суммы правой половины массива");
                } else {
                    System.out.println("Сумма левой половины массива равна сумме правой половины массива");
                }

            } else {
                System.out.println("Введено неверное число");
            }
        } else {
            System.out.println("Введено неверное число");
        }
        in.close();
    }
}
