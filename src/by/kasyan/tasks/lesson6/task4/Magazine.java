package by.kasyan.tasks.lesson6.task4;

public class Magazine implements Printable {

    final private String name;

    public Magazine(String name) {
        this.name = name;
    }

    static void printMagazines(Printable[] printable) {
        for (Printable i : printable) {
            if (i instanceof Magazine) {
                System.out.println(((Magazine) i).name);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
