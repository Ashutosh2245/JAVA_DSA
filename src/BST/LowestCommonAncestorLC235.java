package BST;
import java.util.*;
public class LowestCommonAncestorLC235 {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if(root == null) return new Node(val);
        if(val < root.val) {
            root.left = buildBST(root.left,val);
        }
        else if (val > root.val){
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    private static Node LCA(Node root, int p, int q){
        if (root == null) return null;
        if(root.val < p && root.val < q){
            return LCA(root.right,p,q);
        }
        else if(root.val > p && root.val > q){
            return LCA(root.left,p,q);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the BST nodes: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = buildBST(root,val);
        }
        System.out.print("Enter the first node(P): ");
        int p = sc.nextInt();
        System.out.print("Enter the second node(Q): ");
        int q = sc.nextInt();
        Node ans = LCA(root,p,q);
        if(ans != null){
            System.out.println("Lowest Common Ancestor: "+ans.val);
        }
        else System.out.println("LCA not found");
    }
}

