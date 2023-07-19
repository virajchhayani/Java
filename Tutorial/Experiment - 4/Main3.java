class Vehicle {
    private int speed;
    private String fuelType;

    public Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void display() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel type: " + fuelType);
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(int speed, String fuelType) {
        super(speed, fuelType);
    }

    public void display() {
        super.display();
        System.out.println("Type: Two-wheeler");
    }
}

class ThreeWheeler extends Vehicle {
    public ThreeWheeler(int speed, String fuelType) {
        super(speed, fuelType);
    }

    public void display() {
        super.display();
        System.out.println("Type: Three-wheeler");
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler(int speed, String fuelType) {
        super(speed, fuelType);
    }

    public void display() {
        super.display();
        System.out.println("Type: Four-wheeler");
    }
}

class Main3 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new TwoWheeler(60, "Petrol");
        vehicle1.display();

        Vehicle vehicle2 = new ThreeWheeler(50, "Diesel");
        vehicle2.display();

        Vehicle vehicle3 = new FourWheeler(80, "Electric");
        vehicle3.display();
    }
}
