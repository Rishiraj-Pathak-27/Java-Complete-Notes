// The string builder class is used to remove & overcome the issues occur in the string, i.e the issue of interning -> immutability -> poor performance.
// The string builder is a powerful class that provides certain ways to remove these issues

// There are 3 types of declaration & initialization methods in string builder:

// 1) Default constructor StringBuilder: 

// StringBuilder var_name = new StringBuilder();
// here the default capacity is of 16 size.

// 2) StringBuilder with capacity:

// StringBuilder var_name = new StringBuilder(100);

// 3) StringBuilder with string:

// StringBuilder var_name = new StringBuilder("hello");


// Eg)

/* public class basics {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
    }
}*/

