// Create a method isPrime(int n) to check whether a number is prime.

/* public class prime {
    public static void prime(int n) {
        int a = n;
        int b = (int)Math.sqrt(n);
        boolean isPrime = true;

        if(n <= 1) {
            isPrime = false;
            System.out.println("Prime does not exist");
            return;
        }

        for(int i = 2; i <= b; i++) {
            if(a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
    
    public static void main(String[] args) {
        int n = 9;
        prime(n);
    }
} */


/* public class prime{
    
    public static void prime(int n) {
        int count = 0;
        

        if(n <= 1) {
            System.out.println("Invalid Number");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            System.out.println("Prime Number");
        } else {
        System.out.println("Not a Prime");
        }
    
    }
    
    public static void main(String[] args) {
        int n = 17;
        prime(n);
    }
} */

// Prime between 1-50

public class prime {
    
    public static void prime(int start, int end) {
        int a = start;
        int b = end;
        int count;

        for(int i = a; i <= b; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
        if(count == 2) {
            System.out.printf("Prime Number = %d\n",i);
        } 
        }

    }
    
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        prime(start,end);
    }
}