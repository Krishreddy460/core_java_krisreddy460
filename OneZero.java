import java.io.PrintStream;
import java.util.Scanner;
public class OneZero
{  
    static int onezero(int m)
    {
        if(m <= 0)
        return 1;
        else  if(m==0)
            return 0;
        else
            return -1;

    }
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int m=scanner.nextInt();
     int n=onezero(m);
     PrintStream out = System.out;
    out.println(n);
}
}
