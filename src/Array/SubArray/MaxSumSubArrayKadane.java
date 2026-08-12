package Array.SubArray;

public class MaxSumSubArrayKadane {
    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4,-5,-6,-7,-9};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
