package by.kasyan.tasks.lesson3.task5;

import java.util.Random;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int sumFirstArray = 0;
        System.out.print("Первый массив: ");
        for (int i = 0; i < 5; i++) {
            int firstArray = RANDOM.nextInt(15 - 0 + 1) + 0;
            sumFirstArray += firstArray;
            System.out.print(firstArray + " ");
        }
        System.out.println();

        int sumSecondArray = 0;
        System.out.print("Второй массив: ");
        for (int i = 0; i < 5; i++) {
            int secondArray = RANDOM.nextInt(15 - 0 + 1) + 0;
            sumSecondArray += secondArray;
            System.out.print(secondArray + " ");
        }
        System.out.println();

        double avgFirstArray = (double) sumFirstArray / 5;
        double avgSecondArray = (double) sumSecondArray / 5;
        System.out.println("Среднее арифметическое первого массива: " + avgFirstArray);
        System.out.println("Среднее арифметическое второго массива: " + avgSecondArray);
        if (avgFirstArray < avgSecondArray) {
            System.out.println("Среднее арифметическое второго массива больше.");
        } else if (avgFirstArray > avgSecondArray) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else {
            System.out.println("Среднее арифметическое первого массива и среднее арифметическое второго массива одинаковы ");
        }

    }
}
