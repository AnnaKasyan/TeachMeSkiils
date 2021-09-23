package by.kasyan.tasks.lesson6.task3;

import java.util.Random;

public class Shuttle implements IStart {

    public static final Random random = new Random();

    private boolean test = false;

    @Override
    public boolean test() {
        int password = random.nextInt(11);
        System.out.println("Password: " + password);
        if (password > 3) {
            test = true;
        }
        return true;
    }

    @Override
    public void engineStart() throws InterruptedException {
        System.out.println("Final countdown");
        Thread.sleep(1000);
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Shuttle's engine is started");
        Thread.sleep(2000);
        System.out.println("All systems are normal");
        Thread.sleep(2000);
    }

    @Override
    public void start() {
        System.out.println("Launch of the shuttle");
    }
}
