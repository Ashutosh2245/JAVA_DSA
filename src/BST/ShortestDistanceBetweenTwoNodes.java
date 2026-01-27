package BST;
import java.util.*;
public class ShortestDistanceBetweenTwoNodes {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildTree(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildTree(root.left,val);
        }
        else {
            root.right = buildTree(root.right,val);
        }
        return root;
    }
    public static int distance(Node root, int a, int b){
        Node lca = LCA(root, a, b);
        int d1 = distFromLCA(lca,a);
        int d2 = distFromLCA(lca,b);

        return d1+d2;
    }
    private static Node LCA(Node root, int a, int b){
        while (root != null){
            if( a < root.val && b < root.val){
                root = root.left;
            }
            else if( a > root.val && b > root.val){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
    private static int distFromLCA(Node root, int target){
        int d = 0;
        while (root.val != target){
            if(target < root.val) root = root.left;
            else root = root.right;

            d++;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the nodes of BST: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildTree(root,val);
        }
        System.out.print("Enter first node: ");
        int a = sc.nextInt();
        System.out.print("Enter second node: ");
        int b = sc.nextInt();
        int dis = distance(root,a,b);
        System.out.print("Distance between nodes: "+dis);
    }
}
