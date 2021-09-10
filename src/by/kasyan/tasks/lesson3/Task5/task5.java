package by.kasyan.tasks.lesson3.Task5;

import java.util.Random;

public class task5 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        double avgFirstArray;
        double avgSecondArray;
        int sumFirstArray = 0;
        int sumSecondArray = 0;
        System.out.print("Первый массив: ");
        for (int i = 0; i < 5; i++) {
            int firstArray = RANDOM.nextInt(15 - 0 + 1) + 0;
            sumFirstArray += firstArray;
            System.out.print(firstArray + " ");
        }
        System.out.println(" ");
        System.out.print("Второй массив: ");
        for (int i = 0; i < 5; i++) {
            int secondArray = RANDOM.nextInt(15 - 0 + 1) + 0;
            sumSecondArray += secondArray;
            System.out.print(secondArray + " ");
        }
        avgFirstArray = (double) sumFirstArray / 5;
        avgSecondArray = (double) sumSecondArray / 5;
        System.out.println(" ");
        System.out.println("Среднее арифметическое первого массива: " + avgFirstArray);
        System.out.println("Среднее арифметическое второго массива: " + avgSecondArray);
        if (avgFirstArray < avgSecondArray) {
            System.out.println("Среднее арифметическое второго массива больше.");
        } else {
            System.out.println("Среднее арифметическое первого массива больше");
        }
    }
}
