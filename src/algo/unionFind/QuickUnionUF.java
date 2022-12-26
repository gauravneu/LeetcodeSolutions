package algo.unionFind;

public class QuickUnionUF {
    private int[] id;
//Constructor to Initialize
    public QuickUnionUF(int N){
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }
// Keep checking for root: condition for root is entry for given element should be same as element
    private int root(int i){
        while(id[i] != i){
            i = id[i];
        }
        return i;
    }
//connected if roots are same
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
// union by changing root of first element to root of second element
    public void union(int p , int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    //Defect: Trees can get tall
    //Find too expensive(could be N array accesses)

}
