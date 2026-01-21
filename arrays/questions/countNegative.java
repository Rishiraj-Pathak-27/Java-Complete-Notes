// Count Negative Numbers in the Array

public class countNegative {
    
    public static int negative(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] < 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String []args) {
        int[] arr = {4,-1,-3,2};
        System.out.println("Total Negative Numbers = "+negative(arr));
    }
}