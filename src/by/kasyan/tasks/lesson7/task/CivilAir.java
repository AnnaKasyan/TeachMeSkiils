package by.kasyan.tasks.lesson7.task;

import java.util.Scanner;

public class CivilAir extends AirTransport {

    private final int numPassenger;
    private final boolean businessClass;

    public CivilAir(int power, int speed, int weight, String model, double wingspan, int minRunwayLength, int numPassenger, boolean businessClass) {
        super(power, speed, weight, model, wingspan, minRunwayLength);
        this.numPassenger = numPassenger;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Гражданский воздушный транспорт.\n" +
                super.toString() +
                "\nКол-во пассажиров: " + numPassenger +
                ", наличие бизнес класса: " + businessClass + ".\n";
    }

    public void calculatingCapacity() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пассажиров: ");
        int passengers = in.nextInt();
        in.close();
        if (passengers < numPassenger) {
            System.out.println("В самолете есть свободные места.");
        } else if (passengers == numPassenger) {
            System.out.println("Самолет загружен полностью");
        } else {
            System.out.println("Пассажиров больше, чем мест в самолете.");
        }
    }
}
