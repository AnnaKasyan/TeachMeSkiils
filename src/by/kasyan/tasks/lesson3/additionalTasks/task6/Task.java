package by.kasyan.tasks.lesson3.additionalTasks.task6;

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
            array[i] = RANDOM.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int num = array[0];
        boolean cycle = true;
        for (int i = 0; i < size; i++) {
            if (array[i] > num ^ array[i] < num) {
                cycle = false;
                break;
            }
        }
        if (cycle) {
            System.out.println("Элементы массива равны");
        } else {
            System.out.println("Элементы массива различны");
        }
    }
}
