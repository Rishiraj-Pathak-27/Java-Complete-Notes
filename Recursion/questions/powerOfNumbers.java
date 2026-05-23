// WAP to find out the power of number using recursion

// TC O(log n)

public class powerOfNumbers {
    static int base;  // global variable base
    public static int reverse(int n){
        int reverse=0;
        
        while(n!=0){
            int rem=n%10;
            reverse = (reverse*10)+rem;
            n/=10;
        }

        return reverse;
    }

    public static int power(int n){     // power(5)
       
        if(n==0) return 1;
        int call = power(n/2);      // power(2) , power(1), power(0)
        if(n%2==0) return call*call;
        else return base*call*call;     // 3125
        
    }
    public static void main(String[] args){
        int n=5;
        base=n;
        int reverse = reverse(n);  // reverse(5) = reverse = 5
        System.out.println(power(reverse));
    }
}


// OR (TC O(n))

// public class powerOfNumbers {
//     static int base;
//     public static int reverse(int n){
//         int reverse=0;
        
//         while(n!=0){
//             int rem=n%10;
//             reverse = (reverse*10)+rem;
//             n/=10;
//         }

//         return reverse;
//     }

//     public static int power(int n){
       
//        if(n==0) return 1;
//        return base*power(n-1);
        
//     }
//     public static void main(String[] args){
//         int n=5;  //5 to the power 5
//         base=n;
//         int reverse = reverse(n);
//         System.out.println(power(reverse));
//     }
// }
