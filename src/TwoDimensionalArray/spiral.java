package TwoDimensionalArray;
import java.util.Scanner;
public class spiral {
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

        //Spiral Matrix
        System.out.println("Spiral Matrix: ");
        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;
        while(minr<=maxr && minc<=maxc){
            //Left to right
            for (int j = minc; j <=maxc ; j++) {
                System.out.print(arr[minr][j]+" ");
            }minr++;

            //top to bottom
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i <=maxr; i++) {
                System.out.print(arr[i][maxc]+" ");
            }maxc--;

            //right to left
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }maxr--;

            //bottom to top
            if(minr>maxr || minc>maxc) break;
            for(int i = maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }minc++;
        }
    }
}
