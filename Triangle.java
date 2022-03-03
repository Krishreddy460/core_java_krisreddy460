import java.util.*;

public class Triangle {
       static void triangle(int x, int y, int z)
{
    if (x == y && y == z )
        System.out.println("Equilateral Triangle");
    else if (x == y || y == z || z == x )
        System.out.println("Isosceles Triangle");
    else
        System.out.println("Scalene Triangle");
}
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x=scanner.nextInt();
    int y=scanner.nextInt();
    int z=scanner.nextInt();
    triangle(x, y, z);

    }
    
}
