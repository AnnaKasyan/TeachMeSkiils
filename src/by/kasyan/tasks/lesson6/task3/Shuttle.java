package by.kasyan.tasks.lesson6.task3;

public class Shuttle implements IStart {

    @Override
    public boolean test() {
        return false;
    }

    @Override
    public void engineStart() {

    }

    @Override
    public void start() {
        System.out.println("Launch of the shuttle");
    }
}
