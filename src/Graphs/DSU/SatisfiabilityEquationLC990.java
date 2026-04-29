package Graphs.DSU;
public class SatisfiabilityEquationLC990 {

    static int[] parent;

    public static void main(String[] args) {

        String[] eq1 = {"a==b", "b==c", "a==c"};
        System.out.println(equationsPossible(eq1)); // true

        String[] eq2 = {"a==b", "b!=c", "c==a"};
        System.out.println(equationsPossible(eq2)); // false

        String[] eq3 = {"c==c", "b==d", "x!=z"};
        System.out.println(equationsPossible(eq3)); // true
    }

    public static boolean equationsPossible(String[] equations) {

        parent = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        // Step 1: Process all "=="
        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                int u = eq.charAt(0) - 'a';
                int v = eq.charAt(3) - 'a';
                union(u, v);
            }
        }

        // Step 2: Check all "!="
        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                int u = eq.charAt(0) - 'a';
                int v = eq.charAt(3) - 'a';

                if (find(u) == find(v)) {
                    return false;
                }
            }
        }

        return true;
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }

    static void union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu != pv) {
            parent[pu] = pv;
        }
    }
}