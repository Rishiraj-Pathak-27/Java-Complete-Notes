// WAP to Remove all spaces from a string.

import java.util.Scanner;
public class removeWhitespaces {

    public static String spacesRemove(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
            else{
                continue;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = ip.nextLine();

    System.out.println(spacesRemove(str));
    }
}
