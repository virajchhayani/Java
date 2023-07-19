import java.util.Scanner;

public class RoundNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        System.out.print("Enter the number of decimal places to round to: ");
        int decimalPlaces = input.nextInt();
        double roundedNumber = Math.round(number * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
        System.out.println(number + " rounded to " + decimalPlaces + " decimal places is " + roundedNumber);
    }
}
