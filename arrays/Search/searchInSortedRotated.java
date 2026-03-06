// WAP to search an element in a sorted and rotated array using binary search (O(log n))

// public class searchInSortedRotated {
//     public static int sortedRotated(int[] arr, int target){
//         int n=arr.length;

//         int left = 0, right = n-1;

//         while(left<=right){
//             int mid = left+(right-left)/2;
//             if(arr[mid] == target) return mid;

//             // check if the left side is sorted
//             else if(arr[left] <= arr[mid]){

//                 // is element present in the left half
//                 if(arr[left] <= target && target < arr[mid]){
//                     right = mid-1;
//                 }else{
//                     left = mid+1;
//                 }

//                 // check if the right half is sorted 
//             }else{ // (arr[mid] <= arr[right])

//                 // is element present in the right half
//                 if(arr[mid] < target && target <= arr[right]){
//                     left = mid+1;
//                 }else{
//                     right = mid-1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] arr = {8,9,10,11,12,1,2,3,4,5,6,7};
//         int target = 11;

//         System.out.println("We got our target at idx "+sortedRotated(arr,target));
//     }   
// }


public class searchInSortedRotated{
    public static int sortedRotated(int[] arr, int target){
        int n=arr.length;

        int left=0, right=n-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target) return mid;

            else if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            
            else{ // (arr[mid]<=arr[right])
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {8,9,10,1,2,3,4,5,6,7};
        int target = 8;

        System.out.println(sortedRotated(arr,target));
    }
}