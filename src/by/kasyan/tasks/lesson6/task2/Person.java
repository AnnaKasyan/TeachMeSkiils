package by.kasyan.tasks.lesson6.task2;

public class Person implements Jacket, Pants, Shoes {

    private String name;
    private String jacket;
    private String shoes;
    private String pants;

    public Person(String name, String jacket, String pants, String shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Person() {
        name = "Person";
        jacket = "jacket";
        pants = "pants";
        shoes = "shoes";
    }

    @Override
    public void putOn() {
        System.out.println(name + " put on " + pants + ", " + shoes + ", " + jacket + ".");
    }

    @Override
    public void takeOff() {
        System.out.println(name + " took of " + jacket + ", " + shoes + ", " + pants + ".");
    }
}
