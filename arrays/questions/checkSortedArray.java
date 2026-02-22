// WAP to check that if the array is sorted or not 

public class checkSortedArray{
    
    public static boolean isSorted(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {0,2,3,10,21,33,6,7};
        System.out.println(isSorted(arr));
    }
}