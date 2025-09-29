package Pattern;
import java.util.Scanner;
public class starTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=i;j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

