public class Maruti800 extends Maruti {
    public void fuelType() {
        System.out.println("Petrol");
    }

    public static void main(String[] args) {
        Maruti800 m800 = new Maruti800();
        m800.start();
        m800.accelerate();
        m800.brake();
        m800.stop();
        m800.fuelType();
    }
}
