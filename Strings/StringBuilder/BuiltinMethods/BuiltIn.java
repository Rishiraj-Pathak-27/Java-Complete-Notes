// The string builder is a powerful class which contains certain built in methods to make the string mutable without interning (i.e extra space usage)


// 1) append(char/string) method is used to append the char/string at the end of the original string

/* public class builIn {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        System.out.println(str);
    }
} */

// 2) setCharAt(idx,char) method is used to update the char at a particular idx position in the original string

/* public class builIn {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        str.setCharAt(0,'D');
        str.setCharAt(6, 'M');
        System.out.println(str);
    }
} */

// 3) index(idx,char) method is used to insert a particular char in the middle of the original string

/* public class builIn {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
        str.insert(2,'y');
        
        System.out.println(str);
    }
} */

// 4) deleteCharAt(idx) method is used to delete a char from a particular index location from the original string

/* public class builIn {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello");
       
        str.deleteCharAt(0);
        
        System.out.println(str);
    }
} */

// 5) reverse() method is used to reverse the original string

// Eg1) creating own reverse() function

/* public class builIn {
    public static StringBuilder reverse(StringBuilder str){

        int n=str.length();
        int left=0, right = n-1;

        while(left<right){
            char temp=str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, temp);
            left++;
            right--;
        }
        return str;
    } 
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Mathematics");
        System.out.println(reverse(str));    
    }
} */

// Eg2) Using built in reverse() function

/* public class BuiltIn{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Mathematics");
        System.out.println(str.reverse());
    }
}*/

// 6) delete(start,end) method is used the delete a single/sqe of chars from the original string

/* public class BuiltIn{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Mathematics");
        str.delete(4, 11);  // range 4 -> 10
        System.out.println(str); 
    }
} */


// EG.

// public class BuiltIn{
//     public static void main(String[] args){
//         StringBuilder str = new StringBuilder("Rishiraj");

//         str.append(" Pathak");
//         System.out.println(str);    // Rishiraj Pathak

//         str.setCharAt(1,'u');
//         System.out.println(str);    // Rushiraj Pathak

//         str.insert(0,'H');
//         System.out.println(str);    // HRushiraj Pathak

//         str.deleteCharAt(0);
//         System.out.println(str);    // Rushiraj Pathak

//         str.reverse();
//         System.out.println(str);     // kahtaP jarihsuR

//         str.delete(0,7);
//         System.out.println(str);    // jarihsuR
//     }
// }

