interface Shape {
    void area();
    void perimeter();
}

class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void area() {
        double s = (sideA + sideB + sideC) / 2.0;
        double triangleArea = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        System.out.println("The area of the triangle is: " + triangleArea);
    }

    public void perimeter() {
        double trianglePerimeter = sideA + sideB + sideC;
        System.out.println("The perimeter of the triangle is: " + trianglePerimeter);
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + circleArea);
    }

    public void perimeter() {
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is: " + circlePerimeter);
    }
}

class Main1 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        triangle.area();
        triangle.perimeter();

        Shape circle = new Circle(5);
        circle.area();
        circle.perimeter();
    }
}
