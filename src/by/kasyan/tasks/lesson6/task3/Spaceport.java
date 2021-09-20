package by.kasyan.tasks.lesson6.task3;

import java.util.Random;

public class Spaceport implements IStart {

    public static final Random random = new Random();

    private boolean test = false;

    @Override
    public boolean test() {
        int password = random.nextInt(11);
        System.out.println("Password: " + password);
        if (password > 3) {
            test = true;
        }
        if (!test) {
            System.out.println("Check failed");
        }
        return false;
    }

    @Override
    public void engineStart() throws InterruptedException {
        System.out.println("Final countdown");
        int i = 10;
        while (i > 0) {
            System.out.println("Remaining: " + i + " seconds");
            try {
                i--;
                Thread.sleep(1000L);
            } catch (InterruptedException ignored) {
            }
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
