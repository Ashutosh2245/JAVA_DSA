package conditionals;
import java.util.Scanner;
public class checkingTriangle {
    public static void main(String[] args) {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter side a: ");
      a = sc.nextInt();
      System.out.print("Enter side b: ");
      b = sc.nextInt();
      System.out.print("Enter side c: ");
      c = sc.nextInt();
      //Using ternary operator
      System.out.println(((a+b)>c && (b+c)>a && (a+c)>b) ? "It's a Triangle" : "It's not a Triangle");
    }
}
// We can use if else here as well.
// + is more preferable than >