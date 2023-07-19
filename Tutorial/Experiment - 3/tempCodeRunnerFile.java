class Shape {
    public final void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class Main7 {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
    }
}

class Square extends Rectangle {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
