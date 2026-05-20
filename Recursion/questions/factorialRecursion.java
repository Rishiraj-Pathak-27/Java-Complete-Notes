// normal code

// public class factorialRecursion {

//     public static int factorial(int n){
//         int fact=1;
//         int res=0;
//         if(n==0||n==1) return 1;

//         for(int i=n; i>=1; i--){
//             fact*=i;
//         }
//         return fact;
//     }

//     public static void main(String[] args){
//         int n=5;
//         System.out.println("Factorial"+factorial(n));
//     }
// }


// using recursion

public class factorialRecursion{

    public static int factorial(int n){
        if(n==0||n==1) return 1;

        return n*factorial(n-1); // 5*4*3*2*1
    }

    public static void main(String[] args){
        int n=5;
        System.out.println(factorial(n));
    }
}
