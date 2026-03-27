public class countDigits {

    public static void digitsCounter(String str){
        int n=str.length();
        int count=0;
        int countTwo=0;

        for(int i=0; i<n; i++){
            if(str.charAt(i) >='0' && str.charAt(i) <= '9'){
                count++;
            }else{
                countTwo++;
            }
        }
        System.out.println("Digits = "+count);
        System.out.println("Alphabets = "+countTwo);
    }

    public static void main(String[] args){
        String str = "abcd123bcf89";
        
        digitsCounter(str);

    }
}
