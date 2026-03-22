// Find the First Index Where an Even Number Appears

public class firstEven {
    
    public static int even(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int[] arr = {3,5,7,4};
        System.out.println("First Even Number = "+even(arr));
    }
}