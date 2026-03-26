// In Strings we use the interning to save the space of the intern pool & use the memory efficiently.

public class interning {
    public static void main(String[] args){
        String s = "Hello";
        String x = "Hello";     // Both the s,x = "Hello" are garbage as they are updated to "Yello" & "Mello"
        x = "Yello";
        s = "Mello";
        System.out.println(x);
    }    
}
