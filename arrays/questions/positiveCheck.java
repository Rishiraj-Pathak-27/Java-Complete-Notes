// Check if All Elements Are Positive

public class positiveCheck{
    
    public static boolean positive(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] <= 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,-1};
        System.out.println("Elements are Positive = "+positive(arr));
    }
}