package Recursion;
import java.util.*;
public class SubsetSum {
    public static void findSubsetSum(int[] arr, int idx, int target, List<Integer> current) {
        if (idx == arr.length) {
            if (target == 0) {
                System.out.println(current);
            }
            return;
        }
        current.add(arr[idx]);
        findSubsetSum(arr, idx + 1, target - arr[idx], current);
        current.removeLast();
        findSubsetSum(arr, idx + 1, target, current);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 5;
        findSubsetSum(arr, 0, target, new ArrayList<>());
    }
}

