class Helper
{    int a ;
     int b;
     int c;
     int d;
    int temp;
    
    int add(int a, int b)
    {   
        this.a=a; this.b=b;
         temp=this.a+this.b;
        return temp;
    }
    
    float add(int a, int b, int c)
    { 
        this.a=a; this.b=b; this.c=c;
        temp=this.a+this.b+this.c;
        return temp;
    }
    int add(int a, int b, int c, int d)
    {
        this.a=a; this.b=b; this.c=c;this.d=d;
        temp=this.a+this.b+this.c+this.d;
        return temp;
    }
    void displaySum()
    {
        System.out.println("sum=="+temp);
    }
}



public class FunAddOverload {

    public static void main(String[] args)
    {
        
        Helper h=new Helper();
        float sum;
        sum=h.add(1,3);

        System.out.println(sum);

        sum=h.add(1,3,5);

        System.out.println(sum);

        sum=h.add(1, 2, 3, 4);

        System.out.println(sum);


    }
    
}
