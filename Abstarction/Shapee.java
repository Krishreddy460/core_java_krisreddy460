abstract class Shape{
    String name;
    double area,perimeter;
    public Shape(String name){
        this.name = name;
        this.area = 0;
        this.perimeter =0;
    }
     abstract void area();
     abstract void perimeter();
     abstract void draw();
    public String toString() {
        return "\n[area=" + area + ", name=" + name + ", perimeter=" + perimeter + "]";
    }
    
}

class Rectangle extends Shape{

    int length,breadth;
    Rectangle(String name,int width,int breadth){
        super(name);
        this.length=length;
        this.breadth=breadth;
    }
    public void area()
    {
        area=breadth*breadth;
    }


    public void perimeter() {
        perimeter=2*(length+breadth);
        
    }
    public void draw() {
        System.out.println("Rectangle it is!");
        
    }
    public String toString() {
        return "Rectangle [breadth=" + breadth + ", length=" + length + "]"+super.toString();
    }
    
}

class Square extends Shape {

    int side;

    Square(String name,int side){
        super(name);
        this.side=side;
    }

    public void area() {
        area=side*side;
        
    }

    
    public void perimeter() {
        perimeter=4*side;
    }

    public void draw() {
        System.out.println("Square it is!");
        
    }
    public String toString() {
        return "Square [side=" + side + "]" + super.toString();
    }
    
}

class Circle extends Shape {

    int radius;
    Circle(String name,int radius){
        super(name);
        this.radius=radius;
    }

    public void area() {
        area=radius*radius*Math.PI;
        
    }
    public void perimeter() {
        perimeter=2*Math.PI*radius;
        
    }

    public void draw() {
        System.out.println("Circle");
        
    }
    public String toString() {
        return "Circle [radius=" + radius + "]" + super.toString();
    }
    


}

public class Shapee {
    public static void main(String[] args) {


        Circle c1 = new Circle("Circle",10);
        c1.area();
        c1.perimeter();
        System.out.println(c1);

    
        Square s1 = new Square("Square",10);
        s1.area();
        s1.perimeter();
        System.out.println(s1);

    
        Rectangle r1 = new Rectangle("Rectangle",10,20);
        r1.area();
        r1.perimeter();
        System.out.println(r1);
    }
}
