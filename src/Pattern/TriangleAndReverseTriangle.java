package Pattern;
import java.util.Scanner;
public class TriangleAndReverseTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i=2;i<=n;i++){
//            for (int j =1;j<=n+1-i;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// i + j(max) is always equal to n+1.
// Thus, j(max) = n+1-i


