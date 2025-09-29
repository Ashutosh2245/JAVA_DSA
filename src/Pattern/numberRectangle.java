// Method 1 // --->>> Same elements in rows.

//Enter the number of rows: 4
//        Enter the number of columns: 5
//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
/*package Pattern;
import java.util.Scanner;
public class numberRectangle {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m = sc.nextInt();

        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=m;j++){ //columns
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}*/


// METHOD 2 // -->> Same elements in columns.
//
//Enter the number of rows: 5
//        Enter the number of columns: 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6

package Pattern;
import java.util.Scanner;
public class numberRectangle {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m = sc.nextInt();

        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=m;j++){ //columns
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}


