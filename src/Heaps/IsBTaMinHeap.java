package Heaps;
public class IsBTaMinHeap {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static boolean isMinHeap(Node root){
        if(root == null) return true;
        if(root.left != null){
            if(root.val > root.left.val) return false;
        }
        if(root.right != null){
            if(root.val > root.right.val) return false;
        }
        return isMinHeap(root.left) && isMinHeap(root.right);
    }
    public static boolean isCBT(Node root, int i, Integer n){
        if(root == null) return true;
        if(i >= n) return false;
        return isCBT(root.left,2*i+1,n) && isCBT(root.right, 2*i+2, n);
    }

    public static boolean isBTaMinHeap(Node root){
        int n = size(root);
        return isMinHeap(root) && isCBT(root,0,n);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println("Is CBT: "+isCBT(a,0,size(a)));
        System.out.println("Is MinHeap: "+isBTaMinHeap(a));
    }
}
