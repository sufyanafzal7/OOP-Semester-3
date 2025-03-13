package Lab3;

class Account{
    private double balance;


    public Account() {
        balance = 0;
    }

    public Account(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposite(double depositeBalance){
        
        balance+= depositeBalance;

    }

    public void withdraw(double withdrawBalance){
        balance-= withdrawBalance;

    }
    
}


public class LabTask2 {
    public static void main(String[] args) {
        Account customer1 = new Account(10000);
        Account customer2 = new Account(customer1.getBalance());

        System.out.println("Customer1 Account: ");
        customer1.deposite(1200);
        System.out.println("Balance : "+customer1.getBalance());
        
        System.out.println("Customer2 Account: ");
        customer2.withdraw(1200);
        System.out.println("Balance : "+customer2.getBalance());
    }
}
