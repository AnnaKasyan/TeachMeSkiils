package by.kasyan.tasks.lesson6.task2;

public class Person implements IPerson {

    private String name;
    private Jacket jacket;
    private Shoes shoes;
    private Pants pants;

    public Person(String name, Jacket jacket, Shoes shoes, Pants pants) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }


    @Override
    public void putOn() {
        System.out.print(name + " put on ");
        pants.putOn();
        System.out.print(",");
        shoes.putOn();
        System.out.print(",");
        jacket.putOn();
        System.out.println(".");
    }

    @Override
    public void takeOff() {
        System.out.print(name + " took off ");
        jacket.takeOff();
        System.out.print(",");
        shoes.takeOff();
        System.out.print(",");
        pants.takeOff();
        System.out.print(".");
    }
}


