abstract class Shape {
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    public void printArea() {
        int area = width * height;
        System.out.println("Area of rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int width, int height) {
        super(width, height);
    }

    public void printArea() {
        int area = width * height / 2;
        System.out.println("Area of triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int width, int height) {
        super(width, height);
    }

    public void printArea() {
        double radius = width / 2.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class AllShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.printArea();

        Triangle t = new Triangle(5, 10);
        t.printArea();

        Circle c = new Circle(10, 0);
        c.printArea();
    }
}
