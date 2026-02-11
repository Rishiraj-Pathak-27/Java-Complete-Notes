// WAP to sort an array consisting of only 0's & 1's

/* import java.util.Scanner;
public class sortZerosOnes {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static int[] sorted(int[] arr){
        int n=arr.length;
        int zero=0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                zero++;
            }
        }

        for(int j=0; j<n; j++){
            if(j < zero){
                arr[j] = 0;
            }else{
                arr[j] = 1;
            }
        }
        
        return arr;
        
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in); 
        System.out.println("Define array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }

        print(arr);  
        sorted(arr);
        print(arr);
    }
} */

// Another Approach

public class sortZerosOnes{
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static int[] sorted(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(i>j) break;
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            if(arr[i] == 1 && arr[j] == 0) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {0,0,0,1,0,1,1,1};
        print(arr);
        sorted(arr);
        print(arr);
    }
}
