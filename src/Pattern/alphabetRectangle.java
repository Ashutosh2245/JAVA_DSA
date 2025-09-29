// Method 1 -->> Same alphabets will be printed in each row.
//Enter the number of rows: 5
//        Enter the number of columns: 5
//        A A A A A
//        B B B B B
//        C C C C C
//        D D D D D
//        E E E E E

package Pattern;
import java.util.Scanner;
public class alphabetRectangle {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m = sc.nextInt();

        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=m;j++){ //columns
                System.out.print(((char)(i+64) + " "));
            }
            System.out.println();
        }
    }
}
//METHOD 2// --->> Same alphabets will be printed in each column.
//Enter the number of rows: 5
//        Enter the number of columns: 5
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E

//package Pattern;
//import java.util.Scanner;
//public class alphabetRectangle {
//    public static void main(String[] args) {
//        int n,m;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        n = sc.nextInt();
//        System.out.print("Enter the number of columns: ");
//        m = sc.nextInt();
//
//        for(int i=1;i<=n;i++){ //rows
//            for(int j=1;j<=m;j++){ //columns
//                System.out.print(((char)(j+64) + " "));
//            }
//            System.out.println();
//        }
//    }
//}