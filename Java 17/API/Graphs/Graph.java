public class Graph{
    private int[][] adjMatrix;

    public Graph(int nodes){
        adjMatrix = new int[nodes][nodes];
    }
    public void addEdge(int u, int v){
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
    }
}