// WAP to remove duplicates from the sorted array  


public class removeDuplicates {
    public static int duplicatesRemoved(int[] arr){
        int n=arr.length;
        int i=0;

        for(int j=1; j<n; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2};
        System.out.println(duplicatesRemoved(arr));
    }
}