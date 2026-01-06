package Trees;
import java.util.*;
public class SameTreeLC100{
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes in tree 1: ");
        int n = sc.nextInt();
        Node root1 = null;
        System.out.print("Enter nodes of tree 1: ");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            root1 = insert(root1,val);
        }
        System.out.print("Enter no of nodes in tree 2: ");
        int m = sc.nextInt();
        Node root2 = null;
        System.out.print("Enter nodes of tree 2: ");
        for(int i=0;i<m;i++){
            int val = sc.nextInt();
            root2 = insert(root2,val);
        }
        System.out.println("Are both binary trees same? - ");
        if(isSameTree(root1,root2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static Node insert(Node root, int val){
        if(root==null) return new Node(val);
        if(val<root.val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        //if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;
    }
}
