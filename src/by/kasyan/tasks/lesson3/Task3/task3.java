package by.kasyan.tasks.lesson3.Task3;

import java.util.Random;

public class task3 {

    public static final Random RANDOM = new Random(15);

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 15; i++) {
            int randomNumber = RANDOM.nextInt(99 - 0 + 1) + 0;
            if (randomNumber % 2 == 0) {
                count += 1;
            }
            System.out.print(randomNumber + " ");
        }
        System.out.println(" ");
        System.out.println("Количество четных чисел: " + count);

    }
}
