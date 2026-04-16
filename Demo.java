import java.util.*;
public class Demo {
    public int maxBalancedSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        int totalZeros = 0;
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') totalZeros++;
            else totalOnes++;
        }

        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0, -1);

        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += (s.charAt(i) == '1' ? 1 : -1);

            if (firstOccurrence.containsKey(currentSum)) {
                maxLen = Math.max(maxLen, i - firstOccurrence.get(currentSum));
            } else {
                firstOccurrence.put(currentSum, i);
            }

            if (firstOccurrence.containsKey(currentSum - 2)) {
                int start = firstOccurrence.get(currentSum - 2) + 1;
                int len = i - start + 1;
                int onesInRange = (len + 2) / 2;
                int zerosInRange = len - onesInRange;

                if (totalZeros > zerosInRange && onesInRange > 0) {
                    maxLen = Math.max(maxLen, len);
                }
            }

            if (firstOccurrence.containsKey(currentSum + 2)) {
                int start = firstOccurrence.get(currentSum + 2) + 1;
                int len = i - start + 1;
                int onesInRange = (len - 2) / 2;
                int zerosInRange = len - onesInRange;

                if (totalOnes > onesInRange && zerosInRange > 0) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxBalancedSubstring("100001"));
    }
}