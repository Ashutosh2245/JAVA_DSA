package Trees;
import java.util.*;
public class PathSum2LC113 {
    static boolean ans;
    public static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }
    public static Node BuildBT(int[] arr){
        if(arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue <Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i<arr.length){
            Node curr = q.poll();
            if(i<arr.length && arr[i] != -1){
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
    public static List<Integer> copy(List<Integer> arr){
        List <Integer> list = new ArrayList<>();
        for(int ele : arr){
            list.add(ele);
        }
        return list;
    }
    public static void helper (Node root, int target, List<Integer> arr, List<List<Integer>> ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(root.val == target){
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }
        arr.add(root.val);
        List<Integer> arr1 = copy(arr);
        List<Integer> arr2 = copy(arr);
        helper(root.left, target-root.val, arr1, ans);
        helper(root.right, target-root.val, arr2, ans);
    }
    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(root,targetSum,arr,ans);
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
        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        Node root = BuildBT(arr);

        System.out.println("Paths with given sum: ");
        System.out.println(pathSum(root, targetSum));
    }
}
