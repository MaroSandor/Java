package DijkstraAlgorithm;

import java.util.*;

public class DijkstraAlgorithm {
    static final int NO_PARENT = -1;

    public void dijkstra(int[][] graph, int startVertex) {
        int nVertices = graph[0].length;

        int[] shortestDistances = new int[nVertices];
        boolean[] added = new boolean[nVertices];

        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        shortestDistances[startVertex] = 0;

        int[] parents = new int[nVertices];
        parents[startVertex] = NO_PARENT;

        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            added[nearestVertex] = true;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = graph[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    private void printSolution(int startVertex, int[] distances, int[] parents) {
        int nVertices = distances.length;
        System.out.println("Vertex	 Distance	Path");

        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print(startVertex + " -> " + vertexIndex + "		" + distances[vertexIndex] + "		");
                printPath(vertexIndex, parents);
                System.out.println();
            }
        }
    }

    private void printPath(int currentVertex, int[] parents) {
        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }
}