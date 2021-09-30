package by.kasyan.tasks.lesson7.tasks.task1;

public class Car {

    private final String model;
    private final String classCar;
    private final int weight;
    private final Driver driver;
    private final Engine engine;


    public Car(String model, String classCar, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.classCar = classCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали! ");
    }

    public void stop() {
        System.out.println("Останавливаемся. ");
    }

    public void turnRight() {
        System.out.println("Поворот направо. ");
    }

    public void turnLeft() {
        System.out.println("Поворот налево ");
    }


    @Override
    public String toString() {
        return "Модель ТС: '" + model + '\'' +
                ", класс: '" + classCar + '\'' +
                ", вес: " + weight + " кг. \n" +
                "Мощность двигателя: " + engine.getPower() +
                ", производительность двигателя: " + engine.getPerformance() +
                "\nФИО водителя: " + driver.getSurName() +
                " " + driver.getName() +
                ", стаж вождения: " + driver.getExperience() + " лет.";

    }
}
