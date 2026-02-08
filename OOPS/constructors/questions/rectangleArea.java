// Create a class Rectangle
// length, breadth
// Constructor
// Method to calculate area

public class rectangleArea{
    public static class Rectangle{
        double length;
        double breadth;


        Rectangle(double l, double b){
            length=l;
            breadth=b;
        }

        double area(){
            return length * breadth;
        }
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle(4.5,6.6);
        System.out.println("Area of rectangle is "+r.area());
    }
}