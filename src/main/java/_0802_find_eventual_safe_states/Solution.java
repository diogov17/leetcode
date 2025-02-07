package _0802_find_eventual_safe_states;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        /*
         * 0 - not visited node
         * 1 - visited node
         * 2 - safe node
         */
        int[] state = new int[n];
        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (depthFirstSearch(graph, i, state)) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    private boolean depthFirstSearch(int[][] graph, int node, int[] state) {
        // If the node was visited before it must be safe
        if (state[node] > 0) return state[node] == 2;

        // Mark current node as visited
        state[node] = 1;

        for (int next : graph[node]) {
            // Check if the neighbor leads to a cycle
            if (state[next] == 1 || !depthFirstSearch(graph, next, state)) {
                return false;
            }
        }

        // Mark current node as safe
        state[node] = 2;

        return true;
    }

}