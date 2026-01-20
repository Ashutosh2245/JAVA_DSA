package LeetcodeDailyQuestions;
import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.print("Enter the matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] prefixSum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                prefixSum[i][j] = matrix[i][j];

                if(i>0) prefixSum[i][j] += prefixSum[i-1][j];
                if(j>0) prefixSum[i][j] += prefixSum[i][j-1];
                if(i>0 && j>0) prefixSum[i][j] -= prefixSum[i-1][j-1];
            }
        }
        System.out.println("Prefix sum of matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(prefixSum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
