// import java.util.Scanner;

// public class forwardPrinting {
//     public static void main(String[] args){
//         Scanner ip = new Scanner(System.in);
//         int end=ip.nextInt();
//         int start=1;
//         print(start,end);
//     }    

//     public static void print(int start, int end){
//         if(start>end) return;
//         System.out.println(start);
//         print(start+1,end);
//     }
// }


// OR (using global variables)

import java.util.Scanner;
public class forwardPrinting{

    static int n;       // global variable n (till n)

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        n=ip.nextInt();

        print(1);
    }  

    public static void print(int x){
        if(x>n) return;
        System.out.print(x+" ");
        print(x+1);
    }
}