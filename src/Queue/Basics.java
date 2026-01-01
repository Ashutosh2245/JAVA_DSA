package Queue;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Queue<Integer> q2 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        q.poll(); //q.remove();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.element());
        System.out.println(q.peek());
    }
}
//peek and element are same.
//remove and poll are same
//add instead of push
//remove instead of pop
//offer is also used as add