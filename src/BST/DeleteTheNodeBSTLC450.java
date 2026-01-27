package BST;
import java.util.Scanner;
public class DeleteTheNodeBSTLC450 {
    public static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode buildBST(TreeNode root, int val){
        if (root == null) return new TreeNode(val);
        if(val < root.val){
            root.left = buildBST(root.left,val);
        }
        else{
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    static void printInorder(TreeNode root){
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val == key){
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null || root.right == null){
                if(root.left == null) return root.right;
                else return root.left;
            }
            else{
                TreeNode pred = inorderPredecessor(root);
                TreeNode predParent = parent(root,pred);

                if(root == predParent){
                    pred.right = root.right;
                    return pred;
                }
                predParent.right = pred.left;
                pred.left = root.left;
                pred.right = root.right;

                return pred;
            }
        }
        else if(root.val > key){
            root.left = deleteNode(root.left,key);
        }
        else{
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
    public static TreeNode inorderPredecessor(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }
    public static TreeNode parent(TreeNode root, TreeNode pred){
        if(root.left == pred || root.right == pred) return root;
        TreeNode temp = root.left;
        while(temp.right != pred){
            temp = temp.right;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        TreeNode root = null;
        System.out.print("Enter the BST nodes: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = buildBST(root,x);
        }
        System.out.print("Enter the node to delete: ");
        int num = sc.nextInt();
        root = deleteNode(root,num);
        System.out.print("Inorder of modified BST: ");
        printInorder(root);
    }
}