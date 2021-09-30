package by.kasyan.tasks.lesson7.task;

import java.util.Scanner;

public class MilitaryAir extends AirTransport {

    private final boolean catapult;
    private int numRocket;

    public MilitaryAir(int power, int speed, int weight, String model, double wingspan, int minRunwayLength, boolean catapult, int numRocket) {
        super(power, speed, weight, model, wingspan, minRunwayLength);
        this.catapult = catapult;
        this.numRocket = numRocket;
    }

    @Override
    public String toString() {
        return "Военный воздушный транспорт.\n" +
                super.toString() +
                "\nНаличие системы катапультирования: " + catapult +
                ", кол-во ракет на борту: " + numRocket + ".\n";
    }

    public void toFire() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество выстрелов: ");
        int numShot = in.nextInt();
        in.close();
        while (numShot > 0 && numRocket > 0) {
            System.out.println("Ракета пошла...");
            numRocket--;
            numShot--;
        }
        System.out.println("Боеприпасы отсутствуют.");
    }

    public void toCatapult() {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }
}
