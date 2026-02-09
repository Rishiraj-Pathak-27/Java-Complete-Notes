
class Guns{
        private String name;
        private String type;
        int range;
        double price;

        // Guns(String name,String type, int range, double price){
        //     this.name=name;
        //     this.type=type;
        //     this.range=range;
        //     this.price=price;
        // }

        public void setGun(String name, String type, int range, double price){       // setter
            this.name = name;
            this.type = type;
            this.range = range;
            this.price = price;
        }

        String getName(){         // getter for name
            return name;
        }

        String getType(){         // getter for type
            return type;
        }

        int getRange(){
            return range;
        }

        double getPrice(){
            return price;
        }

        
    }

    
public class example {
    

    public static void main(String[] args){
        Guns g1 = new Guns();
        g1.setGun("AK-47","Machine Gun",150,1500000);
        System.out.println(g1.getName()+" "+g1.getType()+" "+g1.getRange()+" "+g1.getPrice());
        
    }

    
    
}
