package src.concept;

public class Wrapperclass {
    Boolean[][] visited = new Boolean[4][4];
    public void c1(){
    for(int i = 0;i < 4; i++){
        for (int j = 0; j < 4; j++) {
            System.out.println(visited[i][j]);
        }
    }
    }

    public static void main(String[] args) {
        Wrapperclass p = new Wrapperclass();
        p.c1();
    }
}
