package by.kasyan.tasks.lesson2;

public class task2 {

    public static void main(String[] args) {
        double day = 10;
        double result = 10;
        for (int i = 1; i < 7; i++) {
            day *= 1.1;
            result += day;
        }
        System.out.println("За 7 дней спортсмен пробежал " + result + " км");
    }

//    public static void main(String[] args) {
//        int sum = 1;
//        for (int i = 3; i <= 24; i += 3) {
//            sum *= 2;
//        }
//        System.out.println("Через 24 часа будет " + sum + " амеб");
//    }
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 256; i *= 2) {
//            sum += i;
//        }
//        System.out.println("Сумма равна: " + sum);
//    }
//
//    public static void main(String[] args) {
//        int num = 256;
//        int sum = 256;
//        while (num > 0) {
//            num = num / 2;
//            sum += num;
//        }
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        int a = 4;
//        int b = 5;
//        int result = 0;
//        do {
//            result += a;
//            b--;
//        }
//        while (b > 0);
//        System.out.println(result);
//    }
//
//    public static void main(String[] args) {
//        double sm = 0;
//        for (int i = 0; i <= 20; i++) {
//            sm += 2.54;
//            System.out.println(i + " см - " + sm + " д");
//        }
//    }
//
//    public static void main(String[] args) {
//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result = 0;
//        for (int i = 0; i <= 99; i++) {
//            result += i;
//        }
//        System.out.println("Сумма нечетных чисел от 1 до 99 равна: " + result);
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
}
