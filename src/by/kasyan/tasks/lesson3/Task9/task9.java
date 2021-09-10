package by.kasyan.tasks.lesson3.Task9;

import java.util.Random;
import java.util.Scanner;

public class task9 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int sumRight = 0;
        int sumLeft = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное целое число: ");
        if (in.hasNextInt()) {
            int size = in.nextInt();
            int array[] = new int[size];
            System.out.print("Массив: ");
            for (int i = 0; i < size; i++) {
                array[i] = RANDOM.nextInt(15 - 0 + 1) + 0;
                sum += array[i];
                System.out.print(array[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i < array.length / 2; i++) {
                sumLeft += array[i];
            }
            sumRight = sum - sumLeft;
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
        in.close();
    }
}
