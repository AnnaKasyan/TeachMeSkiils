package by.kasyan.tasks.lesson6.task3;

import java.util.Scanner;

public class SpaceX implements IStart {

    private boolean test = false;

    @Override
    public boolean test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You must enter the password: ");
        int password = scanner.nextInt();
        scanner.close();
        if (password == 123) {
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
