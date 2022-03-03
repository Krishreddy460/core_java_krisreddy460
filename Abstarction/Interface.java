interface RBI
{
    void showBalance();
    double withdraw(int amount);
    double deposit(int amount);
    double calculateyearlyIntrest();
}

class Account 
{   final double rateOfInterest=4.8;
    static String accHoldername;
    int accBalance;
    int AccountNumber;
    static int c=100;
   public  Account(int accountNumber2, String accHoldername2, int accBalance)

    {
        this.accHoldername =accHoldername;
        this.accBalance =100;
        this.AccountNumber = c++;
    }
}

class SBI extends Account implements RBI
{
    SBI(int AccountNumber,String accHoldername,int accBalance)
    {
        super(AccountNumber,accHoldername,accBalance);
    }

    public void showBalance()
    {
        System.out.println("Account balance in SBI in "+"Account number")
    }
    public double withdraw(int amount))
    {
        if(accBalance-amount<=0)
        {
            System.out.println("insufficient funds");
        }
        else
        {
            System.out.println("your current balance is "+(accBalance-amount));
        }
    }
     public double deposit(int amount)
    {
        System.out.println("your current balance is "+(accBalance+amount));
    }
    public double calculateyearlyIntrest()
    {
        System.out.println(" the rateOfInterest =="+(accBalance*(100+rateOfInterest/100)));
    }
}
class ICICI extends Account implements RBI
{

    ICICI(int AccountNumber,String accHoldername,int accBalance)
    {
        super(AccountNumber,accHoldername, accBalance);
    }


    public void showBalance()
    {
        System.out.println("Account balance in SBI in "+"Account number")
    }
    public double withdraw(int amount))
    {
        if(accBalance-amount<=0)
        {
            System.out.println("insufficient funds");
        }
        else
        {
            System.out.println("your current balance is "+(accBalance-amount));
        }
    }
     public double deposit(int amount)
    {
        System.out.println("your current balance is "+(accBalance+amount));
    }
    public double calculateyearlyIntrest()
    {
        System.out.println(" the rateOfInterest =="+(accBalance*(100+rateOfInterest/100)));
    }
}

public class Interface {

    public static void main(String[] args)
    {
        
    }
    
}
