package by.kasyan.tasks.lesson7.tasks.task3;

import java.util.Objects;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Прямоугольник с координатами: " + x + "; " + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
