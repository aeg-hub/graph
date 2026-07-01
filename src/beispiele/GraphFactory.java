package beispiele;

import graph.*;

/**
 * Beispielklasse GraphFactory
 *
 * Demonstriert, wie ein ListGraph aus einer Adjazenzmatrix erzeugt werden kann.
 * Der Graph wird durch zwei Konstanten beschrieben:
 *   - VERTEX_NAMES:      Namen der Knoten
 *   - ADJACENCY_WEIGHTS: Gewichte der Kanten als symmetrische Matrix
 *                        (0.0 = keine Kante)
 *
 * Beispielgraph (vollstaendiger Graph K4):
 *
 *      A --2-- B
 *      |  \  / |
 *      5   4   7
 *      |  / \  |
 *      C --3-- D
 */
public class GraphFactory {

    private static final String[] VERTEX_NAMES = {
        "A", "B", "C", "D"
    };

    private static final double[][] ADJACENCY_WEIGHTS = {
        // A     B     C     D
        {  0.0,  2.0,  5.0,  4.0 },  // A
        {  2.0,  0.0,  4.0,  7.0 },  // B
        {  5.0,  4.0,  0.0,  3.0 },  // C
        {  4.0,  7.0,  3.0,  0.0 },  // D
    };

    /**
     * Erzeugt einen ListGraph aus den uebergebenen Knotennamen und einer Adjazenzmatrix.
     * Eintraege mit dem Gewicht 0.0 werden als "keine Kante" interpretiert.
     * Da der Graph ungerichtet ist, wird jede Kante nur einmal eingefuegt
     * (obere Dreiecksmatrix).
     *
     * @param pNames   Array der Knotennamen
     * @param pWeights Symmetrische Adjazenzmatrix mit Kantengewichten (0.0 = keine Kante)
     * @return         Der fertig aufgebaute ListGraph
     */
    public static ListGraph generateListGraph(String[] pNames, double[][] pWeights) {
        ListGraph graph = new ListGraph();

        // Knoten anlegen und einfuegen
        Vertex[] vertices = new Vertex[pNames.length];
        for (int i = 0; i < pNames.length; i++) {
            vertices[i] = new Vertex(pNames[i]);
            graph.addVertex(vertices[i]);
        }

        // Kanten anlegen – nur obere Dreiecksmatrix durchlaufen,
        // da der Graph ungerichtet ist (jede Kante nur einmal einfuegen)
        for (int i = 0; i < pWeights.length; i++) {
            for (int j = i + 1; j < pWeights[i].length; j++) {
                if (pWeights[i][j] != 0.0) {
                    graph.addEdge(new Edge(vertices[i], vertices[j], pWeights[i][j]));
                }
            }
        }

        return graph;
    }

    public static void main(String[] args) {
        ListGraph graph = generateListGraph(VERTEX_NAMES, ADJACENCY_WEIGHTS);

        // Knoten ausgeben
        System.out.println("Knoten im Graphen:");
        List<Vertex> vertices = graph.getVertices();
        vertices.toFirst();
        while (vertices.hasAccess()) {
            System.out.println("  " + vertices.getContent().getID());
            vertices.next();
        }

        // Kanten ausgeben
        System.out.println("\nKanten im Graphen:");
        List<Edge> edges = graph.getEdges();
        edges.toFirst();
        while (edges.hasAccess()) {
            Edge e = edges.getContent();
            Vertex[] ends = e.getVertices();
            System.out.println("  " + ends[0].getID() + " --" + e.getWeight() + "-- " + ends[1].getID());
            edges.next();
        }
    }
}
