package dataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyGraph<T> {
    private final HashMap<T, ArrayList<T>> adjacentList;
    private int numberOfNodes;

    public MyGraph() {
        this.adjacentList = new HashMap<>();
    }

    // O(1)
    public void addVertex(T input) {
        this.adjacentList.put(input, new ArrayList<>());
        this.numberOfNodes++;
    }

    // O(1)
    public void addEdge(T element1, T element2) {
        if (element1 == null || element2 == null) {
            throw new IllegalArgumentException("Elemenets are not found");
        }

        if (!this.adjacentList.containsKey(element1) || !this.adjacentList.containsKey(element2)) {
            throw new IllegalArgumentException("Elemenets are not found");
        }
        this.adjacentList.get(element1).add(element2);
        this.adjacentList.get(element2).add(element1);
    }

    public void showConnections() {
        for (Map.Entry<T, ArrayList<T>> entry : this.adjacentList.entrySet()) {
            StringBuilder connections = new StringBuilder();
            for (T val : entry.getValue()) {
                connections.append(val).append(" ");
            }
            System.out.println(entry.getKey() + " --> " + connections);
        }
    }

    public static void testGraph() {
        MyGraph<Character> myGraph = new MyGraph<>();
        myGraph.addVertex('0');
        myGraph.addVertex('1');
        myGraph.addVertex('2');
        myGraph.addVertex('3');
        myGraph.addVertex('4');
        myGraph.addVertex('5');
        myGraph.addVertex('6');
        myGraph.addEdge('3', '1');
        myGraph.addEdge('3', '4');
        myGraph.addEdge('4', '2');
        myGraph.addEdge('4', '5');
        myGraph.addEdge('1', '2');
        myGraph.addEdge('1', '0');
        myGraph.addEdge('0', '2');
        myGraph.addEdge('6', '5');
        myGraph.showConnections();
    }
}
