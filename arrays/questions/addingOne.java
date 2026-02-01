// WAP to add 1 to the array

import java.util.Arrays;
public class addingOne {
    public static int[] addingOne(int[] arr){
        int n=arr.length;
        int carry=1;

        for(int i=n-1; i>=0; i--){
            if(arr[i]+carry <= 9){
                arr[i]+=carry;
                carry=0;
                return arr;
            }else{
                arr[i]=0;
                carry=1;
            }
        }
        if(carry==1){
            
        }
        int[] res = new int[n+1];
        res[0]=1;
        return res;
    }   
    
    public static void main(String[] args){
        int[] arr = {2,7,9,9};
        int[] res = addingOne(arr);
        System.out.println(Arrays.toString(res));
    }
}
