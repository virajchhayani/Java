class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }
}

public class Volum {
    public static void main(String[] args) {
        Box myBox = new Box(100, 50, 75);
        System.out.println("Volume of box is: " + myBox.volume());
    }
}
