class A
{
    static final int a=9;
    static int b=6;
    static final int c=7;
    
    static
    {
        
    }

    
}

public class staticblock {

    public static void main(String[] args)
    {
        A ob1=new A();
        A ob2=new A();
        System.out.println(ob1.a+"   "+ob2.a);
        
    }
    
}
