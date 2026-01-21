// Find the Difference Between Max and Min

public class minMaxDiff{

    public static int min(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr){
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {3,5,32,2,4,5,6,2,1,9,10};
        int res = max(arr)-min(arr);
        System.out.println(res);
    }
}