package Greedy;
public class TaskScheduler{
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxCount = 0;
        for (char c : tasks) {
            freq[c - 'A']++;
            maxCount = Math.max(maxCount, freq[c - 'A']);
        }
        int ans = (maxCount - 1) * (n + 1);
        for (int f : freq) {
            if (f == maxCount)
                ans++;
        }
        return Math.max(ans, tasks.length);
    }
    public static void main(String[] args) {
        TaskScheduler obj = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println("Minimum intervals required: " + obj.leastInterval(tasks, n));
    }
}





/*package Greedy;
import java.util.*;
public class TaskScheduler{
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxCount = 0;
        for (char c : tasks) {
            freq[c - 'A']++;
            maxCount = Math.max(maxCount, freq[c - 'A']);
        }
        int ans = (maxCount - 1) * (n + 1);
        for (int f : freq) {
            if (f == maxCount)
                ans++;
        }
        return Math.max(ans, tasks.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tasks: ");
        int size = sc.nextInt();
        char[] tasks = new char[size];
        System.out.println("Enter tasks (A–Z): ");
        for (int i = 0; i < size; i++) {
            tasks[i] = sc.next().toUpperCase().charAt(0);
        }
        System.out.print("Enter cooldown period (n): ");
        int n = sc.nextInt();
        int result = leastInterval(tasks, n);
        System.out.println("Minimum intervals required: " + result);
        sc.close();
    }
}*/

