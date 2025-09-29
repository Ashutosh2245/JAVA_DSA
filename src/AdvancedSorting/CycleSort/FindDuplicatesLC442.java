package AdvancedSorting.CycleSort;
import java.util.*;
public class FindDuplicatesLC442 {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(nums[j]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FindDuplicatesLC442 fd = new FindDuplicatesLC442();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(fd.findDuplicates(nums)); // [2,3]
    }
}
