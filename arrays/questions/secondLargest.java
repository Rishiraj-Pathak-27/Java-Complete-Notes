public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {32,54,11,56,269,07,5,43,103,343};
        int max = arr[0];

        // loop to find max value
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("First Max = "+max);

        // loop to find out second max value (elements > greatest and element < previous max value)
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] < max) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Max = "+secondLargest);
    }
}


// OR

/* public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {-3,-34,-1,-2,-54,05};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int smax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }

        System.err.println(max);
        System.err.println(smax);
    }
} */