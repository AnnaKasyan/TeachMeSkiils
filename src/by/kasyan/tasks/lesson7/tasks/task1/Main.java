package by.kasyan.tasks.lesson7.tasks.task1;

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Петров", "А.А.", 12);
        Driver driver2 = new Driver("Сидоров", "В.В.", 5);
        Driver driver3 = new Driver("Cмирнова", "И.И.", 30);
        Engine engine1 = new Engine("113 л.с.", "1598 куб.см");
        Engine engine2 = new Engine("413 л.с.", "2979 куб.см");
        Engine engine3 = new Engine("82 л.с.", "4.75 л");
        Car car1 = new Car("Renault Logan", "B", 1545, driver1, engine1);
        Car car2 = new SportCar("BMW M4", "S", 2040, driver2, engine2, 250);
        Car car3 = new Lorry("МТЗ-80", "-", 3600, driver3, engine3, 3200);

        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();
        System.out.println("--------------");
        System.out.println(car1);
        System.out.println("--------------");
        System.out.println(car2);
        System.out.println("--------------");
        System.out.println(car3);
    }
}
