public class removeDuplicatesTwo {
    public static int removeDuplicates(int[] arr){
        int n=arr.length;

        if(n<=2) return n;

        int i=2;

        for(int j=2; j<n; j++){
            if(arr[i-2] != arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args){
        int[] arr = {0,0,0,0,1,1,1,1,2,2,2,2};

        System.out.println(removeDuplicates(arr));
    }    
}
