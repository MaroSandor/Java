package DijkstraAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[][] graph = new int[][] {
                { 0, 7, 9, 0, 0, 14 },
                { 7, 0, 10, 15, 0, 0 },
                { 9, 10, 0, 11, 0, 2 },
                { 0, 15, 11, 0, 6, 0 },
                { 0, 0, 0, 6, 0, 9 },
                { 14, 0, 2, 0, 9, 0 }
        };

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        dijkstra.dijkstra(graph, 0);
    }
}