package by.kasyan.tasks.lesson6.task1;

public class SonyLeg implements ILeg {

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
