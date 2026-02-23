// Write an algorithm to sort an array using selection sort in decreasing way

public class selectionSortDecreasing {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        int n=arr.length;
        print(arr);

        for(int i=0; i<n-1; i++){
            int max=Integer.MIN_VALUE;
            int maxIdx=-1;

            for(int j=i; j<n; j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIdx=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        print(arr);
    }

    public static void main(String[] args){
       int[] arr = {1,2,3,4,5}; 
       selectionSort(arr);
    }
}
