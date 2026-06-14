package Greedy;
import java.util.*;
public class MinCostToCutABoardIntoSquaresGFG {
    public static int minCost(int n, int m, int[] x, int[] y) {

        Arrays.sort(x);
        Arrays.sort(y);

        int i = x.length - 1;
        int j = y.length - 1;

        int horizontalPieces = 1;
        int verticalPieces = 1;

        long cost = 0;

        while (i >= 0 && j >= 0) {
            if (x[i] > y[j]) {
                cost += (long) x[i] * horizontalPieces;
                verticalPieces++;
                i--;
            } else {
                cost += (long) y[j] * verticalPieces;
                horizontalPieces++;
                j--;
            }
        }

        while (i >= 0) {
            cost += (long) x[i] * horizontalPieces;
            verticalPieces++;
            i--;
        }

        while (j >= 0) {
            cost += (long) y[j] * verticalPieces;
            horizontalPieces++;
            j--;
        }

        return (int) cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (rows): ");
        int n = sc.nextInt();

        System.out.print("Enter m (columns): ");
        int m = sc.nextInt();

        int[] x = new int[m - 1];
        int[] y = new int[n - 1];

        System.out.println("Enter " + (m - 1) + " values for x[] (vertical cut costs):");
        for (int i = 0; i < m - 1; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Enter " + (n - 1) + " values for y[] (horizontal cut costs):");
        for (int i = 0; i < n - 1; i++) {
            y[i] = sc.nextInt();
        }
        int ans = minCost(n, m, x, y);
        System.out.println("Minimum Cost = " + ans);
    }
}