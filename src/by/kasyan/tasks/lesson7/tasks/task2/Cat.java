package by.kasyan.tasks.lesson7.tasks.task2;

public class Cat extends Animal {

    private final String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("кот.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("кот.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("кот.");
    }
}
