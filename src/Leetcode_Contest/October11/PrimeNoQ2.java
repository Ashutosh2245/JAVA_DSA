// BRUTE FORCE //


//package Leetcode_Contest.October11;
//import java.util.*;
//public class PrimeNoQ2 {
//    static ArrayList<Integer> getPrimes(int n, int s) {
//        ArrayList<Integer> primes = new ArrayList<>();
//        int sum = 0;
//
//        for (int i = 2; i <= n; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j * j <= i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime && sum + i <= s) {
//                primes.add(i);
//                sum += i;
//            }
//        }
//
//        return primes;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getPrimes(7, 20));
//    }
//}


// OPTIMAL
package Leetcode_Contest.October11;
import java.util.*;
public class PrimeNoQ2 {

    static ArrayList<Integer> getPrimes(int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n < 2 || s < 2) {
            return ans;
        }

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i <= n / i; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                if (sum + i > s) {
                    break;
                }

                ans.add(i);
                sum += i;
            }
        }

        return ans;
    }
}