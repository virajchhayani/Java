class Vehicle {
    public void run() {
        System.out.println("The vehicle is running.");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("The bike is running.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Bike bike = new Bike();
        bike.run()

        Vehicle anotherBike = new Bike();
        anotherBike.run();
    }
}