package LinkedList;
import java.util.Scanner;
public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }
        }
        int[][] sparse = new int[count + 1][3];
        sparse[0][0] = r;
        sparse[0][1] = c;
        sparse[0][2] = count;
        int k = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != 0) {
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = arr[i][j];
                    k++;
                }
            }
        }
        System.out.println("\nSparse Matrix (row column value):");
        for (int i = 0; i <= count; i++) {
            System.out.println(sparse[i][0] + " " + sparse[i][1] + " " + sparse[i][2]);
        }
    }
}
