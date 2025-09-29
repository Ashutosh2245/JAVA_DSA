package MindMerge2;
import java.util.Scanner;
public class FindLonelyInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int  i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = 0;
        for (int i = 0; i < n; i++) {
            target ^= arr[i];
        }
        System.out.println(target);
    }
}

