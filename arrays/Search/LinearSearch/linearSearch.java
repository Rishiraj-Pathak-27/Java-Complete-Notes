// In this Approach is that we travel linearly in the whole array and check for the targeted element is found return else go ahead
public class linearSearch {
    public static void linearSearchFunction(int[] arr, int target){
        int n=arr.length;
        boolean isFound = false;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                isFound = true;
                System.out.println("Mil gaya");
                break;
            }
        }

        if(isFound == false){
            System.out.println("Nahi Mila");
        }
    }

    public static void main(String[] args){
        int[] arr = {4,2,5,6,1,9,6};
        int target = 9;

        linearSearchFunction(arr,target);
    }
}
