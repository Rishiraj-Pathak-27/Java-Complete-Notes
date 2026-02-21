// Using the OOPS in java we can create our own array list 


class ArrayList{
    int[] arr;
    int size = 0;
    int index = 0;

    ArrayList(int capacity){
        arr = new int[capacity];
    }

    // returning array size/capacity
    int capacity(){
        return arr.length;
    }

    // function for increased capacity case
    void capacityIncreased(){
         
            int[] bigArray = new int[arr.length*2];
            for(int i=0; i<arr.length; i++){    // copy and paste from arr to bigArray
                bigArray[i] = arr[i];
            } 
            // again the arr is pointing to the bigArray in memory 
            arr = bigArray;
    }

    // returning the ele at particular index
    void add(int ele){
        if(index == size) {       // array is full 
            capacityIncreased();
        }

        arr[index++] = ele;
        // size will be updated as elements entering
        size++;
    }

    int get(int index){
        return arr[index];
    }

    void set(int index, int val){
        arr[index] = val;
    }

    // removing element
    void remove(int index){
        System.out.println(arr.length);
        for(int i=index; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
  
        index--;
        size--;
    }

    void display(){
        for(int i=0; i<size ; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class arrayListCreation {
    public static void main(String[] args){
        ArrayList a = new ArrayList(5);
        a.add(10); a.add(20); a.add(30); a.add(40); a.add(50);
        a.display();
        // display size
        System.out.println("Size = "+a.size); 
        // get method
        System.out.println(a.get(2));
        a.add(60);
        a.display();

        // setting a value
        a.set(1, 25);
        a.display();

        // removing the elements
        a.remove(5);
        a.display();
        
    }    
}
