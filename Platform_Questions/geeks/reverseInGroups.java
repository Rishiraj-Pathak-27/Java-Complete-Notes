import java.util.Arrays;

public class reverseInGroups {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    public static int[] reverseInGroups(int[] arr, int k) {
        // code here

        int n=arr.length;

        if(k>=n){
        reverse(arr,0,n-1);
        }else{
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }

        return arr;
    } 
    

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k=3;
        int[] res = reverseInGroups(arr,k);
        System.out.println(Arrays.toString(res));
    }
}
