package Recursion;
import java.util.*;
public class CombinationSum {
    public static void combinationSum(int[] arr, int target, int idx, List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }
        if (idx == arr.length || target < 0) return;
        current.add(arr[idx]);
        combinationSum(arr, target - arr[idx], idx, current);
        current.removeLast();// current.removeLast()
        combinationSum(arr, target, idx + 1, current);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        combinationSum(arr, target, 0, new ArrayList<>());
    }
}

