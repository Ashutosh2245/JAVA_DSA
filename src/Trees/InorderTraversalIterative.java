package Trees;
import java.util.*;
public class InorderTraversalIterative  {
    public static class Node{
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node buildTree(int[] arr){
        if(arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue <Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i<arr.length){
            Node curr = q.poll();
            if(i < arr.length && arr[i] != -1){
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;
            if(i<arr.length && arr[i] != -1){
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static List<Integer> inorderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack <Node> st = new Stack<>();
        Node temp = root;
        while (true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                if(st.isEmpty()) break;
                Node top = st.pop();
                ans.add(top.val);
                temp = top.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the tree nodes: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr);
        List <Integer> ans = inorderIterative(root);
        System.out.print("Inorder Traversal (Iterative): ");
        for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
