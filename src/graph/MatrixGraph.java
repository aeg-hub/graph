package graph;

/**
 * Klasse MatrixGraph
 *
 * Implementierung des Interfaces Graph mithilfe einer Adjazenzmatrix.
 * Knoten werden in einem Vertex-Array verwaltet. Der Index eines Knotens
 * in diesem Array entspricht seinem Zeilen- und Spaltenindex in der Matrix.
 *
 * Die Matrix speichert Edge-Objekte. Ein Eintrag null bedeutet: keine Kante vorhanden.
 * Da der Graph ungerichtet ist, gilt stets: matrix[i][j] == matrix[j][i].
 *
 * Beide Arrays starten mit der Kapazitaet START_CAPACITY und werden
 * bei Bedarf automatisch verdoppelt.
 */
public class MatrixGraph implements Graph {

    private static final int START_CAPACITY = 10;

    private Vertex[] vertices;   // Knoten, Index = Position in der Matrix
    private Edge[][] matrix;     // matrix[i][j] = Kante zwischen vertices[i] und vertices[j], null = keine Kante
    private int vertexCount;     // Anzahl der aktuell enthaltenen Knoten

    /**
     * Erstellt einen leeren Graphen.
     * Hinweis: Initialisiere vertices als new Vertex[START_CAPACITY],
     * matrix als new Edge[START_CAPACITY][START_CAPACITY] (alle Eintraege
     * sind automatisch null) und setze vertexCount auf 0.
     */
    public MatrixGraph() {

    }

    // -------------------------------------------------------------------------
    // Interne Hilfsmethoden
    // -------------------------------------------------------------------------

    /**
     * Liefert den Index von pVertex in vertices, oder -1 wenn nicht enthalten.
     * Hinweis: Durchlaufe vertices[0..vertexCount-1] und vergleiche per ==.
     * Diese Methode wird intern von fast allen anderen Methoden benoetigt.
     */
    private int indexOf(Vertex pVertex) {
        return -1;
    }

    /**
     * Vergroessert vertices und matrix auf die doppelte Kapazitaet.
     * Hinweis:
     *   1. Lege ein neues Vertex-Array der doppelten Laenge an.
     *   2. Kopiere vertices per System.arraycopy hinein.
     *   3. Lege eine neue Edge-Matrix der doppelten Groesse an.
     *   4. Kopiere jede Zeile 0..vertexCount-1 per System.arraycopy in die neue Matrix.
     *      Die neuen Zeilen und Spalten bleiben null (keine Kante).
     *   5. Ersetze vertices und matrix durch die neuen Arrays.
     */
    private void grow() {

    }

    // -------------------------------------------------------------------------
    // Knoten
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Knoten des Graphen.
     * Hinweis: Lege eine neue List<Vertex> an und haenge vertices[0..vertexCount-1]
     * per append() ein. Setze den Zeiger mit toFirst() auf den Anfang.
     */
    public List<Vertex> getVertices() {
        return null;
    }

    /**
     * Liefert den Knoten mit der ID pID, oder null wenn nicht vorhanden.
     * Hinweis: Durchlaufe vertices[0..vertexCount-1] und vergleiche die ID per .equals().
     */
    public Vertex getVertex(String pID) {
        return null;
    }

    /**
     * Fuegt pVertex in den Graphen ein.
     * Hinweis:
     *   1. Pruefe: pVertex != null und pVertex.getID() != null.
     *   2. Pruefe per getVertex(), dass die ID noch nicht vergeben ist (Ergebnis == null).
     *   3. Falls vertices voll ist (vertexCount == vertices.length), rufe grow() auf.
     *   4. Speichere pVertex an vertices[vertexCount] und erhoehe vertexCount um 1.
     *      Die neue Zeile/Spalte in matrix ist bereits null – keine weitere Aktion noetig.
     */
    public void addVertex(Vertex pVertex) {

    }

    /**
     * Entfernt pVertex aus dem Graphen und loescht alle seine Kanten.
     * Hinweis:
     *   1. Bestimme den Index i von pVertex per indexOf(). Ist er -1, nichts tun.
     *   2. Loesche die Kanten: Setze matrix[i][j] und matrix[j][i] fuer alle j auf null.
     *   3. Um die Luecke in vertices zu schliessen: Kopiere vertices[vertexCount-1]
     *      an Stelle i, setze vertices[vertexCount-1] = null, verringere vertexCount.
     *   4. Verschiebe auch die Matrix: Kopiere Zeile und Spalte (vertexCount)
     *      an die Stelle i (tausche also den letzten Knoten an die Luecke).
     *      Setze danach die letzte Zeile und Spalte komplett auf null.
     */
    public void removeVertex(Vertex pVertex) {

    }

    // -------------------------------------------------------------------------
    // Kanten
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Kanten des Graphen.
     * Hinweis: Durchlaufe die obere Dreiecksmatrix (i von 0 bis vertexCount-1,
     * j von i+1 bis vertexCount-1). Ist matrix[i][j] != null, haenge dieses
     * Edge-Objekt an die Ergebnisliste. So wird jede Kante genau einmal erfasst,
     * da matrix[i][j] == matrix[j][i] (Symmetrie des ungerichteten Graphen).
     */
    public List<Edge> getEdges() {
        return null;
    }

    /**
     * Liefert alle inzidenten Kanten von pVertex als neue Liste.
     * Hinweis: Bestimme den Index i von pVertex per indexOf(). Ist er -1,
     * liefere eine leere Liste. Durchlaufe sonst alle j von 0 bis vertexCount-1:
     * Ist matrix[i][j] != null, haenge das Edge-Objekt an die Ergebnisliste.
     */
    public List<Edge> getEdges(Vertex pVertex) {
        return null;
    }

    /**
     * Liefert die Kante zwischen pVertex und pAnotherVertex, oder null.
     * Hinweis: Bestimme die Indizes i und j per indexOf(). Ist einer -1,
     * liefere null. Sonst liefere matrix[i][j] direkt (ist null, wenn keine Kante).
     */
    public Edge getEdge(Vertex pVertex, Vertex pAnotherVertex) {
        return null;
    }

    /**
     * Fuegt pEdge in den Graphen ein.
     * Hinweis: Pruefe dieselben Bedingungen wie im ListGraph (nicht null,
     * beide Knoten im Graphen enthalten und nicht identisch, noch keine Kante vorhanden).
     * Bestimme die Indizes i und j der Endknoten. Setze dann
     * matrix[i][j] = matrix[j][i] = pEdge.
     * (Beide Richtungen setzen, da der Graph ungerichtet ist.)
     */
    public void addEdge(Edge pEdge) {

    }

    /**
     * Entfernt pEdge aus dem Graphen.
     * Hinweis: Bestimme die Endknoten per pEdge.getVertices() und deren
     * Indizes i und j per indexOf(). Setze matrix[i][j] = matrix[j][i] = null.
     */
    public void removeEdge(Edge pEdge) {

    }

    // -------------------------------------------------------------------------
    // Markierungen
    // -------------------------------------------------------------------------

    /**
     * Setzt die Markierung aller Knoten auf pMark.
     * Hinweis: Durchlaufe vertices[0..vertexCount-1] und rufe setMark(pMark) auf.
     */
    public void setAllVertexMarks(boolean pMark) {

    }

    /**
     * Setzt die Markierung aller Kanten auf pMark.
     * Hinweis: Durchlaufe die obere Dreiecksmatrix (wie in getEdges()).
     * Ist matrix[i][j] != null, rufe matrix[i][j].setMark(pMark) auf.
     * Da matrix[i][j] und matrix[j][i] dasselbe Objekt sind, genuegt eine Richtung.
     */
    public void setAllEdgeMarks(boolean pMark) {

    }

    /**
     * Liefert true, wenn alle Knoten markiert sind, sonst false.
     * Hinweis: Starte mit result = true. Ist ein Knoten in vertices[0..vertexCount-1]
     * nicht markiert, setze result = false.
     */
    public boolean allVerticesMarked() {
        return false;
    }

    /**
     * Liefert true, wenn alle Kanten markiert sind, sonst false.
     * Hinweis: Durchlaufe die obere Dreiecksmatrix. Ist ein Eintrag != null
     * und nicht markiert, setze result = false.
     */
    public boolean allEdgesMarked() {
        return false;
    }

    // -------------------------------------------------------------------------
    // Nachbarn & Hilfsmethoden
    // -------------------------------------------------------------------------

    /**
     * Liefert alle Nachbarknoten von pVertex als neue Liste.
     * Hinweis: Bestimme den Index i von pVertex. Durchlaufe alle j von
     * 0 bis vertexCount-1. Ist matrix[i][j] != null, haenge vertices[j]
     * an die Ergebnisliste.
     */
    public List<Vertex> getNeighbours(Vertex pVertex) {
        return null;
    }

    /**
     * Liefert true, wenn der Graph keine Knoten enthaelt.
     * Hinweis: Pruefe ob vertexCount == 0.
     */
    public boolean isEmpty() {
        return false;
    }
}
