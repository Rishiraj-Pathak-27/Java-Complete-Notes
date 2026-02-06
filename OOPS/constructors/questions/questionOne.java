// Create a class Laptop with:
// brand, price
// Constructor to initialize both
// Print details

public class questionOne{
    public static class Laptop{
        String brand;
        int price;

        Laptop(String b, int p){
            brand=b;
            price=p;
        }

        public void print(){
            System.out.println(brand+" "+price);
        }
    }

    public static void main(String[] args){
        Laptop l = new Laptop("HP",75000);

        l.print();
    }
}