import java.util.*;
class Point
{ 
    int x;
    int y;
    Point()
    {
        this.x = 0;
        this.y = 0;
    }
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;   
    }
    int distance(Point point2)
    {       double d=Math.pow(this.x - point2.x,2)+Math.pow(this.y - point2.y,2);
            int f=(int)d;
            return (int)Math.pow(f,0.5);
    }

}
public class Line
 {
    Point start;
    Point end;
    Line(Point p1, Point p2)
    {
        this.start=p1; 
        this.end=p2;
    }
    int length()
    { 
        return start.distance(end);
    }



    public static void main(String[] args)
    {   
        Point p1= new Point();
        Point p2=new Point(7,0);
        
        Line  l =new Line(p1,p2);
        int le=l.length();
        System.out.println("length is +"+le);



    }
    
}
