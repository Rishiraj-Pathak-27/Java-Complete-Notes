// WAP to find out the 

import java.util.Arrays;
public class findDuplicate {

    public static int duplicates(int[] arr){

        Arrays.sort(arr);
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(i>0 && arr[i] == arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,1,3,4,2};

        System.out.println("Duplicate number from array = "+duplicates(arr));
    }
    
}
