package TwoDimensionalArray;
import java.util.Scanner;
public class largestAndLeastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.print("Enter elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
        }

        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mn = Math.min(mn,arr[i][j]);
            }
        }


        System.out.println("Greatest element: "+mx);
        System.out.println("Least element: "+mn);
    }
}
