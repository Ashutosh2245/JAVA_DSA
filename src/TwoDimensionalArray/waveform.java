package TwoDimensionalArray;
import java.util.Scanner;
public class waveform {
    public static void print(int[][] arr){
        int m = arr.length; int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix: ");
        print(arr);

        //Wave print -> row wise (alternate)
        System.out.println("Wave print (Row Wise): ");
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

        System.out.println("Wave print (Column Wise): ");
        for (int j = 0; j < n; j++) {
            if(j%2==0){
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for (int i = m-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
