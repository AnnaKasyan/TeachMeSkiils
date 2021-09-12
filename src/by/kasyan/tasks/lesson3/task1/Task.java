package by.kasyan.tasks.lesson3.task1;

public class Task {

    public static void main(String[] args) {

        int size = 0;
        int j = 2;
        for (int i = 2; i < 21; i += 2) {
            size++;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = j;
            j += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
