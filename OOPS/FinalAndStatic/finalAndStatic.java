// Final Keyword
// In java the final keyword is used with the variables, classname, or with the method where, 
// the entities with the final keyword cannot be changed

class Student{
    final String className = "X";
    int rollno;
    char grade;
    String name;

    String print(){
        return className;      // getter 
    }
} 
public class finalAndStatic{
    public static void main(String[] args){
    Student s1 = new Student();
    // s1.className = "IX";   we cannot change the value of the final variable (ERROR)
    System.out.println(s1.className);   
    System.out.println(s1.print());
    }
}


// Static Keyword 

// The static keyword in java is used with the variables, classname, or methods , that if we define them with any entity it becomes shareable
// with all of the objects, If we update the static entity using a single object it will get changes into the another objects too

/* class Student{
        int rollno;
        String name;
        static int className = 2;

        Student(int rollno, String name, int className){
            this.rollno = rollno;
            this.name = name;
            this.className = className;
        }
        Student(int rollno, int className){
            this.rollno=rollno;
            this.className = className;
        }
        void print(){
            System.out.println(rollno+" "+name+" "+className);
        }
    }
public class finalAndStatic{
    public static void main(String[] args){

        Student s1 = new Student(49,"Rishiraj",10);   
        Student s2 = new Student(51,9);
        Student.className = 11;      // whatever we modify inside the className it will be displayed even inside the objects containing the className attribute 
        System.out.println(Student.className);
        s1.print();
        s2.print();
    }
} */