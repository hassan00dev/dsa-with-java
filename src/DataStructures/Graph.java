package DataStructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    public class Node {
        private String label;

        public Node(String label) {
            super();
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }//Node

    public class Edge{
        private Node from;
        private Node to;

        public Edge(Graph.Node from, Graph.Node to) {
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
    HashMap<String, Node> nodes = new HashMap<String, Node>();
    HashMap<Node, ArrayList<Node>> adjList = new HashMap<Node, ArrayList<Node>>();

    public void addNode(String name) {
        Node n = new Node(name);
        nodes.putIfAbsent(name, n);
        adjList.putIfAbsent(n, new ArrayList<Node>());
//		count++;
    }

    public void addEdge(String from, String to) {
        Node nFrom = nodes.get(from);
        if(nFrom == null) {
            System.out.println("Node not present in list");
            return;
        }
        Node tFrom = nodes.get(to);
        if(tFrom == null) {
            System.out.println("Node not present in list");
            return;
        }

        adjList.get(nFrom).add(tFrom);
    }

    public void print() {
        for(Node cur : adjList.keySet()) {
            ArrayList<Node> res = adjList.get(cur);
            if(!res.isEmpty()) {
                System.out.println(cur+" is connected with "+res);
            }
        }
    }
    public void BFS(String label) {
        Node cur = nodes.get(label);
        if(cur == null) return;

        HashSet<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();

        queue.add(cur);

        while(!queue.isEmpty()) {
            var current = queue.remove();

            if(visited.contains(current)) continue;

            System.out.println(current);
            visited.add(current);
            for(Node neighbours : adjList.get(current)) {
                if(!visited.contains(neighbours)) {
                    queue.add(neighbours);
                }
            }//for

        }//while
    }//BFS

    public void DFS(String label) {
        Node cur = nodes.get(label);
        if(cur == null) return;

        HashSet<Node> visited = new HashSet<>();
        Stack<Node> st = new Stack<>();

        st.add(cur);

        while(!st.isEmpty()) {
            var current = st.pop();

            if(visited.contains(current)) continue;

            System.out.println(current);
            visited.add(current);
            for(Node neighbours : adjList.get(current)) {
                if(!visited.contains(neighbours)) {
                    st.push(neighbours);
                }
            }//for

        }//while
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Graph g = new Graph();
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");

        g.addEdge("A", "B");
        g.addEdge("C", "A");
        g.addEdge("E", "D");
        g.addEdge("B", "E");
        g.addEdge("A", "E");
        g.addEdge("D", "B");

        g.BFS("A");
        System.out.println();
        g.DFS("A");
//		g.print();
    }

}