package Queue;
import java.util.*;
public class MaxSlidingWindowsLC239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int idx = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            while(!q.isEmpty()&&q.peek()<i-k+1) //remove out of window elements
            {
                q.remove();
            }
            // remove smaller elements from right hand side
            while(!q.isEmpty()&&nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.add(i);
            if(i>=k-1){
                res[idx] = nums[q.peek()];
                idx++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of Window: ");
        int k = sc.nextInt();
        int[] result = maxSlidingWindow(arr,k);
        System.out.print("Maximum sliding window: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}