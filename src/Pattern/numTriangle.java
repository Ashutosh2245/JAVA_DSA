// METHOD 1 //
//Enter the value of n: 5
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//
/*package Pattern;
import java.util.Scanner;
public class numTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=i;j++){ //columns
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
*/


// METHOD 2//
//Enter the value of n: 5
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

package Pattern;
import java.util.Scanner;
public class numTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=i;j++){ //columns
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
