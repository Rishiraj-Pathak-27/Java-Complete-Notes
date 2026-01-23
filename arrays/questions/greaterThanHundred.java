// Find the First Number Greater Than 100

public class greaterThanHundred{
    public static int greater(int[] arr){
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]>100){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr1 = {45, 10, 12, 101};
        int[] arr2 = {1,2,3,4,5,99};
        System.out.println("First Greater than 100(true) = "+greater(arr1));
        System.out.println("First Greater than 100(false) = "+greater(arr2));
    }
}