/// Display the AP - 4,7,10,13,16,....... uo to n numbers of terms.
//package Loops;
//import java.util.Scanner;
//public class AP2 {
//    public static void main(String[] args) {
//        int n,i;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of terms required: " );
//        n = sc.nextInt();
//        for (i=4;i<=3*n+1;i+=3){ //nth term of AP is = 3n+1 using formula nth term(An) = a+(n-1)*d //
//            System.out.println(i);
//        }
//    }
//}

// METHOD 2 //
package Loops;
import java.util.Scanner;
public class AP2{
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms required: " );
        n = sc.nextInt();
        int a = 4, d = 3; //a - First term & d - common difference
        for (i=1;i<=n;i++){
            System.out.println(a);
            a +=d;
        }
    }
}
