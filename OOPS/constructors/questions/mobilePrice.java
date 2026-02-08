// Create a class Mobile
// brand, price
// Overloaded constructors:
// No argument
// Brand only
// Brand + price

public class mobilePrice{
    public static class Mobile{
        String brand;
        int price;

        // constructor 1 (Default)
        Mobile(){}

        // constructor 2 (Brand)
        Mobile(String b){
            brand=b;
        }

        // constructor 3 (Brand+price)
        Mobile(String b, int p){
            brand=b;
            price=p;
        }

        void print(){
            if(brand==null && price==0){
                System.out.println("Brand = Unknown & Price = Unknown");
            }else if(price==0){
                System.out.println("Brand = "+brand+" & Price = Unknown");
            }else{
                System.out.println("Brand = "+brand+" & Price = "+price);
            }
        }
    }

    public static void main(String[] args){
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Google Pixel 9 Pro");
        Mobile m3 = new Mobile("Samsung",150000);

        m1.print();
        // m2.print();

        // we can change the values from here using the object name 
        m2.brand = "Google Pixel 9";
        m2.print();
        m3.print();
    }
}
