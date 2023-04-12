package DataStructures;

import java.util.*;

public class Graph {

    void bfs(Map<Integer, HashSet<Integer>> graph, int v)
    {
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        LinkedList<Integer> queue = new LinkedList<Integer>();

        Map.Entry<Integer, HashSet<Integer>> entry = graph.entrySet().iterator().next();
        int key = entry.getKey();
        Set<Integer> value = entry.getValue();

        visited.put(key,true);
        queue.add(key);

        while (!queue.isEmpty()) {
            Integer vertex = queue.poll();
            System.out.print(vertex + " ");

            for (Integer neighbor : graph.get(vertex)) {
                if (!visited.get(neighbor)) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();

        HashSet<Integer> adjList = new HashSet<Integer>();
        adjList.add(2);
        adjList.add(3);
        adjList.add(5);
        adjList.add(5);
        adjList.add(8);
        graph.putIfAbsent(2, adjList);

        for (Map.Entry<Integer, HashSet<Integer>> set:
             graph.entrySet()) {
            System.out.print(set.getKey() + " => ");
            for (int v :
                    set.getValue()) {
                System.out.print(v + " ");
            }
        }
    }
}
