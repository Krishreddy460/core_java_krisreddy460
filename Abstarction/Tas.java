

public class Tas {
    <T> void accept(Integer a, T b) {
        if (b instanceof Double) {
            System.out.println((double) b * a);
        } else if (b instanceof String) {
            System.out.println("Can't Multiply!!!");
        } else if (b instanceof Boolean) {
            System.out.println("False");

        }
    }

    public static void main(String[] args)
    {
        Tas task1 = new Tas();
        task1.accept(2, 2.0);
        task1.accept(1, "hello");
        task1.accept(2, true);
    }
}