// Functions are the user defined set of operations which are used to perform certain tasks when it is called

/* syntax ->  public static void func_name(para1,para2,para n) {
                // code to be executed
                }*/
// Eg.

/* public class function {
    public static void print() { 
        System.out.println("Hello World From Java");
    }

    public static void main(String[] args) {
        isPrint();   // Hi I am Rishiraj (10 Times)
        print();    // Hello World From Java
        System.out.println("Exit");   

    }
    public static void isPrint() {
        for(int i = 1; i <= 10; i++) {
        System.out.println("Hi I am Rishiraj");
        }
    }
} */


// Eg.
/* public class function {
    public static void funcOne() {
        System.out.println("Hello");
    }

    public static void funcTwo() {
        funcOne();
        System.out.println("World");
    }

    public static void funcThree() {
        funcTwo();
        System.out.println("From Java");
    }

    public static void main(String[] args) {
        funcTwo();
        funcThree();
    }

    // Hello
    // World
    // Hello
    // World
    // From Java
} */


// Infinite Function Call

/* public class function {
    public static void main(String []args) {
        funcOne();
    }
    public static void funcOne() {
        System.out.println("Rishi");
        funcTwo();
    }
    public static void funcTwo(){
        System.out.println("Raj");
        funcThree();
    }
    public static void funcThree() {
        System.out.println("Pathak");
        funcOne();
    }
} */

