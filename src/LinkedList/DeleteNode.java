package LinkedList;
public class DeleteNode {
    public static void main(String[] args) {
        ListNodes head = new ListNodes(4);
        head.next = new ListNodes(5);
        head.next.next = new ListNodes(1);
        head.next.next.next = new ListNodes(9);

        Solution sol = new Solution();
        sol.deleteNode(head.next);

        ListNodes cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}
class ListNodes {
    int val;
    ListNodes next;
    ListNodes(int val) {
        this.val = val;
    }
}

class Solution {
    public void deleteNode(ListNodes node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
