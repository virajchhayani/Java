import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the value to search for: ");
        int value = input.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }
}
