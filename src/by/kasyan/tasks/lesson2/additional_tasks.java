package by.kasyan.tasks.lesson2;

public class additional_tasks {

    public static void main(String[] args) {
        int num = (int) (1000000 + Math.random() * 10000000);
        System.out.println("Положительное семизначное число: " + num);
        int digit;
        int reversed = 0;
        while (num != 0) {
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Перевернутое число: " + reversed);
    }

//    public static void main(String[] args) {
//        int num = 1289;
//        int a = num / 1000;
//        int b = num / 100 % 10;
//        int c = num / 10 % 10;
//        int d = num % 10;
//        if (a < b & b < c & c < d) {
//            System.out.println("Цифры числа образуют возрастающую последовательность");
//        } else if (a > b & b > c & c > d) {
//            System.out.println("Цифры числа образуют убывающую последовательность");
//        } else {
//            System.out.println("Цифры числа не образуют никакой последовательности");
//        }
//    }
//
//    public static void main(String[] args) {
//        int head = 3;
//        int result1 = 0;
//        int result2 = 0;
//        int eyes = 2;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите возраст чудища: ");
//        int N = in.nextInt();
//        if (N < 200) {
//            for (int i = 0; i < N; i++) {
//                head += 3;
//            }
//            eyes *= head;
//            System.out.println("У чудища " + head + " голов и " + eyes + " глаз.");
//        }
//        if (N >= 200 & N < 300) {
//            for (int i = 0; i < 200; i++) {
//                head += 3;
//                result1 = head;
//            }
//            for (int i = 200; i < N; i++) {
//                result1 += 2;
//            }
//            eyes *= result1;
//            System.out.println("У чудища " + result1 + " голов и " + eyes + " глаз.");
//        }
//        if (N >= 300) {
//            for (int i = 0; i < 200; i++) {
//                head += 3;
//                result1 = head;
//            }
//            for (int i = 200; i < 300; i++) {
//                result1 += 2;
//                result2 = result1;
//            }
//            for (int i = 300; i < N; i++) {
//                result2 += 1;
//            }
//            eyes *= result2;
//            System.out.println("У чудища " + result2 + " голов и " + eyes + " глаз.");
//        }
//    }
//
//    public static void main(String[] args) {
//        int num = 123456;
//        double sum = 0;
//        double product = 1;
//        double result1;
//        double result2;
//        int digit = 0;
//        while (num != 0) {
//            digit = num % 10;
//            sum += digit;
//            product *= digit;
//            num /= 10;
//        }
//        System.out.println(sum);
//        System.out.println(product);
//        result1 = sum / 6;
//        result2 = Math.sqrt(product);
//        System.out.println("Среднее арифметическое цифр: " + result1);
//        System.out.println("Среднее геометрическое цифр: " + result2);
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите двухзначное и более число: ");
//        int num = in.nextInt();
//        int digit1;
//        int digit2 = 10;
//        while (num != 0) {
//            digit1 = num % 10;
//            num /= 10;
//            if (digit2 > digit1) {
//                digit2 = digit1;
//            } else {
//                System.out.println("Цифры числа не идут в порядке возрастания");
//                break;
//            }
//        }
//        in.close();
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите двухзначное и более число: ");
//        int num = in.nextInt();
//        int digit1;
//        int digit2 = 0;
//        while (num != 0) {
//            digit1 = num % 10;
//            num /= 10;
//            if (digit2 < digit1) {
//                digit2 = digit1;
//            } else {
//                System.out.println("Цифры числа не идут в порядке убывания");
//                break;
//            }
//        }
//        in.close();
//    }
//
//    public static void main(String[] args) {
//        int num = 1235;
//        int digit;
//        int remainder;
//        int even = 0;
//        int odd = 0;
//        int sum = 0;
//        while (num != 0) {
//            digit = num % 10;
//            sum++;
//            remainder = digit % 2;
//            num /= 10;
//            if (remainder == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//        if (odd == sum ^ even == sum) {
//            System.out.println("Цифры натурального числа имеют одинаковую четность");
//        } else {
//            System.out.println("Цифры натурального числа разной четности");
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int num = 12345;
//        int digit;
//        int remainder;
//        int even = 0;
//        int odd = 0;
//        while (num != 0) {
//            digit = num % 10;
//            remainder = digit % 2;
//            num /= 10;
//            if (remainder == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//        System.out.println("Число содержит: четных цифр - " + even + "  и нечетных цифр - " + odd);
//    }
//
//
//    public static void main(String[] args) {
//        int num = 12354;
//        int digit1;
//        int digit2 = num % 10;
//        while (num != 0) {
//            digit1 = num % 10;
//            num /= 10;
//            if (digit2 == digit1) {
//                digit2 = digit1;
//            } else {
//                System.out.println("Цифры различны");
//                break;
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int num = 0;
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Введите натуральное число: ");
//        if (scn.hasNextInt()) {
//            num = scn.nextInt();
//        }
//        for (int i = (int) Math.sqrt(num); i >= 1; i--) {
//            if (num % i == 0 & i != 1) {
//                System.out.println("Заданное число составное");
//                break;
//            }
//            if (i == 1) System.out.println("Заданное число простое");
//        }
//    }

}

