// Count the Digits That Divide a Number

public class countDigits {
    public static int count(int n){
        int count=0;
        int copy=n;

        while(n!=0){
            int rem = n%10;
            if(rem!=0 && copy%rem == 0){
                count++;
            }
            n/=10;
        }
        return count;
    }

    public static void main(String[] args){
        int n=1248;
        System.out.println(count(n));
    } 
}
