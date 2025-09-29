package Searching.BinarySearch;
public class MinimumTimeToCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long minTime = Integer.MAX_VALUE;
        for(int t: time){
            minTime = Math.min(minTime,t);
        }
        long low = 1, high = minTime*(long)totalTrips;
        while(low<high){
            long mid = low+(high-low)/2;
            long trips = 0;
            for(int t : time){
                trips += mid/t;
                if(trips>=totalTrips) break;
            }
            if(trips>=totalTrips) high = mid;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int totalTrips = 5;
        MinimumTimeToCompleteTrips obj = new MinimumTimeToCompleteTrips();
        System.out.println(obj.minimumTime(arr,totalTrips));
    }
}