public class secondSmallest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,5,50,60};
        int min = arr[0];
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
            min = arr[i];
            }
        }
        System.out.println("Smallest Element = "+min);
        int smin = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] < smin && arr[i] > min) smin = arr[i];
        }
        System.out.println("Second Smallest Element = "+smin);
    }
}