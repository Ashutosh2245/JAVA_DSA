//Enter n: 6
//        1
//        1 3
//        1 3 5
//        1 3 5 7
//        1 3 5 7 9
//        1 3 5 7 9 11

/*
package Pattern;
import java.util.Scanner;
public class oddNumTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i =1;i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}*/

// METHOD 2//
//
//Enter n: 5
//        1
//        1 3
//        1 3 5
//        1 3 5 7
//        1 3 5 7 9
/*package Pattern;
import java.util.Scanner;
public class oddNumTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i =1;i<=n;i++){
            for (int j=1; j<=2*i-1;j=j+2){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}*/

// METHOD #3 //
//Enter n: 5
//        1
//        1 3
//        1 3 5
//        1 3 5 7
//        1 3 5 7 9


package Pattern;
import java.util.Scanner;
public class oddNumTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i =1;i<=n;i++){
            int a =1;
            for (int j=1; j<=i;j++){
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}