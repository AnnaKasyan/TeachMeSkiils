package by.kasyan.tasks.lesson3.additionalTasks.task2;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size;
        size = in.nextInt();
        in.close();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int num = 0;
        double average;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                num++;
                sum += array[i];
            }
        }
        System.out.println("Колчество элементов с нечетными номерами: " + num);
        System.out.println("Сумма элементов с нечетными номерами: " + sum);
        average = (double) sum / num;
        System.out.println("Среднее арифметическое элементов с нечетными номерами: " + average);
    }
}
