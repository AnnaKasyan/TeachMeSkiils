package by.kasyan.tasks.lesson7.tasks.task1;

public class SportCar extends Car {

    private final int maxSpeed;

    public SportCar(String model, String classCar, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, classCar, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nМаксимальная скорость: " + maxSpeed + " км/ч.";
    }
}
