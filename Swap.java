public class Swap {
    static void swapp(int num1, int num2) 
    {
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swapping");
        System.out.println("num1=="+num1+"num2=="+num2);
    }
    public static void main(String[] args)
    {
        
        int num1=10;
        int num2=20;
        System.out.println("before swapping");
        System.out.println("num1=="+num1+"num2=="+num2);
        swapp(num1, num2);
    }

}
