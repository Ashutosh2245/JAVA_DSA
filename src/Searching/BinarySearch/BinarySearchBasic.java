package Searching.BinarySearch;
import java.util.*;
public class BinarySearchBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0, high = n-1;
        int target = sc.nextInt();
        boolean flag = false;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(target>arr[mid]) low = mid+1;
            else if (target<arr[mid]) high = mid-1;
            else if (target==arr[mid]) {
                flag = true;
                break;
            }

        }
        if(flag) System.out.println("Found.");
        else System.out.println("Not Found.");

    }
}
