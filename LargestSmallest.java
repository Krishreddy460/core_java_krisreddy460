import java.util.*;
public class LargestSmallest
{
    
    public static int smallest(int first, int second, int third) 
    {    int small= first;
            if(second < small) 
            small = second;   
            if(third < small)
            small = third;  
        return small; 
    }
    public static int largest(int first, int second, int third) 
    {    int large= first;
            if(second > large) 
            large = second;   
            if(third > large)
            large = third;  
        return large; 
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();

        System.out.println("small ==="+smallest(first, second, third));
        System.out.println("large ==="+largest(first, second, third));
    }
}