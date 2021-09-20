package by.kasyan.tasks.lesson5.task2;

public class Phone {
    private String number;
    private String model;
    private int weight;
    private String name;

    public Phone(String num, String model, int weight, String name) {
        number = num;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }

    void displayInfo() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d\n", number, model, weight);
    }

    public void receiveCall() {
        System.out.print("Call " + name);
    }

    public void getNumber() {
        System.out.println("    " + number);
    }

    public Phone(String num, String model, int weight) {
        this(num, model);
        number = num;
        this.model = model;
        this.weight = weight;
        name = "Undefined";
    }

    public Phone(String num, String model) {
        number = num;
        this.model = model;
        name = "Undefined";
    }

    public Phone() {
        name = "Undefined";
    }

    void displayInform() {
        System.out.printf("Number: %s \tModel: %s \tWeight: %d \tName: %s\n", number, model, weight, name);
    }

    static void sendMessage(String... nums) {
        System.out.println("Message sent: ");
        for (String number : nums) {
            System.out.println(number);
        }
        System.out.println();
    }
}
