final class MyClass {
    final int MAX_VALUE = 100;

    public final void display(final int num) {
        final int value = 10;
        // value = 20;  // This will give an error as the variable is declared final
        // num = 30;    // This will give an error as the parameter is declared final
        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("num: " + num);
        System.out.println("value: " + value);
    }
}

public class Main4 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(50);
    }
}
