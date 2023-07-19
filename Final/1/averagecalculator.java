import java.util.Scanner;

public class averagecalculator {
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
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = sum / n;
        System.out.println("The average is: " + average);
    }
}
