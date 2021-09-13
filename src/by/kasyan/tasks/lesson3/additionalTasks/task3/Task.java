package by.kasyan.tasks.lesson3.additionalTasks.task3;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size;
        size = in.nextInt();
        System.out.println("Введите число С: ");
        int C;
        C = in.nextInt();
        in.close();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(10000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int num = 0;
        double average;
        for (int i = 0; i < size; i++) {
            if (array[i] > C) {
                num++;
                sum += array[i];
            }
        }
        System.out.println("Количество элементов, превосходящих число С: " + num);
        System.out.println("Сумма элементов, превосходящих число С: " + sum);
        average = (double) sum / num;
        System.out.println("Среднее арифметическое элементов, превосходящих число С: " + average);
    }
}
