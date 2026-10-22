package Leetcode_Contest.October11;
import java.util.*;
public class PrimeSubsetSelectionQ4 {
    public static List<Integer> maxPrimes(int n, int s) {
        ArrayList<Integer> primes = new ArrayList<>();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int[] count = new int[s + 1];
        Arrays.fill(count, Integer.MAX_VALUE / 2);
        count[0] = 0;

        List<Integer>[] dp = new ArrayList[s + 1];
        dp[0] = new ArrayList<>();

        for (int p : primes) {
            for (int sum = s; sum >= p; sum--) {
                if (count[sum - p] == Integer.MAX_VALUE / 2) {
                    continue;
                }

                int newCount = count[sum - p] + 1;

                ArrayList<Integer> candidate = new ArrayList<>(dp[sum - p]);
                candidate.add(p);

                if (newCount < count[sum] || (newCount == count[sum] && (dp[sum] == null || lexicographicallySmaller(candidate, dp[sum])))) {
                    count[sum] = newCount;
                    dp[sum] = candidate;
                }
            }
        }

        for (int sum = s; sum >= 0; sum--) {
            if (dp[sum] != null) {
                return dp[sum];
            }
        }

        return new ArrayList<>();
    }

    private static boolean lexicographicallySmaller(List<Integer> a, List<Integer> b) {

        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) < b.get(i);
            }
        }

        return a.size() < b.size();
    }
}