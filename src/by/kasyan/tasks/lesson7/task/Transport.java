package by.kasyan.tasks.lesson7.task;

public class Transport {

    private final int power;
    private final int speed;
    private final int weight;
    private final String model;

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public double powerConversion() {
        return power * 0.74;
    }

    @Override
    public String toString() {
        return "Мощность(в лошадиных силах): " + power +
                ", мощность(в кВ): " + powerConversion() +
                ", максимальная скорость(км/ч): " + speed +
                ", масса (кг): " + weight +
                ", модель: " + model + ".";
    }
}
