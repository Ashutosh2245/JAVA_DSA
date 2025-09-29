//Enter the value of n: 6
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        F F F F F F

/*package Pattern;
import java.util.Scanner;
public class alphaTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}*/
//
//Enter the value of n: 6
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F

package Pattern;
import java.util.Scanner;
public class alphaTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}