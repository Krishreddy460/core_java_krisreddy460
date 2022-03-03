
abstract class Vehicl
{
    abstract void drive();
    abstract void steering();
    void Start()
    {
        System.out.print("started");

    }
    void stop()
    {
        System.out.println("stopped");
    }

}
class Bike extends Vehicl
{
    void drive()
    {
        System.out.println("bike engine started");
    }
    void steering()
    {
        System.out.println("bike consists handle");
    }
}
class Car extends Vehicl
{
    
    void drive()
    {
        System.out.println("car engine started");
    }
    void steering()
    {
        System.out.println("car consists power steering");
    }

}     

public class Vehicle
{
public static void main(String[] args)
{
    Bike bike = new Bike();
    Car car = new Car();
    bike.drive();
    car.steering();
}
}