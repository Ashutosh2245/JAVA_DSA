package Pattern;
import java.util.Scanner;
public class starRectangle {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        m = sc.nextInt();

        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=m;j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
