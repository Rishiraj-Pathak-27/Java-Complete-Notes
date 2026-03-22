// When we create a function as 'void' then it does not have a return type
// when we create a function as 'any datatype' then it should be provided with a return statement bcoz here 'any datatype' is a return type
// for every condition the return statement is necessary (eg. if & else)


// eg. (return type = int)

/* public class returnType {
    public static int max(int a, int b, int c) {

        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(max(5,3,6));
    }
} */


// eg. (mandatory return statement)

/* public class returnType {
    public static int max(int a, int b) {
        if(a > b) return a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(max(5,8));
    }
} */

