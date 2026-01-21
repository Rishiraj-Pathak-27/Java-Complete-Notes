// Count how many even and odd numbers are in the array

public class evenOdd {
    public static void evenOdd(int[] arr) {
        int n = arr.length;
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                System.out.printf("%d is Even\n",arr[i]);
                evenCount++;
            }
            else {
                System.out.printf("%d is Odd\n",arr[i]);
                oddCount++;
            }
        }
        System.out.println("Total Even = "+evenCount);
        System.out.println("Total Odd = "+oddCount);
    }
    
    public static void main(String[] args) {
        int[] arr = {3,542,23,123,67,9889,03232}; 
        evenOdd(arr);   
    }
}