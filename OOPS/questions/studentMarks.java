// Create class Student
// private marks
// If marks > 100, don’t accept
// Getter to show marks

class Student{
    private int marks;

    public void setMarks(int m){
        if(m > 100){
            System.out.println("Invalid Marks");
        }else{
            marks=m;
        }
    }

    public int getMarks(){
        return marks;
    }
}

public class studentMarks{
    public static void main(String[] args){
        Student s=new Student();
        s.setMarks(97);
        System.out.println("Marks = "+s.getMarks());
    }
}