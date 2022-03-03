import java.util.*;

class Numberclass <T extends Number> 
{
    T num;
   public Numberclass(T num)
    { 
        this.num = num;
    }
    double square()
    {
        return num.doubleValue()*num.doubleValue();
    }
    boolean absEqual(Numberclass<Double> other)
    {
        return(Math.abs(this.num.doubleValue())>Math.abs(other.num.doubleValue()));
    }

}
public class GS {

    public static void main(String[] args)
    {
        Numberclass<Double> num = new Numberclass<>(3.0);
        Numberclass<Integer> num1 = new Numberclass<>(4);
        System.out.println(num1.absEqual(num));
    }
    
}
