package by.kasyan.tasks.lesson3.Task2;

public class task2 {
    public static void main(String[] args) {

        int size = 0;
        int j = 1;
        for (int i = 1; i < 100; i += 2) {
            size++;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = j;
            j += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
