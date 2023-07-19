class Car {
    int fuel;
    void speed() {
        System.out.println("Car's speed method.");
    }
}
class Maruti extends Car {
    String gearType;
    void gear() {
        System.out.println("Maruti's gear method.");
    }
}
class Maruti800 extends Maruti {
    String model;
    void getModel() {
        System.out.println("Maruti800's getModel method.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Maruti800 car = new Maruti800();
        car.fuel = 10;
        car.gearType = "Manual";
        car.model = "Maruti 800";
        car.speed();
        car.gear();
        car.getModel();
        System.out.println("Fuel: " + car.fuel);
        System.out.println("Gear type: " + car.gearType);
        System.out.println("Model: " + car.model);
    }
}