public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int k){
        int n=arr.length;

        for(int i=0; i<k; i++){
            int min=Integer.MAX_VALUE;
            int minIdx = -1;

            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIdx=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr[k-1];
    }
    public static void main(String[] args){
    int[] arr = {1,4,2,6,4,2,7,9};
    int k=8;

    System.out.println(kthSmallest(arr,k));
    }
}
