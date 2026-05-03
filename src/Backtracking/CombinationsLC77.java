package Backtracking;
import java.util.*;
public class CombinationsLC77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> comb, int start, int n, int k){
        if(comb.size() == k){
            result.add(new ArrayList<>(comb));
            return;
        }

        for(int i = start; i <= n - (k - comb.size()) + 1; i++){
            comb.add(i);
            backtrack(result, comb, i+1, n, k);
            comb.remove(comb.size() - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> ans = combine(n, k);
        System.out.println(ans);
    }
}
