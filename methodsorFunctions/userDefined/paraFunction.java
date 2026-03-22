/* syntax -> public static void func_name(para1,para2...paran) {
                        // code to get executed when a function is called                       
                            } 
            func_name(arg1, arg2, ... argn);

    */

// Eg. add 2 nos.

public class paraFunction {
    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add(5,10);
    }
}