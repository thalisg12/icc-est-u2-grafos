import models.Graph;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Thalia Sagbay");

        Graph graf = new Graph();
        Node n0 = graf.addNode(0);
        Node n1 = graf.addNode(1);
        Node n2 = graf.addNode(2);
        Node n3 = graf.addNode(3);
        Node n4 = graf.addNode(4);
        Node n5 = graf.addNode(5);
        Node n7 = graf.addNode(7);
        Node n8 = graf.addNode(8);
        Node n9 = graf.addNode(9);

        graf.addEdge(n0, n1);
        graf.addEdge(n0, n3);
        graf.addEdge(n0, n5);

        graf.addEdge(n1, n2);
        graf.addEdge(n1, n4);
        graf.addEdge(n1, n8);

        graf.addEdge(n3, n2);
        graf.addEdge(n3, n4);
        graf.addEdge(n3, n7);
        graf.addEdge(n3, n9);
        graf.printGraph();

    }
}
