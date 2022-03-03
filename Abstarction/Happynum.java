import java.util.*;
public class Happynum {

    static int sumofdigits(int num)
    {   int sum=0;
        while(num!=0)
        {   int rem=num%10;
            sum+=rem*rem;
            num=num/10;
        }
        return sum;
    }  

    
    

    static String happyNum(int num)
    {  
        while(num!=1)
        {  
            num=sumofdigits(num);
            //System.out.println(num);
            if(num==4)
            {
            return "";
            }
        }
        return "Happynum";
    }
 
   public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int num=sc.nextInt();
        for(int i=1; i<num; i++)
        {
        System.out.println(i+"number is"+happyNum(i));
        }
    }
}

private class me{}