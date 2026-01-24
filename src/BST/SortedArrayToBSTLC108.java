package BST;
import java.util.*;
public class SortedArrayToBSTLC108 {
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
    public static Node convert(int[] arr, int low, int high){
        if(low > high) return null;
        int mid = (low+high)/2;
        Node root = new Node(arr[mid]);
        root.left = convert(arr,low,mid-1);
        root.right = convert(arr,mid+1,high);
        return root;
    }
    public static Node sortedArrayToBST(int[] arr){
        int n = arr.length;
        return convert(arr,0,n-1);
    }
    public static void printOrder(Node root){
        if(root == null) return;
        printOrder(root.left);
        System.out.print(root.val + " ");
        printOrder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements (Sorted order): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = sortedArrayToBST(arr);
        System.out.print("Inorder of converted BST: ");
        printOrder(root);
    }
}
