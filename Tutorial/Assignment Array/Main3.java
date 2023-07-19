public class Main3 {
    public static void main(String[] args) {
        double[] array = { 1.2, 2.4, 3.6, 4.8 };
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println("The average of the double array is " + average);
    }
}
