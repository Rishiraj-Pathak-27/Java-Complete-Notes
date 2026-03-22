import java.util.Scanner;
public class swapTwo {
    public static void swap(int a, int b) {
       // x=5, y=10
        a = a + b;  // x = 15
        b = a - b; // y = 5
        a = a - b; // x = 10

        System.out.printf("After Swapping a = %d & b = %d swap function\n",a,b);
        // it is swapped but due to pass by value it makes a copy of the original variables in it
        
    } 
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = ip.nextInt();    // 5
        int b = ip.nextInt();   // 10

        System.out.printf("Before Swapping a = %d & b = %d main function\n",a,b);
        swap(a,b);   // this a & b will not get swap as this is executing in its own local space 
        // because of which they print the local values ie a=5 & b=10 as it is
       
        
    }
}