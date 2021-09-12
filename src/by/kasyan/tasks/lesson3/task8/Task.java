package by.kasyan.tasks.lesson3.task8;

import java.util.Random;

public class Task {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];
        int wholeNumbers = 0;

        System.out.print("Первый массив: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = RANDOM.nextInt(9 - 0 + 1) + 0;
            System.out.print(firstArray[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Второй массив: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = RANDOM.nextInt(9 - 0 + 1) + 0;
            System.out.print(secondArray[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Третий массив: ");
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (double) firstArray[i] / secondArray[i];
            System.out.print(thirdArray[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] % 1 == 0) {
                wholeNumbers++;
            }
        }
        System.out.println("Количество целых элементов в третьем массиве: " + wholeNumbers);
    }
}
