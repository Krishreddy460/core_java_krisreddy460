import java.util.*;
import java.lang.*;
public class DigitExt {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        int sum=0;
        while(n=0)
        {
            int rem=n%10;
            sum+=Math.pow(rem,3);
            n=n/10;

        }
        if(sum==n1)
        System.out.println("ARmSTRong");

    }
}
