import java.util.Scanner;
public class Name {

    static void name(String namee,String city,String hobby) 
    {
        System.out.println("Name: " + namee);
        System.out.println("City: " + city);
        System.out.println("hobby: "+ hobby);

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String namee = s.next();
        String city = s.next();
        String hobby = s.next();
        name(namee, city, hobby);
    }



}
