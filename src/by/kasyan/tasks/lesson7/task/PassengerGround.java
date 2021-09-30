package by.kasyan.tasks.lesson7.task;

import java.util.Scanner;

public class PassengerGround extends GroundTransport {

    private final String bodyType;
    private final int numPassenger;

    public PassengerGround(int power, int speed, int weight, String model, int numWheels, double fuelConsumption, String bodyType, int numPassenger) {
        super(power, speed, weight, model, numWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numPassenger = numPassenger;
    }

    @Override
    public String toString() {
        return "Пассажирский наземный транспорт.\n" +
                super.toString() +
                "\nТип кузова: " + bodyType + '\'' +
                ", кол-во пассажиров: " + numPassenger + ".\n";
    }

    public void calculatingLengthRoad() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время движения легкового автомобиля в часах: ");
        int time = in.nextInt();
        in.close();
        double distance = time * getSpeed();
        double fuel = this.calculatingFuelConsumption(time * getSpeed());
        System.out.println("За время " + time + " ч, автомобиль " + getModel() + ", двигаясь с максимальной скоростью " + getSpeed() + " км/ч проедет " +
                distance + " км  и израсходует " + fuel + " литров топлива.");
    }

    private double calculatingFuelConsumption(double distance) {
        return getFuelConsumption() / 100 * distance;
    }
}


