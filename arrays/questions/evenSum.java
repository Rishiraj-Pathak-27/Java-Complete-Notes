// Sum of Values at Even Index Positions

public class evenSum {
    
    public static int square(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            if(i % 2 == 0) {
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String []args) {
        int[] arr = {1,7,13,9,40};
        System.out.println("Sum of number at even indices = "+square(arr));
    }
}