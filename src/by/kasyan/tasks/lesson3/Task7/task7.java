package by.kasyan.tasks.lesson3.Task7;

import java.util.Arrays;
import java.util.Random;

public class task7 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Integer array[] = new Integer[12];

        for (int i = 0; i < 12; i++) {
            array[i] = RANDOM.nextInt(15 - 0 + 1) + 0;
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
    }
}
