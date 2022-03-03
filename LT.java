import java.util.*;
public class LT {
    public static void main(String[] args)
    {
        int row=3,col=3;

        Scanner scanner = new Scanner(System.in);
        int [][] m1=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m1[i][j]=scanner.nextInt();
            }

        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i<j)
                System.out.print("0");

                else
                System.out.println(m1[i][j]);
            }
        }

    }
}
