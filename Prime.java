import java.util.*;
public class Prime {

    static int prime(int num)
    {   
        
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int flag=prime(num1);
        if(flag==1)
        System.out.println("prime")
        else
        System.out.println("non prime")
    }

    
}
