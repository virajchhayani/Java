import java.util.Scanner;

public class SentenceReverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        String reversed = reverseSentence(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }
    
    public static String reverseSentence(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        } else {
            return reverseSentence(sentence.substring(1)) + sentence.charAt(0);
        }
    }
}
