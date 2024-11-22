package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private int vertices; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    public BreadthFirstSearch(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Prints BFS traversal from a given source s
    void bfs(int s) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
