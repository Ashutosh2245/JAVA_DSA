// Method 01 :-> Using isContains

/*package Backtracking;
import java.util.*;
public class PermutationsLC46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }

    public static void backtrack(List<List<Integer>> ans, List<Integer> perm, int[] nums){
        if(perm.size() == nums.length){
            ans.add(new ArrayList<>(perm));
            return;
        }

        for(int num : nums){
            if(perm.contains(num)) continue;
            perm.add(num);
            backtrack(ans, perm, nums);
            perm.remove(perm.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
}
*/

// Method 02 :-> Using boolean array.

package Backtracking;
import java.util.*;
public class PermutationsLC46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(ans, new ArrayList<>(), nums, used);
        return ans;
    }
    public static void backtrack(List<List<Integer>> ans, List<Integer> perm, int[] nums, boolean[] used){
        if(perm.size() == nums.length){
            ans.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            perm.add(nums[i]);
            backtrack(ans, perm, nums, used);
            perm.remove(perm.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
}