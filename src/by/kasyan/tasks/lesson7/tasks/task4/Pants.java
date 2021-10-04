package by.kasyan.tasks.lesson7.tasks.task4;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Put on men's pants");
    }

    @Override
    public void dressWomen() {
        System.out.println("Put on women's pants");
    }
}
