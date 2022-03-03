import java.util.*;

public class DigitToWord
 {
     static String digitToWord(int digit)
     {
         if(digit%2==0)
         {
             if(digit==2)
             return "two";
             else if(digit==4)
             return "four";
             else if(digit==8)
             return "eight";
             else if(digit==0)
             return "zero";
             else 
             return "six";
         }
         else
         {
            if(digit==3)
            return "three";
            else if(digit==5)
            return "five";
            else if(digit==7)
            return "seven";
            else if(digit==9)
            return "nine";
            else 
            return "one";
         }
     }
     public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int digit=scanner.nextInt();
    System.out.print(digitToWord(digit));
 }
}
