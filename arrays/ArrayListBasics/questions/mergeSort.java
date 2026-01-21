import java.util.*;
public class mergeSort{
    public static int[] merger(int[] arr1, int[] arr2, int[] merged){
        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }else{
                merged[k++] = arr2[j++];
            } 
        }

        while(i<arr1.length){
            merged[k++] = arr1[i++];
        }

        while(j<arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged;        
    }
        
        public static void main(String[] args){
            int[] arr1 = {1,5,6,8};
            int[] arr2 = {4,5,7,9,20,330};

             int n1 = arr1.length;
             int n2 = arr2.length;
            int[] merged = new int[n1+n2];
            
        int[] res = merger(arr1,arr2,merged);
        System.out.println(Arrays.toString(res));
    }
}

