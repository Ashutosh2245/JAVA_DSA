// Method 1 -->> Same elements in rows.
//Enter the number of rows or columns: 5
//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5


/*package Pattern;
import java.util.Scanner;
public class numSquare {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows or columns: ");
        n = sc.nextInt();


        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n;j++){ //columns
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}*/


// Method 2 -->> Same elements in columns.
//Enter the number of rows or columns: 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6



package Pattern;
import java.util.Scanner;
public class numSquare {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows or columns: ");
        n = sc.nextInt();


        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n;j++){ //columns
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
