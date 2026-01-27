package BST;
import java.util.*;
public class MergeTwoBSTLC1305 {
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node buildBST(Node root, int val){
        if (root == null) return new Node(val);
        if(val < root.val){
            root.left = buildBST(root.left, val);
        }
        else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    public static ArrayList<Integer> getAllElements(Node root1, Node root2) {
        ArrayList <Integer> list1 = new ArrayList <>();
        ArrayList <Integer> list2 = new ArrayList <>();

        inorder(root1, list1);
        inorder(root2, list2);

        ArrayList <Integer> ans = new ArrayList<>();
        int n = list1.size(), m = list2.size();
        int i = 0, j = 0;
        while(i < n && j < m){
            if(list1.get(i) <= list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }
            else{
                ans.add(list2.get(j));
                j++;
            }
        }
        while(i < n){
            ans.add(list1.get(i));
            i++;
        }
        while(j < m){
            ans.add(list2.get(j));
            j++;
        }
        return ans;
    }
    public static void inorder(Node root, ArrayList <Integer> arr){
        if (root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes in first BST: ");
        int n = sc.nextInt();
        Node root1 = null;
        System.out.print("Enter the nodes of first BST: ");
        for (int i = 0; i < n; i++) {
            int val1 = sc.nextInt();
            root1 = buildBST(root1,val1);
        }
        System.out.print("Enter the no of nodes in second BST: ");
        int m = sc.nextInt();
        Node root2 = null;
        System.out.print("Enter the nodes of second BST: ");
        for (int i = 0; i < m; i++) {
            int val1 = sc.nextInt();
            root2 = buildBST(root2,val1);
        }
        ArrayList <Integer> ans1 = getAllElements(root1,root2);
        System.out.print("Merged BST: "+ans1);




    }
}

