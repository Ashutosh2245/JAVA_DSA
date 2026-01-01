package Queue;
import java.util.*;
public class PrintAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue <Integer> q = new LinkedList<>();
        System.out.print("Enter Queue Size: ");
        int n = sc.nextInt();
        System.out.print("Enter Queue Elements: ");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        Queue <Integer> temp = new LinkedList<>();
        System.out.print("Queue: ");
        while (!q.isEmpty()){
            System.out.print(q.peek() +" ");
            temp.add(q.remove());
        }
        while (!temp.isEmpty()){
            q.add(temp.remove());
        }
        System.out.println("\nSize: "+q.size());
    }
}