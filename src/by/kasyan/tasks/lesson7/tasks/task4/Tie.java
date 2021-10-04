package by.kasyan.tasks.lesson7.tasks.task4;

public class Tie extends Clothes implements MenClothing {

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Put on a tie");
    }
}
