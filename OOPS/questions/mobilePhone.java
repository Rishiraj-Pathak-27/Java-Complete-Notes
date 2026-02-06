// Create class Mobile
// private price
// If price < 0 → set to 0
// Getter & Setter

class Mobile{
    private int price;

    public void setPrice(int p){
        if(p<0){
            price=0;
        }else{
            price=p;
        }
    }

    public int getPrice(){
        return price;
    }
}

public class mobilePhone{
    public static void main(String[] args){
        Mobile m = new Mobile();

        m.setPrice(100000);
        System.out.println("Price of Mobile Phone is "+m.getPrice());
    }
}

