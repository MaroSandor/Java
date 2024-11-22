package FloydWarshallAlgorithm;

public class Main {
    public static void main(String[] args) {
        int graph[][] = {
                {0, 3, FloydWarshallAlgorithm.INF, 7},
                {8, 0, 2, FloydWarshallAlgorithm.INF},
                {5, FloydWarshallAlgorithm.INF, 0, 1},
                {2, FloydWarshallAlgorithm.INF, FloydWarshallAlgorithm.INF, 0}
        };

        // Floyd-Warshall example
        FloydWarshallAlgorithm fwa = new FloydWarshallAlgorithm();
        fwa.floydWarshall(graph);
    }
}