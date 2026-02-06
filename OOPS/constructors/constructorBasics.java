// The constructor is the special method which is initialized/created when we create objects
// but here we can create a constructor by passing certain parameters to it and when we create an object we can call it.

/*  syntax --> 1) default constructor - class_name(){ //code }
               2) parameterized constructor - class_name(para1,para2---paran) { //code }
               3) when we create multiple constructor then it is a constructor overloading */

// eg.

public class constructorBasics{
    public static class Student {
        String name;
        int age;
        char grade;
        String email;
        
        // multiple constructors = constructor overloading

        // default constructor
        Student(){ }

        // parameterized constructor
        Student(String n, int a, char g, String e){
            name=n;
            age=a;
            grade=g;
            email=e;
        }

        Student(int a, String n, String e, char g){
            age=a;
            name=n;
            email=e;
            grade=g;
        }

        void print(){
            System.out.println(name+" "+age+" "+grade+" "+email);
        }
    }
    public static void main(String[] args){
        Student s = new Student();
        s.name="Rishiraj";
        s.age=20;
        s.grade='A';
        s.email="rishi@gmail.com";

        s.print();

        Student s2 = new Student("John",22,'B',"john@gmail.com");

        s2.print();

        Student s3 = new Student(18,"Brock","brock@gmail.com",'C');

        s3.print();
    }
}


