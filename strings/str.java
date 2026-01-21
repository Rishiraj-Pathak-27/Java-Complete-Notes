 // In java, String has a special support and also it acts as a class.
// Immutable in nature

/* Three ways to instantiate a String
1) String reference_name = new String("_________________");
2) String variable_name = "_______________";
3) String reference/variable_name;
   reference/variable_name = new String("________________");
*/

/* public class str{
    public static void main(String []args){
        // String name = new String("Rishiraj Pathak");
        // String name = "Rishiraj Pathak";
        // String name;
        // name = new String("Rishiraj Pathak");
        System.out.print(name);
    }
} */

// Different ways to print a statement

/* public class str{
    public static void main(String []args){
        int a = 30;
        float b = 9.566788f;

        // (print) used to print the statements in a single line
        // System.out.print("Value of a is: ");
        // System.out.print(a);

        // (println) used to print the statements in the next line
        // System.out.println("Value of b is: ");
        // System.out.println(b);

        // (printf) replaces the given data with the notations (e.g %d -> int double, %f -> float, %c -> char, %s -> string)
        // System.out.printf("The value of a is %d & the value of b is %f",a,b);

        // (format) also works same as the (printf)
        // System.out.format("The value of a is %d & the value of b is %f",a,b);
    }
}

*/

/** String Methods in Java 
 * .length()
 * .toUpperCase()
 * .toLowerCase()
 * .trim()
 * .Substring(int start,int end)
 * .replace(old char, new char)
 * .startsWith(char)
 * .endsWith(char)
 * .charAt(index)
 * .indexOf(char,index)
 * .lastIndexOf(char,index)
 * .equals(string)
 * .equalsIgnoreCase(string)
 */


/* public class str{
    public static void main(String []args){
        String name;
        name = new String("Brook");
        String name1 = "      Brook         ";
        String name2 = "rishiraj";

        System.out.printf("Length = %s\n",name.length());
        System.out.printf("Lower Case String = %s\n",name.toLowerCase());
        System.out.printf("Upper Case String = %s\n",name.toUpperCase());
        System.out.printf("Trimmed String = %s\n",name1.trim());
        System.out.printf("Sliced part = %s\n",name.substring(4));
        System.out.printf("Sliced part = %s\n",name.substring(2,5));
        System.out.printf("Replaced/Updated String = %s\n",name.replace("o","ea"));
        System.out.printf("Replaced/Updated String = %s\n",name.replace("oo","ea"));
        System.out.printf("Starts with = %s\n",name.startsWith("br"));
        System.out.printf("Ends with = %s\n",name.endsWith("kj"));
        System.out.printf("Char At = %s\n",name.charAt(4));
        System.out.printf("Index of = %s\n",name.indexOf("ok"));      // returns first occurance of the character

        System.out.println(name2.indexOf('r',1));    // if the index is given then it will starts finding the character from that index location else it will return the character which it will find first.
        System.out.println(name.lastIndexOf('o'));   // this will check from the last but returns the result with has occurred at the last
        System.out.println(name.lastIndexOf("oo",3));
        System.out.println(name.equals("Brook"));   // OR
        System.out.println(name.equals(name));
        System.out.println(name.equalsIgnoreCase("brOOk")); // this method will ignore the case of the string and will return true if correct

        String goodName = "Brookok";
        System.out.println(goodName.indexOf("ok"));     // 3
        System.out.println(goodName.indexOf("ok",4));    // 5
        System.out.println(goodName.lastIndexOf("ok")); // 5
        System.out.println(goodName.lastIndexOf("ok", 4)); // 3  
    }
}

*/

// import java.util.Scanner;
// public class str {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the 1st Name: ");
//         String name1 = ip.nextLine();
//         System.out.println("Enter the 2nd Name: ");
//         String name2 = ip.nextLine();
//         System.out.println("Enter the 3rd Name: ");
//         String name3 = ip.nextLine();


//         System.out.println("Name One = "+name1);
//         System.out.println("Name Two = "+name2);
//         System.out.println("Name Three = "+name3);

//         System.out.println(name1 + " & " + name2 + "are EQUAL=" + name1.equals(name2));
//         System.out.println(name1 + " & " + name3 + "are EQUAL=" + name1.equals(name3));
//         System.out.println(name2 + " & " + name3 + "are EQUAL=" + name2.equals(name3));

//     }
// }