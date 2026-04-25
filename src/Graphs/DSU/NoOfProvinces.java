package Graphs.DSU;
import java.util.*;

class DSU3 {
    int[] parent, size;

    public DSU3(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa == pb) return;

        if (size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }
    }
}

public class NoOfProvinces {

    // 🔥 Separate function
    public static int countProvinces(int[][] isConnected) {
        int n = isConnected.length;
        DSU3 dsu = new DSU3(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    dsu.union(i, j);
                }
            }
        }

        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) provinces++;
        }

        return provinces;
    }

    public static void main(String[] args) {

        int[][] isConnected = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        int ans = countProvinces(isConnected);

        System.out.println("Number of Provinces: " + ans);
    }
}