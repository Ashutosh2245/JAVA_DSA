// Sort a K sorted Array OR, Sort a nearly Sorted Array
// Using an extra arraylist.
package Heaps;
import java.util.*;
public class SortAKSortedArray {
    public static ArrayList <Integer> nearlySorted(int[] arr, int k){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        ArrayList <Integer> ans = new ArrayList<>();
        for (int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                ans.add(pq.remove());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        ArrayList <Integer> answer = nearlySorted(arr, k);
        System.out.println("Sorted Array: "+answer);
    }
}


// METHOD 2 - >> IN PLACE SORTING WITHOUT ANY EXTRA SPACE
/*package Heaps;
import java.util.*;
public class SortAKSortedArray {
    public static void nearlySorted(int[] arr, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                arr[idx] = pq.remove();
                idx++;
            }
        }
        while(!pq.isEmpty()){
            arr[idx] = pq.remove();
            idx++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        nearlySorted(arr,k);
        System.out.print("Sorted Array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
*/