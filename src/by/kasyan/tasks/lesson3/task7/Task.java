package by.kasyan.tasks.lesson3.task7;

import java.util.Arrays;
import java.util.Random;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Integer[] array = new Integer[12];

        for (int i = 0; i < 12; i++) {
            array[i] = RANDOM.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        int max = array[0];
        for (int i = 0; i < 12; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.print("Индекс (последнего вхождения в массив) максимального элемента массива: ");
        System.out.println(Arrays.asList(array).indexOf(max));

        for (int i = 0; i < 12; i++) {
            if (array[i] == max) {
                System.out.println("Индекс (последнего вхождения в массив) максимального элемента массива (другой способ нахождения): " + i);
                break;
            }
        }
    }
}
