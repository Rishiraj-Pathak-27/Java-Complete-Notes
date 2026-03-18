/** Loops in Java are used to repeatedly execute a given task until its condition becomes true 
 There are few types of loops used in Java Programming:
 * While Loop
 * do-While Loop
 * for Loop */

// While Loop

/** The while loop is used to execute a particular task n number of times until the given condition becomes false.
 
 * Syntax:  initialization
 *          while(condition) {
            updation
            block of code
            ..        
            }
*/

// eg: 

/** import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int val1 = ip.nextInt();
        System.out.println("Enter ending value: ");
        int val2 = ip.nextInt();
        System.out.printf("Range = %d - %d\n",val1,val2);
        while(val1 <= val2) {
            System.out.println(val1);
            val1++; 
        }
    }
} */

// do-While Loop

/** The do-while loop is used to execute a specific task n number of times until the condition evaluated to False
 * The do-while loop works same as the while loop but in this case the while loop first checks the condition and then executes a code,
 * & the do-while loop first get into the loop and then check the condition.
 * Even condition evaluates to false, the do-while loop executes it atleast once
 */

/* syntax -> initialization
             do{
             // block of code
             // updations
             }while(condition); */

// eg.

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter n natural numbers: ");
//         int num = ip.nextInt();
//         int i = 1;

//         do{
//             System.out.println(i);
//             i++;
//         } while(i <= num);

//     }
// }


// for loop

/** The for loop in java is used to execute certain task repeatedly where the for loop already know that how much times it should get executed */

/* Syntax -> for(initialization;condition;updation){
                // block of code        
                } */

// Eg. (Odd numbers of n natural numbers)

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter n natural numbers: ");
//         int n = ip.nextInt();

//         for(int i = 0; i <= n; i++){
//             System.out.println(2*i+1);
//         }
//     }
// }



// Eg.(Reversing a number list)

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter a list of naturals numbers: ");
//         int n = ip.nextInt();

//         for(int i = n; i != 0; i--) {
//             System.out.println(i);
//         }
//     }
// }

/////////////////////////////////////////////////////////////////////////

// break statement

//eg. (for - loop)

// public class loops {
//     public static void main(String []args) {
//         for(int i = 0; i < 5; i++){
//             System.out.println(i);
//             System.out.println("Java is best");
            
//             if(i==3){
//                 System.out.println("Break executes");
//                 break;
//             }
//         }
//         System.out.println("Loop ends");
//     }
// }


// Program to continuously ask for the user input till it enters 0, if entered then sum up the previous numbers and display

// while - loop

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args){
//         Scanner ip = new Scanner(System.in);

//         int i = 0;
//         int n = 0;
//         while(n <= 50){
//         System.out.println("Enter a number: ");
//         n = ip.nextInt();
            
//             i += n;

            
//             if(n==0){
//                 System.out.println("0 found");
//                 break;
//             }
//             n++;
            
//         // System.out.println("Loop ends");   // next statement
//         }
//         System.out.println("Sum = "+i);

//     }
// }

// do-while loop

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         int sum = 0;
//         int n;

//         do{
//             System.out.println("Enter a number: ");
//             n = ip.nextInt();
//             sum += n;

//             if(n == 0) {
//                 System.out.println("0 found");
//                 break;
//             }
//             n++;
//         } while(n <= 50);
//         System.out.println("Sum = "+sum);
//     }
// }


//eg. (while - loop)

// public class loops {
//     public static void main(String []args) {
//         int i = 0;
//         while(i<5){
//             System.out.println(i);
//             System.out.println("Java is best");

//             if(i==3) {
//                 System.out.println("Break executes");
//                 break;
//             }
//             i++;
//         }
//         System.out.println("Loop ends");
//     }
// }

//eg. (do-while - loop)

// public class loops {
//     public static void main(String []args) {
//         int i = 0;
//         do{
//             System.out.println(i);
//             System.out.println("java is best");

//             if(i==3) {
//                 System.out.println("Break executes");
//                 break;
//             }
//             i++;

//         } while(i<5);
//         System.out.println("Loop ends");
//     }
// }

// continue statement

//eg. (for - loop) 

// public class loops {
//     public static void main(String []args) {
//         for(int i = 0; i < 5; i++){
//             if(i==3){
//                 System.out.println("continue executes");
//                 continue;
//             }
//             System.out.println(i);
//             System.out.println("java is best");

//         }
//         System.out.println("Loop ends");
//     }
// }

//eg. (while - loop)

// public class loops{
//     public static void main(String []args) {
//         int i = 0;
//         while(i < 5){
//             i++;
//             if(i==3){
//                 System.out.println("Continue executes");
//                 continue;
//             }

//             System.out.println("Java is best");
//             System.out.println(i);
            
//         }
//         System.out.println("Loop ends");
//     }
// }


//eg. (do-while - loop)

// public class loops {
//     public static void main(String []args) {
//         int i = 0;
//         do {
//             i++;
//             if(i==3){
//                 System.out.println("Continue executes");
//                 continue;
//             }

//             System.out.println(i);
//             System.out.println("Java is best");

//         } while(i <= 5);
//     }
// }


//eg. (WAP that adds the +ve no. and neglect if -ve no. & zero encounters)

// (using while - loop)

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         int i = 0;
//         int n = 0;

//         while(n <= 50) {
//             System.out.println("Enter a number: ");
//             n = ip.nextInt();

//             if(n > 0){
//                 i += n;
//                 n++;
//                 continue;
//             }

//             n++;
//         }
//         System.out.println("Sum of +ve numbers = "+i);   // next statement
//     }
// }

// (using do-while - loop)

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         int i = 0;
//         int n = 0;

//         do {
//             System.out.println("Enter a no: ");
//             n = ip.nextInt();

//             if(n > 0) {
//                 i += n;
//                 n++;
//                 continue;
//             }

//             n++;
//         } while(n <= 50);
//         System.out.println("Sum of +ve numbers = "+i);  // next statement

//     }
// }

// using for loop

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         int sum = 0;
//         int n = 0;

       
//             for(int i = 1; i <= 10; i++) {
//             System.out.println("Enter a no: ");
//             n = ip.nextInt();

//             if(n > 0) {
//                 sum += n;
//                 n++;
//                 continue;
//             }

//             n++;
//          }
//         System.out.println("Sum of +ve numbers = "+sum);  // next statement
//         }
//     }


//////////////////////////////////////////////////////////////////////

/* public class loops {
    // public static void stdPattern(int n){
    //     for(int i=0;i<=n;i++){
    //         for(int j=0;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String []args) {
        int n = 4;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // stdPattern(n);
    }
} */

// public class loops {
//     public static void advancedPattern(int rows, int col) { 
//         for(int i = 0; i <= rows; i++) {
//             for(int j = 0; j <=col; j++) {
//                 if(i==0||i==rows||j==0||j==rows) {
//                     System.out.print(" *");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//         // System.out.println();
//     }
//     public static void main(String []args){

//     advancedPattern(3,3);
//     }
// }








