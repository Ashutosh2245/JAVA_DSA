package BST;
import java.util.*;
public class CountNoOfBSTInARange {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildTree(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildTree(root.left,val);
        }
        else{
            root.right = buildTree(root.right,val);
        }
        return root;
    }
    public static int getCount(Node root, int low, int high){
        if (root == null) return 0;
        if (root.val < low ){
            return getCount(root.right,low,high);
        }
        if (root.val > high){
            return getCount(root.left,low,high);
        }
        return 1 + getCount(root.left,low,high) + getCount(root.right,low,high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the BST nodes: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildTree(root,val);
        }
        System.out.print("Enter Lower Limit: ");
        int l = sc.nextInt();
        System.out.print("Enter Upper Limit: ");
        int h = sc.nextInt();
        int c = getCount(root,l,h);
        System.out.print("No. of Tree Nodes lying in this range: "+c);
    }

}
