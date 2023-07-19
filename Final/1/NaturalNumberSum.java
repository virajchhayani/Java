import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();
        int sum = findSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
    
    public static int findSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + findSum(n-1);
        }
    }
}
