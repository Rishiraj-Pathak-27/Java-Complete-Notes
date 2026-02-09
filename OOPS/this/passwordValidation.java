class Validation{
    private String password = "";

    public void setPass(String password){
        if(password.length() >= 8){
            this.password=password;
        }else{
            System.out.println("Password too weak");
        }
    }

    public String getPass(){return password;}

    
}

public class passwordValidation{
    public static void main(String[] args){
        Validation v1 = new Validation();
        v1.setPass("222511");
        System.out.println("Password = "+v1.getPass());
    }
}