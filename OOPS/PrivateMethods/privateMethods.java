// we use the private access modifier to not allow to change the values of that particular attribute
// so we use the getters and setter to implement data hiding into it

class Student{
    private String name;     // cannot accessed directly as it has private modifier
    private int age;        // if we try to access it directly it will give error
    private int rollno;    // if we call it through method it will give default values

    void print(){
        System.out.println(name+" "+age+" "+rollno);
    }

    // setter methods
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
    public void setRollno(int rno){
        rollno=rno;
    }

    // getter methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollno(){
        return rollno;
    }

}

public class privateMethods {
    public static void main(String[] args){
        Student s = new Student();
        s.print();                  // this will directly print the private attributes which will provide their default values
        s.setName("Rishiraj");   // call the setter to set name
        s.setAge(20);           // call the setter to set age
        s.setRollno(49);     // call the setter to set the rollno

        System.out.println(s.getName());       // call the getter to print name
        System.out.println(s.getAge());       // call the getter to print age
        System.out.println(s.getRollno());   // call the getter to print rollno
    }
}
