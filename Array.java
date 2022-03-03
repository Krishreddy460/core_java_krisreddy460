import java.util.*;

public class Array {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] a = new int[10];
for (int i = 0; i < a.length; i++) {
a[i] = scanner.nextInt();
}
for (int i = 0; i < a.length; i++) {
a[i] = a[i] + 1;
}
Arrays.sort(a);
System.out.println("TOp five Scores");
for (int i = a.length - 1; i > 4; i--) {
System.out.println(a[i]);
}
scanner.close();
}

}
