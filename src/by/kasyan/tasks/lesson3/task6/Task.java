package by.kasyan.tasks.lesson3.task6;

import java.util.Random;

public class Task {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int[] array = {1, 8, 3, 4};

        boolean order = false;
        for (int i = 1; i < array.length; i++) {
            if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
                order = true;
            }
        }
        if (order) {
            System.out.println("Массив является строго возрастающей последовательностью ");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью ");
        }
    }
}
