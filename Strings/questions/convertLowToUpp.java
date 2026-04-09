// Convert lowercase to uppercase (without built-in methods)

/* public class convertLowToUpp {

    public static String lowToUp(String str){
        int n=str.length();
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<n; i++){
            boolean flag = false;

            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ch == ' ') continue;
            if(ch>='0' && ch<='9') continue;

            if(ascii >= 97 && ascii <= 122){
                flag=true;
            }

            if(flag){
                ascii -= 32;
                char dh = (char)ascii;
                sb.setCharAt(i, dh);
            }
        }

        str = sb.toString();

        return str;

    }

    public static void main(String[] args){
        String str = "Rishiraj";

        System.out.println(lowToUp(str));
    }
} */



////////////////////////////////////////////////////////////


// Convert uppercase to lowercase (without built-in methods)

public class convertLowToUpp{

    public static String upToLow(String str){
        int n=str.length();
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<n; i++){
            boolean flag = false;

            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ch>=65 && ch<=90){
                flag = true;
            }


            if(flag){
                ascii += 32;
                char dh = (char)ascii;
                sb.setCharAt(i, dh);
            }
        }
        str = sb.toString();
        return str;
    }

    public static void main(String[] args){
        String str = "RISHIraj";

        System.out.println(upToLow(str));
    }
}
