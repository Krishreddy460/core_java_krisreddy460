class BankAccounts {
    protected int accNo;
    protected String accHoldername;
    protected int accBalance;
    static final int c=1;

    BankAccounts(int accNo, String accHoldername, int accBalance) {
        this.accNo = accNo;
        this.accHoldername = accHoldername;
        this.accBalance = accBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccHoldername() {
        return accHoldername;
    }

    public BankAccounts getStatement() {
        System.out.println("Name:" + getAccHoldername());
        System.out.println("Account Type:" + this.getClass().getSimpleName());
        return new BankAccounts(this.accNo,this.accHoldername, this.accBalance);
    }

    public void setAccHoldername(String accHoldername) {
        this.accHoldername = accHoldername;
    }

    public int getAccBalance() {
        return accBalance;
    }




    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public String toString() {
        return String.format("Account Number: %d %nAccount Holder Name: %s %nAccount Balance: %d", accNo,
                accHoldername, accBalance);
    }

    public void additionFeatures() {
    }

}

class SavingAccount extends BankAccounts {
    static final double rateOfInterest = 5;

    SavingAccount(int accNo, String accHoldername, int accBalance) {
        super(accNo, accHoldername, accBalance);

    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public SavingAccount getStatement() {
        System.out.println("Name:" + getAccHoldername());
        System.out.println("Account Type:" + this.getClass().getSimpleName());
        return new SavingAccount(this.accNo,this.accHoldername, this.accBalance);
    }

    public double getComputedInterest(int years) {
        return rateOfInterest * getAccBalance() * years / 100;
    }

    public double getYearlyInterest() {
        return getComputedInterest(1);
    }

    @Override
    public String toString() {

        return super.toString() + "\nRate of Interest: " + rateOfInterest;
    }
}

class CurrentAccount extends BankAccounts {
    int avgDailyTransaction;

    public int getAvgDailyTransaction() {
        return avgDailyTransaction;
    }

    public void setAvgDailyTransaction(int avgDailyTransaction) {
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public CurrentAccount getStatement() {
        System.out.println("Name:" + getAccHoldername());
        System.out.println("Account Type:" + this.getClass().getSimpleName());
        return new CurrentAccount(125, "Krishna", 100, 200);
    }

    CurrentAccount(int accNo, String accHoldername, int accBalance, int avgDailyTransaction) {
        super(accNo, accHoldername, accBalance);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public int getTotalTransactionAmount(int days) {
        return avgDailyTransaction * days;

    }

    public int getYearlyTransaction() {
        return getTotalTransactionAmount(365);
    }
    @Override
    public String toString() {

        return super.toString() + "\nAverage Daily Transaction Amount: " + avgDailyTransaction;
    }

}

public class Bank1 {
    public static void main(String[] args) {
        BankAccounts generalAcc = new BankAccounts(233, "Krishna vamsi reddy", 1000);
        SavingAccount savingAcc = new SavingAccount(234, "Krishna", 2000);
        CurrentAccount currentAcc = new CurrentAccount(235, "Krishna", 3000, 200);
        
    }
}