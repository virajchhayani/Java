class arrays {
    public static void main(String[] args) {
        double[] numArray = { 65.3, 97.5, -85.6, 26.34, 84.0, 63.6 };
        double sum = 0.0;
        for (double num: numArray) {
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}