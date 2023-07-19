import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of terms: ");
        n = input.nextInt();
        
        System.out.println("Using non-recursive function:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNonRecursive(i) + " ");
        }
        System.out.println();
        
        System.out.println("Using recursive function:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
    
    public static int fibonacciNonRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fib0 = 0;
            int fib1 = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = fib0 + fib1;
                fib0 = fib1;
                fib1 = fib;
            }
            return fib;
        }
    }
    
    public static int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }
}
