package HashSets_HashMaps;
import java.util.*;
public class CountNoOfDistinctIntegersLC2442 {
    public static int noOfDistinctIntegers(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();
    }
    public static int reverse(int num){
        int rev = 0;
        while (num > 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = noOfDistinctIntegers(arr);
        System.out.print("No of distinct integers after reverse operations: "+ans);
    }
}
