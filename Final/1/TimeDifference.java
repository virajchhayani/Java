import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours1, minutes1, seconds1, hours2, minutes2, seconds2;
        System.out.print("Enter time period 1 (hours minutes seconds): ");
        hours1 = input.nextInt();
        minutes1 = input.nextInt();
        seconds1 = input.nextInt();
        System.out.print("Enter time period 2 (hours minutes seconds): ");
        hours2 = input.nextInt();
        minutes2 = input.nextInt();
        seconds2 = input.nextInt();
        
        int diffHours = hours2 - hours1;
        int diffMinutes = minutes2 - minutes1;
        int diffSeconds = seconds2 - seconds1;
        if (diffSeconds < 0) {
            diffMinutes--;
            diffSeconds += 60;
        }
        if (diffMinutes < 0) {
            diffHours--;
            diffMinutes += 60;
        }
        
        System.out.println("Time difference: " + diffHours + " hours " + diffMinutes + " minutes " + diffSeconds + " seconds");
    }
}
