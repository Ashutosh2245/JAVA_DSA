package AdvancedSorting.CycleSort;
public class FirstMissingPositiveLC41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        FirstMissingPositiveLC41 obj = new FirstMissingPositiveLC41();
        int[] nums1 = {1, 2, 0};
        System.out.println("Output: " + obj.firstMissingPositive(nums1));

    }
}
