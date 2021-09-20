package by.kasyan.tasks.lesson6.classwork;

public class Viber implements Application, Messenger {
    @Override
    public void turnOn() {
        System.out.println("Viber turned on");
    }

    @Override
    public void tornOff() {
        System.out.println("Viber turned off");
    }

    @Override
    public void sendMessenger() {
        System.out.println("Send message by Viber");
    }

    @Override
    public void getMessenger() {
        System.out.println("Getting message from Viber");
    }
}
