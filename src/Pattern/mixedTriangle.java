//Enter the value of n: 5
//        1
//        A B
//        1 2 3
//        A B C D
//        1 2 3 4 5

/*
package Pattern;
import java.util.Scanner;
public class mixedTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if (i%2==0) System.out.print((char)(j+64) +  " ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
*/

//Enter the value of n: 5
//        1
//        B B
//        3 3 3
//        D D D D
//        5 5 5 5 5


package Pattern;
import java.util.Scanner;
public class mixedTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if (i%2==0) System.out.print((char)(i+64) +  " ");
                else System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
