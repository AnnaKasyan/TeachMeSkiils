package by.kasyan.tasks.lesson7.tasks.task3;

public class Main {
    public static void main(String[] args) {

        Shape circle1 = new Circle("желтый", 15, 15);
        Shape circle2 = new Circle("синий", 0, 28);
        Shape rectangle1 = new Rectangle("красный", 34, 12);
        Shape rectangle2 = new Rectangle("белый", -5, 51);
        Shape[] shapes = new Shape[]{circle1, circle2, rectangle1, rectangle2};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
