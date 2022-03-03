import java.util.Scanner;

public class EvenOdd
{
    /*static String EvenOddd(int num1)
    {
        if(num1%2==0)
        return "even";
        else
        return "odd";
    }*/
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //int num1=s.nextInt();
        int a=9;
        int b=a+a++;
        System.out.println(b);
    }
}