package by.kasyan.tasks.lesson3.task6;

import java.util.Random;

public class Task {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Integer array[] = new Integer[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(10 - 0 + 1) + 0;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i++]) {
                System.out.println("Массив является строго возрастающей последовательностью ");
                break;
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью ");
                break;
            }
        }

    }
}
