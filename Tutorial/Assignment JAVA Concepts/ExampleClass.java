public class ExampleClass {

    // Non-static methods
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void printName(String name) {
        System.out.println("My name is " + name);
    }

    // Method overloading
    public void printNumber(int num) {
        System.out.println("The number is " + num);
    }

    public void printNumber(double num) {
        System.out.println("The number is " + num);
    }

    // Pass object as argument
    public void printPerson(Person person) {
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }

    // Return object as argument
    public Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    // Static methods
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Pass array as argument
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Return array from method
    public int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // Java programming constructs
    public void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public int getFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }

    public void printReverseString(String str) {
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    public int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Inner class for demonstration purposes
    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}