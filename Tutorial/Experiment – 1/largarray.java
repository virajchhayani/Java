class largarray {  
    public static void main(String[] args) {  
        int [] arr = new int [] {65, 53, 46, 86, 16};   
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
            max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}