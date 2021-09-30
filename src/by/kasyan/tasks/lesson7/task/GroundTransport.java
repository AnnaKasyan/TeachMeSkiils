package by.kasyan.tasks.lesson7.task;

public class GroundTransport extends Transport {

    private final int numWheels;
    private final double fuelConsumption;


    public GroundTransport(int power, int speed, int weight, String model, int numWheels, double fuelConsumption) {
        super(power, speed, weight, model);
        this.numWheels = numWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nКоличество колёс: " + numWheels +
                ", расход топлива(л/100км): " + fuelConsumption + ".";
    }
}
