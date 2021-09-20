package by.kasyan.tasks.lesson6.task1;

public class Robot implements IRobot {

    private IHand hand;
    private IHead head;
    private ILeg leg;

    public Robot(IHand hand, IHead head, ILeg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        hand.upHand();
        head.speak();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        System.out.println("Стоимость робота: " + price);
        return price;
    }
}
