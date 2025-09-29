package AdvancedSorting.CycleSort;
import java.util.*;
public class SetMismatchLC645 {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        SetMismatchLC645 sm = new SetMismatchLC645();
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(sm.findErrorNums(nums)));
    }
}
