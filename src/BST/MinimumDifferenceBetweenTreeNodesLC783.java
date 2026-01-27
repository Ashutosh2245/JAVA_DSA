package BST;
import java.util.*;
public class MinimumDifferenceBetweenTreeNodesLC783 {
    static ArrayList <Integer> arr = new ArrayList<>();
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if(root == null) return new Node(val);

        if (val < root.val){
            root.left = buildBST(root.left,val);
        }
        else{
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    public static int minDifference(Node root){
        inorder(root,arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            minDiff = Math.min(minDiff, arr.get(i) - arr.get(i-1));
        }
        return minDiff;
    }
    public static int maxDifference(Node root){
        inorder(root,arr);

        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            maxDiff = Math.max(maxDiff, arr.get(i) - arr.get(i-1));
        }
        return maxDiff;
    }
    public static void inorder(Node root, ArrayList <Integer> arr){
        if (root == null) return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        Node root = null;
        System.out.print("Enter the BST nodes: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = buildBST(root,x);
        }
        int min = minDifference(root);
        int max = maxDifference(root);
        System.out.println("Minimum difference between any two nodes: "+min);
        System.out.println("Maximum difference between any two nodes: "+max);
    }

}
