import java.util.Scanner;

public class Square
{   
    static int Squaree(int c)
    {
        return c*c;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num1=s.nextInt();
        System.out.println(Squaree(num1));
    }
}