import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraph{
    private LinkedList<Integer>[] adjLL;
    private int V;
    private int E;

    @SuppressWarnings("unchecked")
    public UndirectedGraph(int nodes){
        this.adjLL = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++){
            this.adjLL[i] = new LinkedList<>();
        }
        this.V = nodes;
        this.E = 0;
    }
    public void addEdge(int u, int v){
        this.adjLL[u].add(v);
        this.adjLL[v].add(u);
        this.E++;
    }
    public void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V]; //visited = [F,F,F,F,F]
        q.offer(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");
            for (int v : adjLL[current]){
                if (!visited[v]){
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        UndirectedGraph g = new UndirectedGraph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        g.bfs(1);
    }
}