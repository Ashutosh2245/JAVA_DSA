package LinkedList;
import java.util.Scanner;
public class NodesBetweenCriticalPointsLC2058 {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public int[] nodesBetweenCriticalPoints(Node head) {
        if (head == null || head.next == null || head.next.next == null)
            return new int[]{-1, -1};
        int index = 1;
        int firstCritical = -1;
        int prevCritical = -1;
        int minDist = Integer.MAX_VALUE;
        Node prev = head;
        Node curr = head.next;
        while (curr.next != null) {
            int val = curr.val;
            if ((val > prev.val && val > curr.next.val) || (val < prev.val && val < curr.next.val)) {
                if (firstCritical == -1)
                    firstCritical = index;
                else
                    minDist = Math.min(minDist, index - prevCritical);
                prevCritical = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if (firstCritical == -1 || firstCritical == prevCritical)
            return new int[]{-1, -1};
        int maxDist = prevCritical - firstCritical;
        return new int[]{minDist, maxDist};
    }
    public static void printList(SplitLLInPartsLC725.Node head){
        SplitLLInPartsLC725.Node curr = head;
        while (curr!=null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of LL: ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+ " node values: ");
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        NodesBetweenCriticalPointsLC2058 obj = new NodesBetweenCriticalPointsLC2058();
        int[] res = obj.nodesBetweenCriticalPoints(head);
        System.out.println("Minimum distance: "+res[0]);
        System.out.println("Maximum distance: "+res[1]);
    }
}

