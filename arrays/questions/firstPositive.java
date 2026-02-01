// Find the First Positive Number in the Array

public class firstPositive {
    public static int firstPositive(int[] arr) {
        int n = arr.length;
        boolean found = false;
        int num = arr[0];

        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                found = true;
                num = arr[i];
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] arr = {-5,1,-2,7,3};
        System.out.println("First Positive Number from array = "+firstPositive(arr));
    }
}