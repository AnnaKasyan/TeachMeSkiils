package by.kasyan.tasks.lesson6.task6;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        print(Season.SPRING);
        System.out.println("-------------");
        printAll();

    }

    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void printAll() {
        for (Season season : Season.values()) {
            System.out.println(season + " " + season.getTemp() + " " + season.getDescription());
        }
    }
}
