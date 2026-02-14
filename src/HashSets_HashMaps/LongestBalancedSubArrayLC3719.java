package HashSets_HashMaps;
import java.util.*;
public class LongestBalancedSubArrayLC3719 {
    public static int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int l = 0; l < n; l++) {
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for (int r = l; r < n; r++) {

                if (nums[r] % 2 == 0) {
                    evenSet.add(nums[r]);
                } else {
                    oddSet.add(nums[r]);
                }

                if (evenSet.size() == oddSet.size()) {
                    ans = Math.max(ans, r - l + 1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,5};
        System.out.println(longestBalanced(arr));
    }
}
/*class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int l = 0; l < n; l++) {
            HashMap<Integer, Integer> even = new HashMap<>();
            HashMap<Integer, Integer> odd = new HashMap<>();

            for (int r = l; r < n; r++) {

                if (nums[r] % 2 == 0) {
                    if (even.containsKey(nums[r])) {
                        int freq = even.get(nums[r]);
                        even.put(nums[r], freq + 1);
                    } else {
                        even.put(nums[r], 1);
                    }
                }
                else {
                    if (odd.containsKey(nums[r])) {
                        int freq = odd.get(nums[r]);
                        odd.put(nums[r], freq + 1);
                    } else {
                        odd.put(nums[r], 1);
                    }
                }

                if (even.size() == odd.size()) {
                    ans = Math.max(ans, r - l + 1);
                }
            }
        }
        return ans;
    }
}
*/
