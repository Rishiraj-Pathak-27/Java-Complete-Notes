// Count Positions Where nums[i] == i

public class elementEqualIndex{
    public static int elementIndex(int[] arr){
        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            if(arr[i]==i) count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {-1,1,2,3};
        System.out.println(elementIndex(arr));
    }
}