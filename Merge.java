import java.util.*;
public class Merge {

    public static void main(String[] args)
    {   Scanner scanner = new Scanner(System.in);
        int []L=new int[5];
        int []R=new int[5];

        for(int i=0;i<L.length;i++)
       {
            L[i]=scanner.nextInt();
       }
       for(int i=0;i<L.length;i++)
       {
            R[i]=scanner.nextInt();
       }
        int i=0;
        int j=0;
        int n1=L.length;
        int n2=R.length;
        int []arr=new int[10];
        int k=0;
        while (i < n1 && j < n2)
         {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
      
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        System.out.println("array lengtharr.length");
        for(int inn=0;inn<arr.length;inn++)
        {
             System.out.println(arr[inn]+" ");
        }
    }
}
    
