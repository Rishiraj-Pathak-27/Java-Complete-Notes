// Find the Sum of Elements Until a Negative Number Occurs

public class sumUntilNegative {
    public static int negative(int[] arr) {
        int n = arr.length;
        int sum = 0;
    
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                return sum;
            }
            sum+=arr[i];
        }
       return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,-1,2,4,4};
        System.out.println("Sum until negative = "+negative(arr));
    }
}
