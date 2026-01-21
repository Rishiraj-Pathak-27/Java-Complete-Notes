// Find the average of array elements

public class arrayAvg{
    public static void main(String[] args) {
        int[] arr = {3,56,33,87,56,3,87,342};
        int n = arr.length;
        int res = 0;
        int avg = 0;

        for(int i = 0; i < n; i++) {
            avg = (res += arr[i]) / n;
        }
        System.out.println("Average of Elements = "+avg);
    }
}