package DataStructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    public class Vertex {
        private String label;

        public Vertex(String label) {
            super();
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }//Vertex

    public class Edge{
        private Vertex from;
        private Vertex to;

        public Edge(Graph.Vertex from, Graph.Vertex to) {
            super();
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return from + ", to=" + to;
        }

    }

    int count;
    HashMap<String, Vertex> Vertexes = new HashMap<String, Vertex>();
    HashMap<Vertex, ArrayList<Vertex>> adjList = new HashMap<Vertex, ArrayList<Vertex>>();

    public void addVertex(String name) {
        Vertex n = new Vertex(name);
        Vertexes.putIfAbsent(name, n);
        adjList.putIfAbsent(n, new ArrayList<Vertex>());
		count++;
    }

    public void addEdge(String from, String to) {
        Vertex nFrom = Vertexes.get(from);
        if(nFrom == null) {
            System.out.println("Vertex not present in list");
            return;
        }
        Vertex tFrom = Vertexes.get(to);
        if(tFrom == null) {
            System.out.println("Vertex not present in list");
            return;
        }

        adjList.get(nFrom).add(tFrom);
    }

    public void print() {
        for(Vertex cur : adjList.keySet()) {
            ArrayList<Vertex> res = adjList.get(cur);
            if(!res.isEmpty()) {
                System.out.println(cur+" is connected with "+res);
            }
        }
    }
    public void BFS(String label) {
        Vertex cur = Vertexes.get(label);
        if(cur == null) return;

        HashSet<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new ArrayDeque<>();

        queue.add(cur);

        while(!queue.isEmpty()) {
            var current = queue.remove();

            if(visited.contains(current)) continue;

            System.out.println(current);
            visited.add(current);
            for(Vertex neighbour : adjList.get(current)) {
                if(!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }//for

        }//while
    }//BFS

    public void DFS(String label) {
        Vertex cur = Vertexes.get(label);
        if(cur == null) return;

        HashSet<Vertex> visited = new HashSet<>();
        Stack<Vertex> st = new Stack<>();

        st.add(cur);

        while(!st.isEmpty()) {
            var current = st.pop();

            if(visited.contains(current)) continue;

            System.out.println(current);
            visited.add(current);
            for(Vertex neighbours : adjList.get(current)) {
                if(!visited.contains(neighbours)) {
                    st.push(neighbours);
                }
            }//for

        }//while
    }


    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");

        g.addEdge("A", "B");
        g.addEdge("C", "A");
        g.addEdge("E", "D");
        g.addEdge("B", "E");
        g.addEdge("A", "E");
        g.addEdge("D", "B");

        g.BFS("A");
        System.out.println();
        g.DFS("A");

        g.print();
    }

}