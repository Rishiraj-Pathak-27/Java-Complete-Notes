// Count frequency of each character

import java.util.Arrays;

public class countFreq{

    public static void frequency(String str){

        char[] arr = str.toCharArray();
        int n=arr.length;

        Arrays.sort(arr);

        int i=0, j=0;


        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }else{
                int freq = j-i;
                System.out.println(arr[i]+" = "+freq);
                i=j;
            }
        }
        int freq = j-i;
        System.out.println(arr[i] +" = "+ freq);
    }

    public static void main(String[] args){
        String str = "character";

        frequency(str);
    }
}