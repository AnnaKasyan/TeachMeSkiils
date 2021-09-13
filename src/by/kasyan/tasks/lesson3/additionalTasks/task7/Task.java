package by.kasyan.tasks.lesson3.additionalTasks.task7;

import java.util.Random;
import java.util.Scanner;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size;
        size = in.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(10000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Введите значение элемента: ");
        int x;
        x = in.nextInt();
        in.close();

        int num = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                num++;
            }
        }
        System.out.println("Элемент с заданным значением встречается: " + num + " раз.");
    }
}
