package by.kasyan.tasks.lesson5.task2;

public class Phone {
    int number;
    String model;
    int weight;
    String name;

    public Phone(int n, String m, int w, String name) {
        number = n;
        model = m;
        weight = w;
        this.name = name;
    }

    void displayInfo() {
        System.out.printf("Number: %d \tModel: %s \tWeight: %d\n", number, model, weight);
    }

    public void receiveCall() {
        System.out.print("Call " + name);
    }

    public void getNumber() {
        System.out.println("    " + number);
    }

    public Phone(int num, String m, int w) {
        number = num;
        model = m;
        weight = w;
        name = "Undefined";
    }

    public Phone(int num, String m) {
        number = num;
        model = m;
        weight = 0;
        name = "Undefined";
    }

    public Phone() {
        number = 0;
        model = "Undefined";
        weight = 0;
        name = "Undefined";
    }

    void displayInform() {
        System.out.printf("Number: %d \tModel: %s \tWeight: %d \tName: %s\n", number, model, weight, name);
    }

    public void sendMessage(int... nums) {
        System.out.println("Message sent: ");
        for (int number :
                nums) {
            System.out.println(number);
        }
        System.out.println();
    }
}
