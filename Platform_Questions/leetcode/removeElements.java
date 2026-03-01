import java.util.Arrays;

public class removeElements {
    public static int removeGivenElement(int[] arr, int val){
        int n=arr.length;

        int left=0;

        for(int right=0; right<n; right++){
            if(arr[right] != val){
                arr[left] = arr[right];
                left++;
            }
        }
        return left;
    } 
    
    public static void main(String[] args){
        int[] arr = {3,2,2,3};
        int val = 2;

        System.out.println(removeGivenElement(arr,val));
    }
}
