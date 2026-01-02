package Queue;
import java.util.*;
public class RevealCardsLC950 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[q.remove()] = deck[i];

            if (!q.isEmpty()) {
                q.add(q.remove());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {17,13,11,2,3,5,7};
        int[] res = deckRevealedIncreasing(arr);
        System.out.print("Result: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}

