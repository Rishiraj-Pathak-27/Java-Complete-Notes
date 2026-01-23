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
            int[] arr1 = {8,6,5,1};
            int[] arr2 = {4,5,4,6,2,3,5,1,0};

             int n1 = arr1.length;
             int n2 = arr2.length;
            int[] merged = new int[n1+n2];
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        int[] res = merger(arr1,arr2,merged);
        System.out.println(Arrays.toString(res));
    }
}

