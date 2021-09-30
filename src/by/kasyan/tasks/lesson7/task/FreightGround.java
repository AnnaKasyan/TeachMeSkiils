package by.kasyan.tasks.lesson7.task;

import java.util.Scanner;

public class FreightGround extends GroundTransport {

    private final double carrying;

    public FreightGround(int power, int speed, int weight, String model, int numWheels, double fuelConsumption, double carrying) {
        super(power, speed, weight, model, numWheels, fuelConsumption);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Грузовой наземный транспорт.\n" +
                super.toString() +
                "\nГрузоподъёмность(т): " + carrying + ".\n";
    }

    public void loading() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массу груза в тоннах: ");
        double weightCargo = in.nextDouble();
        in.close();
        if (weightCargo < carrying) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }


}
