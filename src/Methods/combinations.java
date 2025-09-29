// Using Loops

/*package Methods;
import java.util.Scanner;
public class combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();


        int nFact = 1;
        for (int i=1;i<=n;i++){
            nFact *= i;
        }

        int rFact = 1;
        for (int i =1;i<=r;i++){
            rFact *= i;
        }
        int n_rFact = 1;
        for(int i = 1;i<=n-r;i++){
            n_rFact *= i;
        }
        int nCr = nFact/(rFact * n_rFact);
        System.out.println("nCr: " +nCr);
    }
}*/

//Using methods.

package Methods;
import java.util.Scanner;
public class combinations {
    public static int fact(int x) {
        int xFact = 1;
        for (int i =1;i<=x;i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
// Passing values as argument.
        int nFact = fact(n);
        int rFact = fact(r);
        int n_rFact = fact(n-r);
        int nCr = nFact/(rFact * n_rFact);
        // int nCr = fact(n)/(fact(r) * fact(n-r)); //It can be used instead of above 4 lines.
        System.out.println("nCr: "+nCr);
    }
}

// USE fact(n)/fact(n-r) to find nPr.