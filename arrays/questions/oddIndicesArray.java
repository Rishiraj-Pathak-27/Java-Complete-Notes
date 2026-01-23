// Create an Array of Elements at Odd Indices

import java.util.Arrays;
public class oddIndicesArray{
    public static int[] oddIndices(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(i % 2 != 0){
                count++;
            }
        }

        int[] oddIndiced = new int[count];
        int odd = 0;

        for(int i=1; i<n; i++){
            if(i % 2 != 0){
                oddIndiced[odd]=arr[i];
                odd++;
            }
        }
        return oddIndiced;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,100};
        int[] res = oddIndices(arr);
        System.out.println("Array with odd indiced elements = "+Arrays.toString(res));
    }
}