// 1812. Determine Color of a Chessboard Square

public class chessBoardColor {

    public static boolean chessBoard(String s){
        if(s.charAt(0) % 2 == s.charAt(1) % 2){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "h3";
        System.out.println(chessBoard(s));
    }
}
