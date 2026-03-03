// WAP to find the peak of a mountain array

// Optimal Solution (O(log n))

public class peakOfArray{
    public static int peakElement(int[] arr){
        int n=arr.length;

        int left = 1, right = n-2;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                left = mid+1;
            }else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]){
                right = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {-1,0,1,5,6,111,111,111,6,3};
        System.out.println("Peak Element is at idx "+peakElement(arr));
    }
}


// Brute Force Approach  (O(n))

// public class peakOfArray {
//     public static int peakFinder(int[] arr){
//         int n=arr.length;
//         for(int i=1; i<n; i++){

//             if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args){
//         int[] arr = {0,2,3,70,65,50,35,25,18,10,0};

//         System.out.println(peakFinder(arr));
//     }
// }
