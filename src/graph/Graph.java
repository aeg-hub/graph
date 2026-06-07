package graph;
/**
 * Interface Graph
 *
 * Beschreibt einen ungerichteten, kantengewichteten Graphen.
 * Moegliche Implementierungen: ListGraph (Adjazenzliste), MatrixGraph (Adjazenzmatrix)
 */
public interface Graph {

    // -------------------------------------------------------------------------
    // Knoten
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Knoten des Graphen.
     * Die Originalliste wird nicht veraendert (flache Kopie).
     */
    List<Vertex> getVertices();

    /**
     * Liefert den Knoten mit der angegebenen ID, oder null,
     * wenn kein solcher Knoten im Graphen enthalten ist.
     */
    Vertex getVertex(String pID);

    /**
     * Fuegt den Knoten pVertex in den Graphen ein,
     * sofern er nicht null ist, eine ID hat und diese ID noch nicht vergeben ist.
     * Ansonsten passiert nichts.
     */
    void addVertex(Vertex pVertex);

    /**
     * Entfernt den Knoten pVertex aus dem Graphen
     * und loescht alle Kanten, die mit ihm verbunden sind.
     * Ist der Knoten nicht enthalten, passiert nichts.
     */
    void removeVertex(Vertex pVertex);

    // -------------------------------------------------------------------------
    // Kanten
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Kanten des Graphen.
     * Die Originalliste wird nicht veraendert (flache Kopie).
     */
    List<Edge> getEdges();

    /**
     * Liefert eine neue Liste aller Kanten, die mit dem Knoten pVertex
     * verbunden sind (inzidente Kanten).
     * Ist der Knoten nicht enthalten oder hat keine Kanten, wird eine leere Liste geliefert.
     */
    List<Edge> getEdges(Vertex pVertex);

    /**
     * Liefert die Kante zwischen pVertex und pAnotherVertex,
     * oder null, wenn keine solche Kante existiert.
     */
    Edge getEdge(Vertex pVertex, Vertex pAnotherVertex);

    /**
     * Fuegt die Kante pEdge in den Graphen ein, sofern beide Endknoten
     * im Graphen enthalten und verschieden sind und noch keine Kante zwischen
     * ihnen existiert. Ansonsten passiert nichts.
     */
    void addEdge(Edge pEdge);

    /**
     * Entfernt die Kante pEdge aus dem Graphen.
     * Ist die Kante nicht enthalten, passiert nichts.
     */
    void removeEdge(Edge pEdge);

    // -------------------------------------------------------------------------
    // Markierungen
    // -------------------------------------------------------------------------

    /**
     * Setzt die Markierung aller Knoten des Graphen auf pMark.
     * Wird typischerweise vor einer Graphdurchmusterung (z.B. BFS/DFS) verwendet.
     */
    void setAllVertexMarks(boolean pMark);

    /**
     * Setzt die Markierung aller Kanten des Graphen auf pMark.
     */
    void setAllEdgeMarks(boolean pMark);

    /**
     * Liefert true, wenn alle Knoten des Graphen mit true markiert sind,
     * sonst false.
     */
    boolean allVerticesMarked();

    /**
     * Liefert true, wenn alle Kanten des Graphen mit true markiert sind,
     * sonst false.
     */
    boolean allEdgesMarked();

    // -------------------------------------------------------------------------
    // Nachbarn & Hilfsmethoden
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Nachbarknoten von pVertex.
     * Ist pVertex nicht im Graphen enthalten oder hat keine Nachbarn,
     * wird eine leere Liste zurueckgeliefert.
     */
    List<Vertex> getNeighbours(Vertex pVertex);

    /**
     * Liefert true, wenn der Graph keine Knoten enthaelt, sonst false.
     */
    boolean isEmpty();
}
