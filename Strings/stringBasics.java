// In Java, the strings are the group or sequence of characters which are combined together
// These strings are immutable in nature
// In memory, Object is created of strings rather than the primitive types and are stored in heap memory


// Simple array Declaration & Initialization:
// String str;  // <- Declaration of strings
// String str = "Hello World";  // <- Initialization of strings

// public class stringBasics {
//    public static void main(String[] args){
//     String str;
//     str = "Hello World";

//     System.out.println(str);
//    }
// }



// Taking Input & Printing Output in String

// import java.util.Scanner;  //<- Must
// public class stringBasics {
//    public static void main(String[] args){

//     // taking intput
//     Scanner ip = new Scanner(System.in);

//     System.out.print("Enter string: ");
//     String str = ip.next();         // will ignore the string after any space detected
//     String str2 = ip.nextLine();   // will return the complete string

//     // Printing output
//     System.out.println(str);
//     System.out.println(str2);
//     }
// }


///////////////////////////////////////////////////


// PASSING INT, DOUBLE TO STRING

import java.util.Scanner;
public class stringBasics{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        double m=ip.nextDouble();

        String str1 = ""+n;
        String str2 = ""+m;

        System.out.println(str1.length());
        System.out.println(str2.length());
    }
}