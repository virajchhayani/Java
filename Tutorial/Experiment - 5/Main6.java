class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyException: " + message;
    }
}

public class Main6 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception message");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
