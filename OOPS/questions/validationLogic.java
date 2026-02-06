// Create a class BankAccount
// private variable: balance
// Setter should not allow withdrawal that makes balance negative
// Create methods: deposit, withdraw, getBalance

class BankAccount{
    private int balance;

    public void deposit(int amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Amount deposited successfully");
        }else{
            System.out.println("Invalid");
        }
    }

    public void withdraw(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount entered");
        }else if(balance-amount > 0){
            balance-=amount;
            System.out.println("Amount withdrawal successfully");
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public int getBalance(){
        return balance;
    }

    
}

public class validationLogic{
    public static void main(String[] args){
        BankAccount ba = new BankAccount();

        ba.deposit(7000);
        ba.withdraw(4000);
        ba.withdraw(5000);
        System.out.println(ba.getBalance());
    }
}