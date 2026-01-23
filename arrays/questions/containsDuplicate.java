// Check if an Array Contains Duplicates

public class containsDuplicate{
    public static boolean duplicates(int[] arr){
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                // as soon as find the duplicate return true
                if(arr[i]==arr[j]){
                    return true;
                }
            }         
        }
        return false;  
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println("Contains Duplicate = "+duplicates(arr));
    }
}