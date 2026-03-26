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

        // contains() method is used to take an input string and check if it is existing in original String or not.
        System.out.println("Contains? = "+str.contains("Hell"));

        // startsWith() method is used to take an input string and check if the starting string of existing one is equal to the given string
        System.out.println(str.startsWith("Ye"));
        
        // endsWith() method is used to take an input string and check if the ending string of existing one is equal to the given string
        System.out.println(str.endsWith("ld"));
        
        // toLowerCase() method make the whole string in small
        System.out.println(str.toLowerCase());

        // toUpperCase() method make the whole string in capital
        System.out.println(str.toUpperCase());

        // concat() method add 2 or more strings together

        String htr = "xyz";
        String concatenate = str.concat(htr);
        System.out.println(concatenate);
        

        // substring() method is used to return all the continuous sub parts of the string
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(4,5));
        System.out.println(str.substring(0));

        for(int i=2; i<4; i++){
            System.out.print(str.substring(i));
        }
    }
}
