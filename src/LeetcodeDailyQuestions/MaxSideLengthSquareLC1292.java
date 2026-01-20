package LeetcodeDailyQuestions;
import java.util.*;
public class MaxSideLengthSquareLC1292 {
    public static int maxSideLength(int[][] matrix, int threshold){
        int r = matrix.length;
        int c = matrix[0].length;

        int[][] prefixSum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                prefixSum[i][j] = matrix[i][j];

                if(i>0) prefixSum[i][j] += prefixSum[i-1][j];
                if(j>0) prefixSum[i][j] += prefixSum[i][j-1];
                if(i>0 && j>0) prefixSum[i][j] -= prefixSum[i-1][j-1];
            }
        }
        int low = 0, high = Math.min(r,c);
        int ans = 0;
        while (low<=high){
            int k = (low+high)/2;
            if(isPossible(prefixSum, r, c, k, threshold)){
                ans = k;
                low = k+1;
            }
            else high = k-1;
        }
        return ans;
    }
    public static boolean isPossible(int[][]prefix, int r, int c, int k, int threshold){
        if (k==0) return true;
        for (int i = 0; i+k-1<r; i++) {
            for (int j = 0; j+k-1<c; j++) {
                int r1 = i, c1 = j;
                int r2 = i+k-1, c2 = j+k-1;
                int sum = prefix[r2][c2];

                if(r1>0) sum -= prefix[r1-1][c2];
                if(c1>0) sum -= prefix[r2][c1-1];
                if(r1>0 && c1>0) sum += prefix[r1-1][c1-1];

                if(sum<=threshold) return true;
            }
        }
        return false;
    }
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
        System.out.print("Enter the threshold value: ");
        int th = sc.nextInt();
        int result = maxSideLength(matrix,th);
        System.out.print("Maximum Side Length of a Square: "+result);


    }

}
