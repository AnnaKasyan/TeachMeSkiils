package by.kasyan.tasks.lesson3.Task10;

import java.util.Random;
import java.util.Scanner;

public class task10 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int n = 0;
        int evenNumber = 0;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите целое число, которое больше 3: ");
            if (in.hasNextInt()) {
                n = in.nextInt();
            } else {
                System.out.println("Введено неверное число");
            }
        }
        while (n < 4);

        System.out.println(" ");
        System.out.print("Первый массив: ");

        int firstArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = RANDOM.nextInt(n - 0 + 1) + 0;
            System.out.print(firstArray[i] + " ");
            if (firstArray[i] % 2 == 0 & firstArray[i] != 0) {
                evenNumber++;
            }
        }
        System.out.println(" ");

        if (evenNumber > 0) {
            System.out.print("Второй массив: ");
            int secondArray[] = new int[evenNumber];
            for (int i = 0, j = 0; i < n; i++) {
                if (firstArray[i] % 2 == 0 & firstArray[i] != 0) {
                    secondArray[j] = firstArray[i];
                    System.out.print(secondArray[j] + " ");
                }
            }
        }
    }
}
