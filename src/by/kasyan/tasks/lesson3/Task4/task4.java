package by.kasyan.tasks.lesson3.Task4;

import java.util.Random;

public class task4 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(20 - 0 + 1) + 0;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
