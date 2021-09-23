package by.kasyan.tasks.lesson6.task1;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHand samsungHand = new SamsungHand(50);
        IHead samsungHead = new SamsungHead(80);
        ILeg samsungLeg = new SamsungLeg(40);
        IHand sonyHand = new SonyHand(70);
        IHead sonyHead = new SonyHead(100);
        ILeg sonyLeg = new SonyLeg(60);
        IHand toshibaHand = new ToshibaHand(60);
        IHead toshibaHead = new ToshibaHead(90);
        ILeg toshibaLeg = new ToshibaLeg(70);
        Robot firstRobot = new Robot(samsungHand, sonyHead, toshibaLeg);
        Robot secondRobot = new Robot(toshibaHand, samsungHead, sonyLeg);
        Robot thirdRobot = new Robot(sonyHand, toshibaHead, samsungLeg);

        firstRobot.action();
        int firstCoat = firstRobot.getPrice();
        System.out.println("--------------------");
        secondRobot.action();
        int secondCoat = secondRobot.getPrice();
        System.out.println("--------------------");
        thirdRobot.action();
        int thirdCoat = thirdRobot.getPrice();
        System.out.println("--------------------");

        if (firstCoat > secondCoat && firstCoat > thirdCoat) {
            System.out.println("Самый дорогой первый робот");
        } else if (secondCoat > firstCoat && secondCoat > thirdCoat) {
            System.out.println("Самый дорогой второй робот");
        } else {
            System.out.println("Самый дорогой третий робот");
        }
    }
}
