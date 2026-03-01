// WAP to perform insertion sort in decreasing order

public class insertionSortDecreasing {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
    public static void insertionSort(int[] arr){
        int n=arr.length;

        print(arr);

        for(int i=1; i<n; i++){
            int j=i;

            while(j>0 && arr[j]>arr[j-1]){
                swap(arr,j);
                j--;
            }
        }
        print(arr);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        insertionSort(arr);
    }
}
