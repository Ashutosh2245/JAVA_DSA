package MindMerge2;
import java.util.*;
public class SumOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += (arr[i]*arr[i]);
        }
        System.out.println(sum);
    }
}
