// Math. functions are predefined functions used to perform certain mathematical operations.

// 1. Math.sqrt()

/* public class math {
            public static void main(String []args) {
               int a = 169;
               System.out.println(Math.sqrt(a));     
            }
        } */
// 2. Math.cbrt()

/* public class math {
            public static void main(String []args) {
                int a = 27;
                System.out.println(Math.cbrt(a));
            }
        } */
// 3. Math.min()

/* public class math {
            public static void main(String []args) {
                double a = 12.4;
                double b = 23.1;
                System.out.println(Math.min(a,b));
            }
        } */
// 4. Math.max()

/* public class math {
            public static void main(String []args) {
               double a = 24.21;
               double b = 24.22;
               System.out.println(Math.max(a,b));
            }
        } */
// 5. Math.floor()

/* public class math {
            public static void main(String []args) {
                double a = 12.3223;
                System.out.println(Math.floor(a));
            }
        } */
// 6. Math.ceil()

/* public class math {
            public static void main(String []args) {
                double a = -12.3223;
                System.out.println(Math.ceil(a));       
            }
        } */
// 7. Math.abs()

/* public class math {
            public static void main(String []args) {
                int a = -40;
                System.out.println(Math.abs(a));
            }
        } */

// 8. Math.pow()

        /* public class math {
            public static void main(String[] args) {
                int a = 2;
                int b = 3;
                System.out.println(Math.pow(a,b));
            }
        } */

// Max out of 3 through built in functions

/* import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int a = ip.nextInt();
        int b = ip.nextInt();
        int c = ip.nextInt();

        System.out.println(Math.max(Math.max(a,b),c));
    }
} */

// Max out of 4 through built in functions

/* import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        int c = ip.nextInt();
        int d = ip.nextInt();

        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
} */

