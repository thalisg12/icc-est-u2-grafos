package models;

import java.util.HashSet;
import java.util.Set;

public class Node {
    int value;
    Set<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    public Set<Node> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
