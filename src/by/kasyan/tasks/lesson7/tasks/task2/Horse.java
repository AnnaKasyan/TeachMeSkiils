package by.kasyan.tasks.lesson7.tasks.task2;

public class Horse extends Animal {

    private final int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("конь.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("конь.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("конь.");
    }
}
