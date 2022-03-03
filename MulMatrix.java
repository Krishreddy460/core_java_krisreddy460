import java.util.*;
public class MulMatrix 
{
    public static void main(String[] args)
    {   int row=3,col=3;

        Scanner scanner = new Scanner(System.in);
        int [][] m1=new int[row][col];
        int [][] m2=new int[row][col];
        int [][] m3=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m1[i][j]=scanner.nextInt();
                m2[i][j]=scanner.nextInt();
            }

        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {   int sum =0;
                for(int k=0;k<row;k++)
                {
                sum+=m1[i][k]*m2[k][j];
                }
                m3[i][j] = sum;

            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                    System.out.print(m3[i][j]+"     ");
            }
            System.out.println();
        }
    }
}
