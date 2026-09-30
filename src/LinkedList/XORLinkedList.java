package LinkedList;
import java.util.*;
public class XORLinkedList {
    public static class Node{
        int data, link;
        Node(int data){
            this.data = data;
            this.link = 0;
        }
    }
    static HashMap<Integer, Node> nodes = new HashMap<>();
    static int head = 0, tail = 0, nextId = 1;

    public static void insertFront(int data) {
        int id = nextId++;
        Node newNode = new Node(data);
        nodes.put(id, newNode);
        if (head == 0) {
            head = tail = id;
        }

        else {
            newNode.link = head;
            Node headNode = nodes.get(head);
            headNode.link = headNode.link ^ id;
            head = id;
        }
    }

    public static void insertBack(int data) {
        int id = nextId++;
        Node newNode = new Node(data);
        nodes.put(id, newNode);
        if (head == 0) {
            head = tail = id;
        }

        else {
            newNode.link = tail;
            Node tailNode = nodes.get(tail);
            tailNode.link = tailNode.link ^ id;
            tail = id;
        }
    }

    public static void forward(){
        int prev = 0, curr = head;
        while (curr != 0){
            Node node = nodes.get(curr);
            System.out.print(node.data + " ");
            int next = prev ^ node.link;
            prev = curr;
            curr = next;
        }
        System.out.println();
    }

    public static void backward() {
        int next = 0, curr = tail;

        while (curr != 0) {
            Node node = nodes.get(curr);
            System.out.print(node.data + " ");
            int prev = next ^ node.link;
            next = curr;
            curr = prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertFront(10);
        insertFront(20);
        insertFront(30);
        insertFront(40);

        forward();
        backward();

        insertBack(50);
        insertBack(60);

        forward();
        backward();
    }
}
