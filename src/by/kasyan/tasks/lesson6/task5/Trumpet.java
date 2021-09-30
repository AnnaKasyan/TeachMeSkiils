package by.kasyan.tasks.lesson6.task5;

public class Trumpet implements Instrument {

    private final String diameter;

    public Trumpet(String diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter + ".");
    }
}
