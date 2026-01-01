package Queue;
import java.util.*;
public class NoOfStudentsUnableToEatLC1700 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int s : students) {
            q.add(s);
        }
        int index = 0;           // sandwich pointer
        int attempts = 0;        // count rotations without eating
        while (!q.isEmpty() && attempts < q.size()) {

            if (q.peek() == sandwiches[index]) {
                q.poll();        // student eats
                index++;         // next sandwich
                attempts = 0;    // reset rotation count
            } else {
                q.add(q.poll()); // move student to back
                attempts++;
            }
        }
        return q.size(); // students who couldn't eat
    }
    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};

        int count = countStudents(students,sandwiches);
        System.out.println("Count: "+count);
    }
}
