import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Square of " + num + " is " + (num * num));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Finally block executed.");
        }
    }
}
