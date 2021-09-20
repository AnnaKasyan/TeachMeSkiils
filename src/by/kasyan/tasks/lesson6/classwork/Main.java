package by.kasyan.tasks.lesson6.classwork;

public class Main {
    public static void main(String[] args) {

        Telegram telegram = new Telegram();
        Viber viber = new Viber();
        SmartPhone smartPhoneWithViber = new SmartPhone(viber);
        SmartPhone smartPhoneWithTelegram = new SmartPhone(telegram);
        Client clientWithViber = new Client(viber);
        Client clientWithTelegram = new Client(telegram);
        Messenger messenger = clientWithViber.getMessenger();
        messenger.sendMessenger();
        messenger.getMessenger();
        Application application = smartPhoneWithTelegram.getApplication();
        ((Messenger) application).sendMessenger();
        ((Messenger) application).getMessenger();
        application.turnOn();
        application.tornOff();
    }
}
