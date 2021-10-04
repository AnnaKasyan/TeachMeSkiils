package by.kasyan.tasks.lesson7.tasks.task4;

public class TeeShirt extends Clothes implements MenClothing, WomenClothing {

    public TeeShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Put on a men's t-shirt");
    }

    @Override
    public void dressWomen() {
        System.out.println("Put on a women's t-shirt");
    }
}
