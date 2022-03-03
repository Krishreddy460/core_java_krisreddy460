class Parent {
    String firstname;
    String lastname;

    Parent() {
        this.firstname ="krishna";
        this.lastname = "VAMSI";
    }

    Parent(String firstname) {
        this();
        this.firstname = firstname;
    }

    public String getFirstname() 
    {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        System.out.println("Parent OBJECT::");
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}

class Child extends Parent {
    
    Child()
    {
        super();
    }
    Child(String firstname) {
        this.setFirstname(firstname);
    }

    @Override
    public String toString() {
        System.out.println("CHILD OBJECT::");
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}


public class PC
{
public static void main(String[] args)
{
    Parent p = new Parent();
    Child c = new Child();
    System.out.println(p);
    System.out.println(c);

}
}



