// There are so many Build in methods present in string package used to make our work easier
// String methods are used with the string operator to make the use of it efficiently 

// There are few methods in strings such as:
// 1) length()
// 2) charAt()


import java.util.Scanner;
public class methods {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Define string: ");
        String str = ip.nextLine();

        // length() method returns the size of the string
        int length = str.length();
        System.out.println("Length = "+length);

        // chatAt() method is used to return a single character from a String unlike we use[i] in array
        int n=2;
        char ch = str.charAt(n);
        System.out.printf("Char at %d is %s\n",n,ch);

        // indexOf() method is used to return the index of a particular character
        char character = 'a';
        int idx = str.indexOf(character);
        System.out.printf("Index of %s is %d\n",character,idx);

        // compareTo() method compares 2 strings lexographically and return result in 3 states 0,+ve,-ve
        String gtr = "Yello";
        System.out.println(str.compareTo(gtr));

        
    }
}
