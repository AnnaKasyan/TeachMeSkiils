package by.kasyan.tasks.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Classwork {

    public static final Random RANDOM = new Random(10);

    public static void main(String[] args) {
        int count = 0;
        int odd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел диапазон случайных чисел ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int randomNumber = RANDOM.nextInt(b - a + 1) + a;
            if (randomNumber % 2 == 0) {
                count += 1;
            } else {
                odd += 1;
            }
            System.out.println(randomNumber);
        }
        System.out.println("Количество четных чисел: " + count);
        System.out.println("Количество нечетных чисел: " + odd);
        scanner.close();
    }

}

