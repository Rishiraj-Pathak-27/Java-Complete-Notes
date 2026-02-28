public class KthLargestElement {
    public static int kthLargest(int[] arr, int k){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int max=Integer.MIN_VALUE;
            int maxIdx = -1;

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
        return arr[n-k];
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int k = 5;
        System.out.println(kthLargest(arr,k));
    }
}
