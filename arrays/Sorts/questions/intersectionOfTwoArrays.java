package questions;
// WAP to find the intersection of 2 arrays

import java.util.Arrays;
import java.util.ArrayList;

public class intersectionOfTwoArrays {
    public static int[] intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0, j=0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[ans.size()];
        int idx=0;

        for(int ele : ans){
            res[idx++] = ele;
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr1 = {1,1};
        int[] arr2 = {1,2};
        int[] res = intersection(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
