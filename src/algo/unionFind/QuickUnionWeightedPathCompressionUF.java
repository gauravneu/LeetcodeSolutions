package src.algo.unionFind;

public class QuickUnionWeightedPathCompressionUF {
    private final int[] id;
    private final int[] sz;

    //Constructor to Initialize
    public QuickUnionWeightedPathCompressionUF(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // Keep checking for root: condition for root is entry for given element should be same as element
    private int root(int i) {
        while (id[i] != i) {

            //Strategy 1: add second loop to root() to set the id[] of each examined node to the root

            //straqtegy 2: having path length(make every node oin path point to its grandparent)
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    //connected if roots are same
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // union by changing root of first element to root of second element
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    //Defect: Trees can get tall
    //Find too expensive(could be N array accesses)

}
