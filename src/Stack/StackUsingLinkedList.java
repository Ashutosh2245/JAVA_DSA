package Stack;
class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    Node top = null;
    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }
    int pop() {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }

    void display() {
        for (Node t = top; t != null; t = t.next)
            System.out.print(t.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();     
    }
}

