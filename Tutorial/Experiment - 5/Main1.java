public class Main1 {
    public static void main(String args[]) {
        try {
            int number = 50 / 0;
            System.out.println("number=" + number);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
