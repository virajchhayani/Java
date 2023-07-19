// Vehicle class
class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

// Bike class that extends Vehicle class
class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running");
    }
}

// Main class to test the method overriding
public class AllVehicle {
    public static void main(String[] args) {
        // create a Vehicle object and call the run method
        Vehicle vehicle = new Vehicle();
        vehicle.run();
        
        // create a Bike object and call the run method
        Bike bike = new Bike();
        bike.run();
    }
}
