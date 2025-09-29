package Searching.BinarySearch;
public class KokoLC875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int pile: piles){
            maxSpeed = Math.max(maxSpeed,pile);
        }
        while(minSpeed<maxSpeed){
            int mid = minSpeed + (maxSpeed-minSpeed)/2;
            if(canEatInTime(piles,h,mid)) maxSpeed = mid;
            else minSpeed = mid+1;
        }
        return minSpeed;
    }
    public static boolean canEatInTime(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile:piles){
            hours += (int) Math.ceil((double) pile/speed);
        }
        return hours <= h;
    }
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        int time = 8;
        int ans = minEatingSpeed(arr,time);
        System.out.println(ans);
    }
}
