package PriorityQueue;
import java.util.*;
public class Basic {
    static class Task {
        String name;
        int priority;

        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> a.priority - b.priority);

        pq.add(new Task("Study", 2));
        pq.add(new Task("Emergency", 1));
        pq.add(new Task("Gaming", 3));

        while (!pq.isEmpty()) {
            Task t = pq.poll();
            System.out.println(t.name + " -> " + t.priority);
        }
    }
}