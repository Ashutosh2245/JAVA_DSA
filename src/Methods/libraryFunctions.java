package Methods;
import java.util.Scanner;
public class libraryFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(Math.pow(3.14,3.14));
//        System.out.println(Math.sqrt(2));
//        System.out.println(Math.sqrt(3.14));
//        System.out.println(Math.cbrt(8.0));
//        System.out.println(Math.abs(-8));
//        System.out.println(Math.floor(8.989999));
//        System.out.println(Math.floor(-9.8753422));// Greatest integer functions.
//        System.out.println(Math.max(8,7.9999));
//        System.out.println(Math.min(7,7.00001));


        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Greatest integer : " + Math.max(a,Math.max(b,c)));
    }
}
// System.out.println(Math.min(Math.min(2,4),Math.min(9,8)));
// It can print least of four numbers.