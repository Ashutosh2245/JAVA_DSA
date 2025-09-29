package OOPS.Encapsulation.EncapsulationExample;
class Bank {
    private String accountHolder;
    private double balance;

    //Constructor
    public Bank(String name, double initialAmount ){
        if (initialAmount>=0){
            accountHolder = name;
            balance = initialAmount;
        }
        else{
            accountHolder = name;
            balance = 0;
            System.out.println("Invalid initial amount. Balance is set to 0.");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(amount+" deposited.");
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println(amount +" withdrawn.");
        }
        else{
            System.out.println("Invalid Withdrawal.");
        }
    }
    public void showDetails(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Current Balance: "+balance);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Bank acc = new Bank("Ashutosh", 10000);
        Bank acc2 = new Bank("Aditya",20000);

        acc.deposit(500);
        acc.withdraw(125);
        acc.showDetails();
        acc2.deposit(19000);
        acc2.withdraw(10000);
        acc2.showDetails();
    }
}