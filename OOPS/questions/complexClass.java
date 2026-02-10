// WAP to create a complex number class

public class complexClass {
    public static class CompNumClass {
        int x;
        int y;

        CompNumClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void print() {
            if (y >= 0) {
                System.out.println("Complex Number = "+x + " + " + y + "i ");
            } else {
                System.out.println("Complex Number = "+x + " - " + Math.abs(y) + "i ");
            }
        }

        void complexAdd(CompNumClass c) {
            System.out.println("After addition: ");
            x += c.x;
            y += c.y;
        }

        void complexSub(CompNumClass c){
            System.out.println("After Subtraction: ");
            x -= c.x;
            y -= c.y;
        }

        void complexMul(CompNumClass c){
            System.out.println("After Multiplication");
            this.x = x*c.x - y*c.y;
            this.y = x*c.y + y*c.x;
        }
    }

    public static void main(String[] args) {
        CompNumClass c1 = new CompNumClass(3, 5);
        c1.print();
        CompNumClass c2 = new CompNumClass(10, -20);
        c2.print();
        // Add
        c1.complexAdd(c2);
        c1.print(); c2.print();
        // sub
        c1.complexSub(c2);
        c1.print(); c2.print();
        // Mul 
        c2.complexMul(c1);
        c1.print(); c2.print();


    }
}
