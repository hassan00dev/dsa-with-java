package DataStructures;

import java.util.*;

public class Graph {
    public class Node{
        public int data;
    }

    public class Edge{
        public Node start;
        public Node end;
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
