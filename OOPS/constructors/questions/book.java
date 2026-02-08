// Create a class Book
// title, author
// 2 constructors
// One with both values
// One with only title (author = "Unknown")

public class book { 
    public static class Book{
        String title;
        String author;

        // constructor with both the values
        Book(String t, String a){
            title=t;
            author=a;
        }

        // constructor with author=null
        Book(String t){
            title=t;
        }

        void print(){
            if(author==null){
                System.out.println("Title of book is "+title+" & author = Unknown");
            }else{
                System.out.println("Title of book is "+title+" & author = "+author);
            }
        }
    }

    public static void main(String[] args){
        Book b1=new Book("Wings of Fire","APJ Abdul Kalam Azad");
        Book b2=new Book("Steps to create AI Agents");

        b1.print();
        b2.print();
    }
}
