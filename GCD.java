import java.util.*;

public class GCD {
    static int gcd(int n1, int n2) 
    {
        LCM l=new LCM();
        int lcmm=l.lcm(n1, n2);
        int gcd=(n1*n2)/lcmm;
        return gcd;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        System.out.println(gcd(n1,n2));

    }
}
