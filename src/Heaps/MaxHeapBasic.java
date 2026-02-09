package Heaps;
import java.util.*;
public class MaxHeapBasic {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq + " "+"Max Element: " + pq.peek());
        pq.add(10);
        System.out.println(pq + " "+"Max Element: " + pq.peek());
        pq.add(1);
        System.out.println(pq + " "+"Max Element: " + pq.peek());
        pq.remove();
        System.out.println(pq + " "+"Max Element: " + pq.peek());
        pq.add(0);
        System.out.println(pq + " "+"Max Element: " + pq.peek());
    }
}
