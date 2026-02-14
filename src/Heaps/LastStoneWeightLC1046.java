// Method 1 - >> Using PriorityQueue
package Heaps;
import java.util.*;
public class LastStoneWeightLC1046{
    public static int lastStone(int[] nums){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            pq.add(ele);
        }
        while(pq.size() > 1){
            int y = pq.remove();
            int x = pq.remove();
            if(y != x){
                pq.add(y - x);
            }
        }
        if(pq.isEmpty()) return 0;
        else return pq.remove();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of stones in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Last Stone Weight: ");
        int ans = lastStone(arr);
        System.out.print(ans);
    }
}



// Method 2 -->>> Using ArrayList

/*package Heaps;
import java.util.*;
public class LastStoneWeightLC1046{
    public static int lastStone(int[] nums){
        ArrayList <Integer> arr = new ArrayList<>();
        for(int ele : nums){
            arr.add(ele);
        }
        while(arr.size() > 1){
            Collections.sort(arr);
            int y = arr.removeLast(); // arr.remove(arr.size()-1)
            int x = arr.removeLast();
            if(y != x){
                arr.add(y - x);
            }
        }
        if(arr.isEmpty()) return 0;
        else return arr.getFirst(); // arr.get(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of stones in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Last Stone Weight: ");
        int ans = lastStone(arr);
        System.out.print(ans);
    }
}
*/