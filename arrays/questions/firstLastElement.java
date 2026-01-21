// Find the first and last element

public class firstLastElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int first;
        int last;

        first = arr[0];
        last = arr[n - 1];

        System.out.println("First element = "+first); 
        System.out.println("Last element = "+last); 
        
    }
}