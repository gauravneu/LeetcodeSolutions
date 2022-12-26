package algo.unionFind;

//class for Eager Implementation of Union find: QuickFind
public class QuickFindUF {
    //int array as data structure to implement quick find
    private int[] id;

    //Quick Find Constructor to initialize and populate array.
    public QuickFindUF(int N){
        id = new int[N];
        for(int i=0; i<N ;i++){
            id[i] = i;
        }
    }
    //to check if two components are connected
    public boolean connected(int p, int q){
        return (id[p] == id[q]);
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        // To change all entries with id[p] to id[q] will lead to at most 2N+2 array accesses
        for(int i=0 ; i<id.length; i++){
            if(id[i] == pid) id[i] = qid;
        }
    }

    // Defect : Union too expensive. N-square array accesses
    // to process sequence of N sequence commands on N objects
}
