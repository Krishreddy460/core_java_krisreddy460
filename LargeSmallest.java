import java.util.*;
public class LargeSmallest {

    public static void main(String[] args)
    {   
        int []arr=new int[6];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }

        int small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            small=arr[i];
        }
        
        int large=arr[arr.length-1];
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]>large)
            large=arr[i];
        }
        System.out.println(small+" "+large);
        

    }
    
}
