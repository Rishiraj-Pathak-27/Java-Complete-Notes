// WAP to remove the extra spaces from the string

public class removeExtraSpaces{

    public static String removeExtra(String s){
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String ele:arr){
            sb.append(ele);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "  Hello    World  ";
        System.out.println(removeExtra(s));
    }
}