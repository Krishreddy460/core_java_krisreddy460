import java.util.Scanner;
class Account
{
String accountHolderr;
double balancee;

Account(String accountHolder,double balance ){
     balancee = balance;
     accountHolderr = accountHolder;
}
void debit(int amount) {
    if(amount>balancee)
    System.out.println("Insufficient Money");
    else
    balancee -= amount;
    System.out.println("Debited Amount "+amount+"Your Current Balance : "+balancee);

}
void credit(int amount) {
    balancee += amount;
    System.out.println("Credited Amount: "+amount+"Your current Balance : "+balancee);
}
void checkBalance(){
    System.out.println("Account Holder Name : "+accountHolderr);
    System.out.println("Balance : "+balancee);
    
}
}

public class Bank {
public static void main(String[] args) {
Account account1 = new Account("vamsi",100);
Account account2 = new Account("krishna",300);
account1.checkBalance();
account2.checkBalance();
account1.debit(500);
account1.credit(1500);
account2.debit(500);
account2.credit(1000);
account1.checkBalance();
account2.checkBalance();
}
}
