public class binarySearch {
    public static void BinarySearch(int[] arr, int target){
        int n=arr.length;   
        boolean isFound = false;

        int left=0, right=n-1;

        while(left<=right){
            int mid = (left+right)/2;
            
            if(arr[mid] ==  target) {
                isFound = true;
                System.out.println("Mil Gaya");
                break;
            }
            else if(arr[mid] < target) {
                left = mid+1;
            }
            else right = mid-1;
        }
        if(!isFound){
            System.out.println("Nahi Mila");
        }
    }
    public static void main(String[] args){
        int[] arr = {-76, -4, 9, 28, 47, 49, 510, 615, 9911, 99999};
        int target = 9911;

        BinarySearch(arr,target);
    }    
}
