class Student
{
    static int rollno=100;
    private 
    final static String university;
    private String Homecity;
    Student()
    {
        Student.rollno ++;

    }
    Student(int rollno, String name)
    {
        rollno++;
        this.name = name;
    }
    
    Student(int rollno, String name,String branch)
    {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
    }
    Student(int rollno, String name,String branch, String City)
    {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.city = City;
    }
    void display()
    {
        System.out.println("Student " + rollno + " " + name + "");

    }
    int getRollno()
    {
        return this.rollno;
    }
    String getName()
    {
        return this.name;

    }

    void setRollno(int rollno)
    {
        this.rollno = rollno;

    }
    void setName(String name)
    {
        this.name = name;
    }

}






public class ConstructorOverload {


    public static void main(String[] args)
    {
        Student s1= new Student();
        Student s2= new Student(18,"krishna");
        Student s3= new Student(19,"gopi","CSE");
        Student s4= new Student(20,"vamsi","ECE","KADAPA");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        System.out.println("After updating ");
        s1.setRollno(21);
        s1.setName("Nandhu");
        s1.display();
        System.out.println("to get roll number AND STUDENTNAME OF S3 ");
        System.out.println(s3.getRollno());
        System.out.println(s3.getName());

    }
    
}
