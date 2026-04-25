// 771. Jewels and Stones

public class jewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones){
        int count=0;

        char[] arr1 = jewels.toCharArray();
        char[] arr2 = stones.toCharArray();

        for(char n:arr1){
            for(char m:arr2){
                if(n==m){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels,stones));
    }
}
