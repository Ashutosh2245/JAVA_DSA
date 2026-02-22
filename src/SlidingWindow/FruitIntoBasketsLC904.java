package SlidingWindow;
import java.util.*;
public class FruitIntoBasketsLC904 {
    public static int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0, right = 0;
        int maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while(right < n){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        int ans = totalFruit(fruits);
        System.out.println("Maximum no of fruits: "+ans);
    }
}