public class FinalVariableExample {
    public static void main(String[] args) {
        final int num = 10;
        //num = 20;  // This will give a compilation error since num is a final variable and its value cannot be changed
        System.out.println(num);
    }
}
