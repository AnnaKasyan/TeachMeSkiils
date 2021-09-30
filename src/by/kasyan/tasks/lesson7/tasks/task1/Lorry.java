package by.kasyan.tasks.lesson7.tasks.task1;

public class Lorry extends Car {

    private final int carrying;

    public Lorry(String model, String classCar, int weight, Driver driver, Engine engine, int carrying) {
        super(model, classCar, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nГрузоподъемность: " + carrying + " кг.";
    }
}
