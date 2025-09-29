// Printing in the form of right angle triangle.
//Enter n: 5
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1


/*package Methods;
import java.util.Scanner;
public class pascalTriangle {
    public static int fact(int x){
        int xFact = 1;
        for (int i=1;i<=x;i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                int iCj = fact(i)/(fact(j) * fact(i-j));
                System.out.print(iCj + " ");
            }
            System.out.println();
        }
    }
}
*/





// Printing in the form of equilateral triangle.

//Enter n: 5
//        1
//        1   1
//        1   2   1
//        1   3   3   1
//        1   4   6   4   1
//        1   5   10   10   5   1


package Methods;
import java.util.Scanner;
public class pascalTriangle {
    public static int fact(int x){
        int xFact = 1;
        for (int i=1;i<=x;i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for (int j=1;j<n-i;j++){
                System.out.print(" " + " ");
            }
            for (int j=0;j<=i;j++){
                int iCj = fact(i)/(fact(j) * fact(i-j));
                System.out.print(iCj + "   ");
            }
            System.out.println();
        }
    }
}
