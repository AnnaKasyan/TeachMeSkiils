package by.kasyan.tasks.lesson3.additionalTasks.task8;

import java.util.Arrays;
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

        Arrays.sort(array);
        for (int i = 0; i < size; i++) {
        }
        System.out.println("Второй по величине элемент массива: " + array[size - 2]);
    }
}
