public class reverseNumber{
    public static void main(String[] args){
        int n=234;
        System.out.println(reverse(n,0));
    }
    public static int reverse(int n,int reverse){
            if(n==0) return reverse;
            int rem=n%10;
            reverse=(reverse*10)+rem;
            reverse = reverse(n/=10,reverse);
            return reverse;
    }
    
}