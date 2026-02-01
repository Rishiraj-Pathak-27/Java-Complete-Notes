// find ncr & npr 

// ncr = n!/r!(n-r)!
// npr = n!/(n-r)!

// without function

/* import java.util.Scanner;
public class permutationAndCombination {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter values of n & r: ");
        int n = ip.nextInt();
        int r = ip.nextInt();

        int nFact = 1;

        for(int i = n; i >= 1; i--) {
            nFact *= i;
        } 

        int rFact = 1;

        for(int i = r; i >= 1; i--) {
            rFact *= i;
        } 

        int nrFact = 1;

        for(int i = n-r; i >= 1; i--) {
            nrFact *= i;
        } 


        int ncr = nFact/(rFact*nrFact);
        System.out.println(ncr);
    }
} */


// using function

import java.util.Scanner;
public class permutationAndCombination {
    public static int ncrNpr(int a) {
        int fact = 1;

        for(int i = a; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter values of n & p: ");
        int n = ip.nextInt();
        int r = ip.nextInt();

        int ncr = ncrNpr(n)/(ncrNpr(r)*ncrNpr(n-r));
        int npr = ncrNpr(n)/ncrNpr(n-r);

        System.out.printf("NCR = %d\nNPR = %d",ncr,npr);
    }
}