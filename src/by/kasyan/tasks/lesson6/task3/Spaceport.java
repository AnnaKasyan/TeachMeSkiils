package by.kasyan.tasks.lesson6.task3;

public class Spaceport {

    void launch(IStart shuttle) throws InterruptedException {
        if (shuttle.test()) {
            shuttle.engineStart();
            shuttle.start();
        } else {
            System.out.println("Check failed");
        }
    }
}
