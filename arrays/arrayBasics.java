// Array is a simple linear data structure which is used to store multiple values in a single variable and it should be of same type

/* syntax -> datatype[] variable_name = {list of values};
OR
datatype[] variable_name = new datatype[size];     // Declaration
variable_name[index position] = value             // initialization
*/

// Eg.

/* public class arrayBasics {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        // accessing values
        System.out.println(arr[4]);       // single value at a time

        // updating values   -> because of array mutability
        arr[4] = 100;
        System.out.println(arr[4]);
    }
} */

// using loop

/* public class arrayBasics {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        
        // for(int i = 0; i <= 5; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        //OR

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
} */

// taking input from user

/* import java.util.Scanner;
public class arrayBasics {
    public static void main(String[] args) {

        // input taking

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = ip.nextInt();
        int[] arr = new int[n];   -> n size ka array

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        // output printing

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
} */

// public class arrayBasics {
//     public static void main(String[] args) {
//         int[] marks = {100,43,23,12,86,7,10};

//         for(int i = 0; i < marks.length; i++) {
//             if(marks[i] < 35) {
//             System.out.println("Rollno whose marks are less than 35 = "+i);
//             }
//         }
//     }
// }

public class arrayBasics {
    public static void main(String []args) {
        int arr[] = {2,3,4,5,6,67,1,3,10};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}