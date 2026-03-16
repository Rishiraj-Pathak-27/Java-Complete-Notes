// 350. Intersection of Two Arrays II

import java.util.Arrays;

public class intersectionTwoArraysTwo {

    public static int[] intersection(int[] arr1, int[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int[] temp = new int[Math.min(arr1.length,arr2.length)];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                temp[k++] = arr1[i];
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        return Arrays.copyOf(temp,k);
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {1,2};

        int[] res = intersection(arr1,arr2);

        System.out.println(Arrays.toString(res));
    }
}
