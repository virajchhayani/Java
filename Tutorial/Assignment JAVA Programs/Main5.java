import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Palindrome numbers in the range " + lowerLimit + " to " + upperLimit + " are:");

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
