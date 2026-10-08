package Stack;
import java.util.*;
public class CelebrityProblem {
    static int celebrity(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if (M[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int candidate = st.pop();


        for (int i = 0; i < n; i++) {
            if (i == candidate) {
                continue;
            }

            if (M[i][candidate] == 0) {
                return -1;
            }

            if (M[candidate][i] == 1) {
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[][] M = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        int n = M.length;

        int ans = celebrity(M, n);

        if (ans == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println("Celebrity is: " + ans);
        }
    }
}