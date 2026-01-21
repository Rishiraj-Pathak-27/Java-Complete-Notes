// Find the Product of All Elements

public class arrayProduct{
    
    public static int product(int[] arr) {
        int n = arr.length;
        int product = 1;

        for(int i=0; i<n; i++) {
            product *= arr[i];
        }
        return product;
    }
    public static void main(String []args) {
        int[] arr = {3,4,2,5,1};
        System.out.println("Product of array = "+product(arr));
    }
}