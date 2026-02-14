package Trees;
import java.util.*;
public class PostOrderTraversalIterative {
    public static class Node{
        Node left, right;
        int val;
        Node (int val){
            this.val = val;
        }
    }
    public static List<Integer> postorderItr(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root!=null) st.push(root);
        while (!st.isEmpty()){
            Node top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
    // Method 2 -- >> 2 Stacks
    public static void postorderUsingStack(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            Node curr = s1.pop();
            s2.push(curr);

            if (curr.left != null) s1.push(curr.left);
            if (curr.right != null) s1.push(curr.right);
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop().val + " ");
        }
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
        System.out.print("Postorder Traversal: ");
        List<Integer> ans = postorderItr(a);
        for(int num: ans){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.print("Postorder : ");
        postorderUsingStack(a);
    }
}
// PostOrder is reverse of reverse pre order.