package by.kasyan.tasks.lesson6.classwork;

public class Telegram implements Application, Messenger {
    @Override
    public void turnOn() {
        System.out.println("Telegram turned on");
    }

    @Override
    public void tornOff() {
        System.out.println("Telegram turned off");
    }

    @Override
    public void sendMessenger() {
        System.out.println("Send message by Telegram");
    }

    @Override
    public void getMessenger() {
        System.out.println("Getting message from Telegram");
    }
}
