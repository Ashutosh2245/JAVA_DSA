//package Methods;
//import java.util.Scanner;
//public class swapNumbers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter b: ");
//        int b = sc.nextInt();
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("Value of a after swapping: "+a);
//        System.out.println("Value of b after swapping: "+b);
//    }
//}

package Methods;
import java.util.Scanner;
public class swapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a after swapping: "+a);
        System.out.println("Value of b after swapping: "+b);
    }
}
