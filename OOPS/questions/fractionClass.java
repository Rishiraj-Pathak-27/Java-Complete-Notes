// WAP to create a fraction class & perfrom operations based on it

public class fractionClass {
    public static class Fraction{
        int num;
        int den;

        Fraction(int num, int den){
            this.num = num;
            this.den = den;
        }

        void addFraction(Fraction f){
            num = num * f.den + den * f.num;
            den = den*f.den;
        }

        void multiply(Fraction f){
            num = num * f.num;
            den = den * f.den;
        }

        void print(){
            System.out.println(num+"/"+den);
        }
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction(7,3);
        Fraction f2 = new Fraction(3,7);

        f1.print();
        f2.print();


        // add

        // f1.addFraction(f2);
        // f1.print();

        // mul

        f1.multiply(f2);
        f1.print();

    }
}
