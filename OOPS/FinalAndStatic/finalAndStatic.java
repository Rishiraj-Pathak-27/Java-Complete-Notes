class Student{
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
}