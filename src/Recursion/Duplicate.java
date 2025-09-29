package Recursion;
import java.util.*;
public class Duplicate {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private static void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(current);

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;

            List<Integer> newSubset = new ArrayList<>(current);
            newSubset.add(nums[i]);

            generate(nums, i + 1, newSubset, result);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
}

