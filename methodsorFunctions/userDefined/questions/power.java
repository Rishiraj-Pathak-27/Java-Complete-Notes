// without function

/* public class power {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int pow = 1;

        for(int i = 1; i <= b; i++) {
            pow *= a;
        }
        System.out.println(pow);
    }
} */

// using function

/* import java.util.Scanner;
public class power {
    public static int pow(int a, int b) {
        int pow = 1; 
        for(int i = 1; i <= b; i++) {
            pow *= a;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();

        System.out.println("Power = "+pow(a,b));
    }
} */