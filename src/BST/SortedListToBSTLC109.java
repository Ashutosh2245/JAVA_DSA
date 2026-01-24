// Method 1 :-> Sorted LinkedList -> ArrayList -> Binary Search Tree

/*
package BST;
import java.util.*;
public class SortedListToBSTLC109 {
    public static class Node{
        int val;
        Node left, right ;
        Node (int val){
            this.val = val;
        }
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
       public static Node ListToBST(ListNode head){
        ArrayList <Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        return buildTree(list, 0 ,n-1);
    }
    public static Node buildTree(ArrayList<Integer> list, int left, int right){
        if (left>right) return null;
        int mid = (left+right)/2;
        Node root = new Node(list.get(mid));
        root.left = buildTree(list,left,mid-1);
        root.right = buildTree(list, mid+1, right);
        return root;
    }
    public static void printInOrderOfTree(Node root){
        if (root == null) return;
        printInOrderOfTree(root.left);
        System.out.print(root.val + " ");
        printInOrderOfTree(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of node in LinkedList: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of LinkedList(Sorted Order): ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        Node root = ListToBST(head);
        System.out.print("Inorder of BST: ");
        printInOrderOfTree(root);
    }
}
*/


// Method 2 -> Using Slow and Fast pointers.
// When fast == null or fast.next == null then slow is at last node of leftHalf of BST.
// Slow.next = null (Slow.next becomes root)
// RightHalf of BST will be from slow.next.next till end.
// Print inorder of BST
package BST;
import java.util.*;
public class SortedListToBSTLC109 {
    public static class Node{
        int val;
        Node left, right ;
        Node (int val){
            this.val = val;
        }
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static Node ListToBST(ListNode head){
        if (head == null) return null;
        if(head.next == null) return new Node(head.val);

        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node root = new Node(slow.next.val);
        ListNode rightHalf = slow.next.next;
        slow.next = null;

        root.left = ListToBST(head);
        root.right = ListToBST(rightHalf);

        return root;
    }
    public static void printInOrderOfTree(Node root){
        if (root == null) return;
        printInOrderOfTree(root.left);
        System.out.print(root.val + " ");
        printInOrderOfTree(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of node in LinkedList: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of LinkedList(Sorted Order): ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        Node root = ListToBST(head);
        System.out.print("Inorder of BST: ");
        printInOrderOfTree(root);
    }
}
