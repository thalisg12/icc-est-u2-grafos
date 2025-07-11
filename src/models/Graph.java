package models;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    Set<Node> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public Node addNode(int value) {
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;

    }

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }

    public void addEdgeUni(Node src, Node dest) {
        src.addNeighbor(dest);

    }

    public void printGraph() {
        for (Node node : nodes) {
            System.out.print(node + " -> ");
            for (Node neighbor : node.getNeighbors()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public void getDFS(Node startNode) {

    }

    private void getDFSUtil(Node node, boolean[] visited) {

    }

    private void getBFS(Node startNode) {

    }

    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            Node src = nodes.get(i);
            for (Node dest : adjacencyList.get(src)) {
                int j = nodes.indexOf(dest);
                matrix[i][j] = 1;
            }
        }

        return matrix;
    }

    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix();
        System.out.println("Matriz de Adyacencia:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
