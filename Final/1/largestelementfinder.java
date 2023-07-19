import java.util.Scanner;

public class largestelementfinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int largest = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
}
