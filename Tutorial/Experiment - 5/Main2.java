public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        try {
            numbers[10] = 100; // Trying to access an element of index 10
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage()); // Handling the exception
        }
    }
}
