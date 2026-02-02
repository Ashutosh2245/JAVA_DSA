package LeetcodeDailyQuestions;
import java.util.*;
public class SubArrayMinCostLC3010 {
    public static int minimumCost(int[] nums){
        int n = nums.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }
            else if (nums[i] < min2){
                min2 = nums[i];
            }
        }
        return nums[0] + min1 + min2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = minimumCost(arr);
        System.out.print("Minimum Cost: "+answer);
    }
}
