public class Main10 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String word = "fox";

        if (str.contains(word)) {
            System.out.println("The word '" + word + "' occurs in the string.");
        } else {
            System.out.println("The word '" + word + "' does not occur in the string.");
        }
    }
}
