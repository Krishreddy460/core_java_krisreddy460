import java.util.*;
public class LCM
{
    static int lcm(int n1,int n2)
    {
        int lcm=(n1>n2)?n1:n2;
        while(true)
        {
            if(lcm%n1==0 && lcm%n2==0)
            return lcm;
            lcm++;
        }
        
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        System.out.println(lcm(n1,n2));
    }
    
}
