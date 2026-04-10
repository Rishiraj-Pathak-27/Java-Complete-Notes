public class maxProductSubarray{

    public static int maxProdSubarray(int[] arr){
        int n=arr.length;

        int maxProd = arr[0];
        int prod=1;

        // forward pass 
        for(int i=0; i<n; i++){
            prod *= arr[i];
            maxProd = Math.max(maxProd,prod);

            if(prod==0) prod=1;
        }

        // backward pass
        prod=1;

        for(int i=n-1; i>=0; i--){
            prod *= arr[i];
            maxProd = Math.max(maxProd,prod);

            if(prod==0) prod=1;
        }

        return maxProd;
    }

    public static void main(String[] args){
        int[] arr = {2,3,-2,4};

        System.out.println("Maximum Product Subarray = "+maxProdSubarray(arr));
    }
}