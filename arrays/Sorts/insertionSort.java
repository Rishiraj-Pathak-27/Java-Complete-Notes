// Write an algorithm to sort an array using insertion sort

public class insertionSort{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void insertionSortFunction(int[] arr){
        int n=arr.length;
        print(arr);
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        print(arr);
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        insertionSortFunction(arr);
    }
}

