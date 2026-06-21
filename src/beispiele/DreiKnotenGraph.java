package beispiele;

import graph.Edge;
import graph.List;
import graph.ListGraph;
import graph.Vertex;

/**
 * Erstellt einen vollstaendigen Graphen K3 mit drei Knoten und drei Kanten.
 * <p>
 *   A ---5--- B
 *    \       /
 *     3     7
 *      \   /
 *        C
 */
public class DreiKnotenGraph {

    public static void main(String[] args) {

        // Graph erstellen
        ListGraph g = new ListGraph();

        // Knoten anlegen und einfuegen
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");

        g.addVertex(a);
        g.addVertex(b);
        g.addVertex(c);

        // Kanten anlegen und einfuegen
        Edge ab = new Edge(a, b, 5);
        Edge ac = new Edge(a, c, 3);
        Edge bc = new Edge(b, c, 7);

        g.addEdge(ab);
        g.addEdge(ac);
        g.addEdge(bc);

        // Ausgabe zur Kontrolle
        System.out.println("Knoten im Graphen:");
        List<Vertex> vertices = g.getVertices();
        vertices.toFirst();
        while (vertices.hasAccess()) {
            System.out.println("  " + vertices.getContent().getID());
            vertices.next();
        }

        System.out.println("\nKanten im Graphen:");
        List<Edge> edges = g.getEdges();
        edges.toFirst();
        while (edges.hasAccess()) {
            Edge e = edges.getContent();
            Vertex[] ends = e.getVertices();
            System.out.println("  " + ends[0].getID() + " --" + e.getWeight() + "-- " + ends[1].getID());
            edges.next();
        }
    }
}
