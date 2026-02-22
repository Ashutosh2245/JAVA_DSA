package PrefixSum;
import java.util.*;
public class CorporateFlightBookingsLC1109 {
    public static int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];

        for(int i = 0; i < arr.length; i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];
            ans[first-1] += seats;
            if(last < n){
                ans[last] -= seats;
            }
        }

        for(int i = 1; i < n; i++){
            ans[i] += ans[i-1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,10},{2,3,20},{2,5,25}};
        int n = 5;
        int[] ans = corpFlightBookings(arr,n);
        System.out.print("Total no of reserved seats in each flight: ");
        for (int ele : ans){
            System.out.print(ele + " ");
        }

    }
}

