package Searching.BinarySearch;
public class MinCostToMakeArrayEqual {
    public long minCost(int[] nums, int[] cost) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int v : nums) {
            min = Math.min(min, v);
            max = Math.max(max, v);
        }
        while (min < max) {
            int mid = (min + max) / 2;
            long c1 = calc(nums, cost, mid);
            long c2 = calc(nums, cost, mid + 1);
            if (c1 <= c2) max = mid;
            else min = mid + 1;
        }
        return calc(nums, cost, min);
    }
    private long calc(int[] nums, int[] cost, int x) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += (long)Math.abs(nums[i] - x) * cost[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,2};
        int[] cost = {2,3,1,14};
        MinCostToMakeArrayEqual obj = new MinCostToMakeArrayEqual();
        System.out.println(obj.minCost(nums,cost));
    }
}

