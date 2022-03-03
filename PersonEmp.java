class Person
{
    String name;

    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }
    void display()
    {
        System.out.println("Personname="+name);
    }
    
}
class Employee extends Person
{

    double salary;
    int startyear;
    String UAN;

    Employee(String name, double salary, int startyear, String UAN)
    {
        this.setName(name);

        this.salary = salary;
        this.startyear = startyear;
        
        this.UAN = UAN;
        System.out.println("Employee: " + name +"Salary: " + salary+"StartYear: " + startyear+"UAN: " + UAN);
    }
    

    public double getSalary() {
        return salary;
    }

    String getName() 
    {return this.name;}


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getstartyear() {
        return startyear;
    }

    public void setstartyear(int year){
        this.startyear = year;
    }

    public String getUAN() {
        return UAN;
    }

    public void setUAN(String UAN) {
        this.UAN = UAN;
    }


    void display()
    {
        System.out.println("Employee: " + name +"Salary: " + salary+"StartYear: " + startyear+"UAN: " + UAN);
    }
}

public class PersonEmp
{
    public static void main(String[] args) throws Exception
    {
        Person person1 = new Person();
        person1.setName("krishna");
        Person person2 = new Person();
        Employee employee1= new Employee("krishna",3000.235,2002,"18691A2534");
        Employee employee2 = new Employee("vamsi",4000.24,2000,"18691A2534");
        person2.setName("KISHAN");
        person2.display();
        employee1.display();
        employee2.display();



        // person and employee details
        if(person1.getName().equals(employee1.getName()))
        {
            System.out.println("Person object is the same as any of the Employee ");

        }
        if(person2.getName().equals(employee1.getName()))
        {
            System.out.println("Person object is the same as any of the Employee ");
        }

        if(employee1.getUAN().equals(employee2.getUAN()))
        {
            System.out.println("BOTH employees are same");
        }




    }
}
