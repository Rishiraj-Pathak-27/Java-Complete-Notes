// wave array , swap the element with its ele+1 element 

import java.util.Arrays;
public class wavyArray {
    public static int[] wave(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i+=2){
            if(i==n-1) break;

            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;        
    }

    public static void main(String[] args){
        int[] arr = {2,4,7,8,9,10};
        int[] res = wave(arr);
        System.out.println(Arrays.toString(res));
    }
}
