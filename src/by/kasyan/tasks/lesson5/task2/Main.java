package by.kasyan.tasks.lesson5.task2;

public class Main {

    public static void main(String[] args) {

        Phone first = new Phone("1248574", "Samsung", 192, "Mark");
        Phone second = new Phone("8961152", "iPhone", 186, "Mary");
        Phone third = new Phone("3548957", "Huawei", 200, "Tom");

        first.displayInfo();
        second.displayInfo();
        third.displayInfo();

        System.out.println("----------------");

        first.receiveCall();
        first.getNumber();
        second.receiveCall();
        second.getNumber();
        third.receiveCall();
        third.getNumber();

        System.out.println("----------------");

        Phone fourth = new Phone("7581265", "Xiaomi", 195);
        Phone fifth = new Phone("4521100", "Honor");
        Phone sixth = new Phone();

        fourth.displayInform();
        fifth.displayInform();
        sixth.displayInform();

        System.out.println("----------------");


    }
}
