package SlidingWindow;
public class GrumpyBookStoreOwnerLC1052 {
    public static int maxSatisfied(int[] arr, int[] grumpy, int X) {
        int n = arr.length, left = 0, right = 0;
        int alreadySatisfied = 0, extraSatisfied = 0;
        int maxExtra = 0;

        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0) alreadySatisfied += arr[i];
        }
        while(right < n){
            if(grumpy[right] == 1) {
                extraSatisfied += arr[right];
            }
            if(right - left + 1 > X){
                if(grumpy[left] == 1) {
                    extraSatisfied -= arr[left];
                }
                left++;
            }
            maxExtra = Math.max(maxExtra, extraSatisfied);
            right++;
        }
        return alreadySatisfied + maxExtra;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        int ans = maxSatisfied(arr, grumpy, minutes);
        System.out.println("Maximum satisfied customers: "+ans);
    }
}