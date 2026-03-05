// WAP to find the single number among the doubles from a sorted array

public class singleAmongDoubles{
    public static int singleNumber(int[] arr){
        int n=arr.length;

        int left=0, right=n-1;

        if(n==1) return arr[n-1];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];

            int f = mid, s = mid;

            if(arr[mid] == arr[mid-1]){
                f=mid-1;
                s=mid;
            }else{
                s=mid+1;
                f=mid;
            }

            int leftCount = f-left;
            int rightCount = right-s;

            if(leftCount % 2 == 1){
                right = f-1;
            }else{
                left=s+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};

        System.out.println("Single Among doubles = "+singleNumber(arr));
    }
}