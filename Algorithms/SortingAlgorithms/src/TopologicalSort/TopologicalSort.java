package TopologicalSort;

import java.util.*;

public class TopologicalSort {
    private int vertices; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency list

    // Constructor
    TopologicalSort(int v) {
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

    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        // Mark the current node as visited
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this vertex
        for (Integer node : adj[v]) {
            if (!visited[node]) {
                topologicalSortUtil(node, visited, stack);
            }
        }

        // Push current vertex to stack which stores the result
        stack.push(v);
    }

    // The function to do Topological Sort. It uses recursive topologicalSortUtil()
    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();

        // Mark all the vertices as not visited
        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            visited[i] = false;
        }

        // Call the recursive helper function to store Topological Sort
        // starting from all vertices one by one
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        // Print contents of stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}