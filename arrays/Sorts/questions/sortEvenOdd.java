
import java.util.Arrays;
public class sortEvenOdd {
    public static void print(int[] arr){
         for(int ele : arr){

            System.out.print(ele+" ");
        }
        System.out.println();
    }
    
    public static void sortEO(int[] arr){
        int n=arr.length;
        int i=0, j=n-1;
        print(arr);

        while(i<j){
            if(arr[i] % 2 == 0) i++;
            else if(arr[j] % 2 == 1) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // sorting even and odd partitions

        int even=0;

        while(even < n && arr[even] % 2 == 0){
            even++;
        }
        Arrays.sort(arr,0,even);
        Arrays.sort(arr,even,n);

        print(arr);
    }

    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        sortEO(arr);
    }   
}
