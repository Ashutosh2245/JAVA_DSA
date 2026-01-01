// GFG
package Queue;
import java.util.*;
public class FirstNegativeOfEveryWindow {
    public static List<Integer> firstNegInt(int[] arr, int k) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }

        for(int i=0;i<n-k+1;i++){
            while(!q.isEmpty() && q.peek()<i) q.remove();

            if(!q.isEmpty() && q.peek()<=i+k-1){
                res.add(arr[q.peek()]);
            }
            else if(q.isEmpty()) res.add(0);
            else res.add(0);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of window: ");
        int k = sc.nextInt();
        List<Integer> result = firstNegInt(arr,k);
        System.out.println("Result: "+result);
    }
}
