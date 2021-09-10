package by.kasyan.tasks.lesson2;

public class task1 {

    public static void main(String[] args) {
        double x = -5;
        if (0 < x && x < 10) {
            System.out.println("Число положительное однозначное");
        }
        if (10 <= x && x < 100) {
            System.out.println("Число положительное двузначное");
        }
        if (100 <= x) {
            System.out.println("Число положительное трехзначное и более");
        }
        if (-10 < x && x < 0) {
            System.out.println("Число отрицательное однозначное");
        }
        if (x <= -10) {
            System.out.println("Число отрицательное двузначное и более");
        }
    }

//        public static void main (String[]args){
//            int a = 5;
//            int b = 4;
//            int c = 3;
//            if (a + b > c && a + c > b && c + b > a) {
//                System.out.println("Треугольник существует");
//            } else {
//                System.out.println("Треугольник не существует");
//            }
//        }
//        ;
//
//        public static void main (String[]args){
//            int x = 0;
//            if (x > 0) {
//                System.out.println(x++);
//            } else if (x == 0) {
//                System.out.println(10);
//            } else {
//                System.out.println(x - 2);
//            }
//        }
//
//        public static void main (String[]args){
//            int num1 = 2;
//            int num2 = -2;
//            int num3 = 0;
//            if (num1 > 0 & num2 > 0 & num3 > 0) {
//                System.out.println("Три положительных числа");
//            } else if (num1 > 0 ^ num2 > 0 ^ num3 > 0) {
//                System.out.println("Одно положительное число");
//            } else {
//                System.out.println("Два положительных числа");
//            }
//        }
//
//        public static void main (String[]args){
//            int num1 = 2;
//            int num2 = 0;
//            int num3 = -2;
//            if (num1 > 0 & num2 > 0 & num3 > 0) {
//                System.out.println("Три положительных числа");
//            }
//            if (num1 < 0 & num2 < 0 & num3 < 0) {
//                System.out.println("Три отрицательных числа");
//            }
//            if (num1 == 0 & num2 == 0 & num3 == 0) {
//                System.out.println("Все числа равны 0");
//            }
//            if ((num1 > 0 ^ num2 > 0 ^ num3 > 0) & (num1 < 0 ^ num2 < 0 ^ num3 < 0)) {
//                System.out.println("Одно положительное число, одно число отрицательное и одно число равно 0");
//            }
//            if ((num1 > 0 ^ num2 > 0 ^ num3 > 0) & ((num1 < 0 & num2 < 0) ^ (num3 < 0 & num2 < 0) ^ (num3 < 0 & num1 < 0))) {
//                System.out.println("Одно положительное число и два числа отрицательных");
//            }
//            if ((num1 < 0 ^ num2 < 0 ^ num3 < 0) & ((num1 > 0 & num2 > 0) ^ (num3 > 0 & num2 > 0) ^ (num3 > 0 & num1 > 0))) {
//                System.out.println("Два положительных числа и одно число отрицательное");
//            }
//            if ((num1 > 0 ^ num2 > 0 ^ num3 > 0) & ((num1 == 0 & num2 == 0) ^ (num3 == 0 & num2 == 0) ^ (num3 == 0 & num1 == 0))) {
//                System.out.println("Одно положительное число и два числа равны 0");
//            }
//            if ((num1 < 0 ^ num2 < 0 ^ num3 < 0) & ((num1 == 0 & num2 == 0) ^ (num3 == 0 & num2 == 0) ^ (num3 == 0 & num1 == 0))) {
//                System.out.println("Одно отрицательное число и два числа равны 0");
//            }
//        }
//
//        public static void main (String[]args){
//            double num1 = 5.5;
//            double num2 = 12;
//            if (num1 > num2) {
//                System.out.println(num1);
//            } else if (num1 < num2) {
//                System.out.println(num2);
//            } else {
//                System.out.println("Числа одинаковы и равны: " + num1);
//            }
//        }
//
//        public static void main (String[]args){
//            int num = 12;
//            switch (num) {
//                case 1:
//                    System.out.println(num + " программист");
//                    break;
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println(num + " программиста");
//                    break;
//                default:
//                    System.out.println(num + " программистов");
//                    break;
//            }
//        }
}
