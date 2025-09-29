//REVERSE NUMBER TRIANGLE. //
//Enter n: 6
//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6

/*package Pattern;
import java.util.Scanner;
public class revNumTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i =1;i<=n;i++){
            for (int j=1; j<=n+1-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}*/



//Enter n: 5
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
/*package Pattern;
import java.util.Scanner;
public class revNumTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/



//
//Enter n: 5
//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1

package Pattern;
import java.util.Scanner;
public class revNumTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n+1-i;j++){
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }
}