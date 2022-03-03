import java.util.*;
public class CountInt {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int countt=0;
        char  c;
        do
        {
            c=scanner.nextLine().charAt(0);
            if(c!='q')
            countt++;
        }while(c !='q');
    }
}
