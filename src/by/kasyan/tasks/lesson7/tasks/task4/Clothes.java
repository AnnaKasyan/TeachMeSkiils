package by.kasyan.tasks.lesson7.tasks.task4;

public abstract class Clothes {

    Size size;
    double price;
    String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
