package MethodOveriding;


class Parent
{

    void name()
    {
        System.out.print("The Name");
    }
    static void display()
    {   
        System.out.print("parent");
    }


}
class Child extends Parent
{
    void C()
    {
        System.out.print("yes");
    }
    static void display()
    {
        System.out.print("CHild");
    }
}
public class SimpleEx 
{

    public static void main(String[] args)
    {
        Parent  parent=new Parent();
        Child child=new Child();
        Parent p=new Child();
        p.display();
        p.name();
        p.display(); 
        parent.display();
        child.display();

       // System.out.println("count=="+Parent.c);

    }
}
