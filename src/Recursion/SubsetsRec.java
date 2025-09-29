package Recursion;
import java.util.*;
public class SubsetsRec {
    public static void generateSubsets(int[] arr, int idx, List<Integer> current, List<List<Integer>> result) {
        if (idx == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[idx]);
        generateSubsets(arr, idx + 1, current, result);
        current.removeLast();
        generateSubsets(arr, idx + 1, current, result);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}

