package LinkedList;
public class ShallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        Node temp = a; //Shallow copy
        System.out.println(a.val);
        System.out.println(temp.val);
        Node temp1 = new Node(100); //deep copy

        System.out.println(a); //LinkedList.Node@8efb846
        System.out.println(temp); //LinkedList.Node@8efb846
        System.out.println(temp1); //LinkedList.Node@2a84aee7
    }
}
// In shallow copy address will be same.
// Shallow copy can change the value of original variable.
