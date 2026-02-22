// WAP to sort an array in descending using bubble sort

public class bubbleSortDecreasing{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void decreasingBubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int swaps=0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);
    }

    public static void main(String[] args){
        int[] arr = {-2,-10,4,1,0,100,23,-15};
        decreasingBubbleSort(arr);
    }
}