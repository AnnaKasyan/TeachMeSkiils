package by.kasyan.tasks.lesson7.tasks.task3;

import java.util.Objects;

public class Circle extends Shape {

    private int x;
    private int y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Круг с координатами: " + x + "; " + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
