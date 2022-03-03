import java.io.*;
class Account implements Serializable 
{
    String name;
    transient String password;
    public Account()
    {
        this.name = "krishna";
        this.password = "Gopi";
    }
}

public class Serialization
{
    public static void main(String[] args) throws Exception
    {
        Account account = new Account();
        System.out.println("account name: " + account.name+" password: " + account.password);
        FileOutputStream fos = new FileOutputStream("file2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        FileInputStream fis = new FileInputStream("file2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account account2 =(Account) ois.readObject();
        System.out.println("account2: " + account2.name+"password="+account2.password); 

    }
}