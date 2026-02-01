// optimised approach in which we are appending the arr1 from backward

/* import java.util.Scanner;
import java.util.Arrays;
public class mergeSortedArrays {
    public static int[] merge(int[] arr1, int m, int[] arr2, int n){
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1; 
        
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k] = arr1[i];
                i--;
            }else{
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        while(j>=0){
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        return arr1;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter size of arr1 = ");
        int n1 = ip.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n1; i++){
            arr1[i] = ip.nextInt();
        }

        System.out.println("Enter size of arr2 = ");
        int n2 = ip.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n2; i++){
            arr2[i] = ip.nextInt();
        }

        System.out.println("Enter m");
        int m = ip.nextInt();

        System.out.println("Enter n");
        int n = ip.nextInt();

        int[] res = merge(arr1,m,arr2,n);
        System.out.println(Arrays.toString(res));

    }
} */



