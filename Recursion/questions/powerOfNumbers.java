// WAP to find out the power of number using recursion

public class powerOfNumbers {
    static int base;
    public static int reverse(int n){
        int reverse=0;
        
        while(n!=0){
            int rem=n%10;
            reverse = (reverse*10)+rem;
            n/=10;
        }

        return reverse;
    }

    public static int power(int n){
       
        if(n==0) return 1;
        int call = power(n/2);
        if(n%2==0) return call*call;
        else return base*call*call;
        
    }
    public static void main(String[] args){
        int n=3;
        base=n;
        int reverse = reverse(n);
        System.out.println(power(reverse));
    }
}
