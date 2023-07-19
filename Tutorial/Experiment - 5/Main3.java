public class Main3 {
    public static void main(String args[]) {
        try {
            int b = 30 / 0;
            System.out.println("going to divide by 0");
            try {
                int a[] = new int[5];
                a[5] = 10;
                System.out.println(a[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
