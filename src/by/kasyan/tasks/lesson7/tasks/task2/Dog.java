package by.kasyan.tasks.lesson7.tasks.task2;

public class Dog extends Animal {

    private final String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("собака.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("собака.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("собака.");
    }
}
