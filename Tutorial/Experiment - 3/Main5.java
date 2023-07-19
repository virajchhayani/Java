class Circle {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.getArea();
        System.out.println("Area of circle with radius 5: " + area);
    }
}
