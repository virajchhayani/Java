public class Main2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int highest = (num1 > num2) ? num1 : num2;

        System.out.println("The highest number is: " + highest);
    }
}
