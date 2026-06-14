package Greedy;
import java.util.*;
public class MinProductSubsetGFG {
    public static int minProd(List<Integer> arr) {
        int n = arr.size();
        int minProduct = Integer.MAX_VALUE;

        for (int mask = 1; mask < (1 << n); mask++) {
            int product = 1;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    product *= arr.get(i);
                }
            }

            minProduct = Math.min(minProduct, product);
        }

        return minProduct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Min product subset: "+minProd(arr));
    }
}