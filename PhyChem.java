import java.util.*;

public class PhyChem {

    static String grade(int per) 
    {
        if(per>90)
        return "O";
        else if(per>80)
        return "A+";
        else if(per>70)
        return "A";
        else if(per>60)
        return "B";
        else
        return "fail";


    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int phy=s.nextInt();
        int chem=s.nextInt();
        int math=s.nextInt();

        total=phy+chem+math;

        int per=total/300*100;
        String g=grade(per);
        System.out.println(g);


    }
    
}
