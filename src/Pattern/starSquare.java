package Pattern;
import java.util.Scanner;
public class starSquare {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows or columns: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n;j++){//columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
