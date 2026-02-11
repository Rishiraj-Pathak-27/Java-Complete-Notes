// WAP to create a fraction class & perfrom operations based on it

public class fractionClass {
    public static class Fraction{
        int num;
        int den;

        Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }

        void addFraction(Fraction f){
            num = num * f.den + den * f.num;
            den = den*f.den;
            simplify();
        }

        void multiply(Fraction f){
            num = num * f.num;
            den = den * f.den;
            simplify();
        }

        void simplify(){
            // boolean isNeg = (num*den < 0) ? true : false;
            // num = Math.abs(num);
            // den = Math.abs(den);
            int gcd = hcf(num,den);
            num = num/gcd;
            den = den/gcd;
            // if(isNeg) num = -num; 
        }
        int hcf(int a, int b){
           if(a==0) return b;
           return hcf(b%a,a);
        }

        void print(){
            System.out.println(num+"/"+den);
        }
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction(7,3);
        Fraction f2 = new Fraction(3,7);
        Fraction f3 = new Fraction(-50,-100);   // positive result

        f1.print();
        f2.print();
        
        
        // add
        
        // f1.addFraction(f2);
        // f1.print();
        
        // mul
        
        f1.multiply(f2);
        f1.print();
        f3.print();

    }
}
