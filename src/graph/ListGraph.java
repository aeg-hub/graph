package graph;
/**
 * Klasse ListGraph
 *
 * Implementierung des Interfaces Graph mithilfe von Adjazenzlisten.
 * Knoten und Kanten werden jeweils in einer verketteten Liste gespeichert.
 */
public class ListGraph implements Graph {

    private List<Vertex> vertices;
    private List<Edge> edges;

    /**
     * Erstellt einen leeren Graphen.
     * Hinweis: Initialisiere beide Listen als neue, leere List-Objekte.
     */
    public ListGraph() {

    }

    // -------------------------------------------------------------------------
    // Knoten
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Knoten des Graphen (flache Kopie).
     * Hinweis: Lege eine neue List<Vertex> an, durchlaufe vertices mit
     * toFirst()/hasAccess()/next() und haenge jeden Knoten per append() an.
     * Setze den Zeiger der Ergebnisliste am Ende mit toFirst() auf den Anfang.
     */
    public List<Vertex> getVertices() {
        return null;
    }

    /**
     * Liefert den Knoten mit der ID pID, oder null wenn nicht vorhanden.
     * Hinweis: Durchlaufe vertices und vergleiche jede ID per .equals().
     * Sobald eine Uebereinstimmung gefunden wurde, kann die Schleife abgebrochen werden.
     */
    public Vertex getVertex(String pID) {
        return null;
    }

    /**
     * Fuegt pVertex in den Graphen ein, sofern er nicht null ist, eine ID hat
     * und diese ID noch nicht vergeben ist.
     * Hinweis: Pruefe zunaechst, ob pVertex != null und pVertex.getID() != null.
     * Durchlaufe dann vertices und setze ein boolean-Flag auf false, sobald
     * eine gleiche ID gefunden wird. Fuege pVertex nur ein, wenn das Flag noch true ist.
     */
    public void addVertex(Vertex pVertex) {

    }

    /**
     * Entfernt pVertex aus dem Graphen und loescht alle inzidenten Kanten.
     * Hinweis: Durchlaufe edges in einer while-Schleife. Gehoert die aktuelle
     * Kante zu pVertex (pruefe beide Endpunkte per getVertices()), rufe
     * edges.remove() auf (next() NICHT aufrufen, da remove() den Zeiger bereits
     * weiter setzt). Sonst edges.next(). Suche danach pVertex in vertices
     * und entferne ihn ebenfalls mit remove().
     */
    public void removeVertex(Vertex pVertex) {

    }

    // -------------------------------------------------------------------------
    // Kanten
    // -------------------------------------------------------------------------

    /**
     * Liefert eine neue Liste aller Kanten des Graphen (flache Kopie).
     * Hinweis: Analog zu getVertices(), aber fuer edges und Edge-Objekte.
     */
    public List<Edge> getEdges() {
        return null;
    }

    /**
     * Liefert alle inzidenten Kanten von pVertex als neue Liste.
     * Hinweis: Durchlaufe edges und pruefe fuer jede Kante per getVertices(),
     * ob pVertex einer der beiden Endpunkte ist (Vergleich per ==).
     * Falls ja, haenge die Kante an die Ergebnisliste.
     */
    public List<Edge> getEdges(Vertex pVertex) {
        return null;
    }

    /**
     * Liefert die Kante zwischen pVertex und pAnotherVertex, oder null.
     * Hinweis: Durchlaufe edges und pruefe fuer jede Kante, ob die beiden
     * Endpunkte (in beliebiger Reihenfolge) genau pVertex und pAnotherVertex sind.
     * Da der Graph ungerichtet ist, muessen beide Richtungen geprueft werden.
     */
    public Edge getEdge(Vertex pVertex, Vertex pAnotherVertex) {
        return null;
    }

    /**
     * Fuegt pEdge in den Graphen ein.
     * Hinweis: Pruefe folgende Bedingungen (alle muessen erfuellt sein):
     *   1. pEdge != null
     *   2. Beide Endknoten sind nicht null
     *   3. Beide Endknoten sind mit getVertex() im Graphen auffindbar (Referenzvergleich ==)
     *   4. Es existiert noch keine Kante zwischen den beiden Knoten (getEdge() == null)
     *   5. Die beiden Endknoten sind nicht identisch (!=)
     * Nur wenn alle Bedingungen erfuellt sind, edge per append() einfuegen.
     */
    public void addEdge(Edge pEdge) {

    }

    /**
     * Entfernt pEdge aus dem Graphen.
     * Hinweis: Durchlaufe edges und vergleiche jede Kante per == mit pEdge.
     * Bei Uebereinstimmung remove() aufrufen (kein next() danach!), sonst next().
     */
    public void removeEdge(Edge pEdge) {

    }

    // -------------------------------------------------------------------------
    // Markierungen
    // -------------------------------------------------------------------------

    /**
     * Setzt die Markierung aller Knoten auf pMark.
     * Hinweis: Durchlaufe vertices und rufe auf jedem Knoten setMark(pMark) auf.
     */
    public void setAllVertexMarks(boolean pMark) {

    }

    /**
     * Setzt die Markierung aller Kanten auf pMark.
     * Hinweis: Analog zu setAllVertexMarks(), aber fuer edges.
     */
    public void setAllEdgeMarks(boolean pMark) {

    }

    /**
     * Liefert true, wenn alle Knoten mit true markiert sind, sonst false.
     * Hinweis: Starte mit result = true. Sobald ein Knoten gefunden wird,
     * bei dem isMarked() false liefert, setze result = false.
     * Durchlaufe dennoch die gesamte Liste (kein vorzeitiger Abbruch noetig).
     */
    public boolean allVerticesMarked() {
        return false;
    }

    /**
     * Liefert true, wenn alle Kanten mit true markiert sind, sonst false.
     * Hinweis: Analog zu allVerticesMarked(), aber fuer edges.
     */
    public boolean allEdgesMarked() {
        return false;
    }

    // -------------------------------------------------------------------------
    // Nachbarn & Hilfsmethoden
    // -------------------------------------------------------------------------

    /**
     * Liefert alle Nachbarknoten von pVertex als neue Liste.
     * Hinweis: Durchlaufe edges. Ist vertexPair[0] == pVertex, haenge vertexPair[1]
     * an die Ergebnisliste – und umgekehrt. So wird der jeweils andere Endpunkt
     * als Nachbar erkannt.
     */
    public List<Vertex> getNeighbours(Vertex pVertex) {
        return null;
    }

    /**
     * Liefert true, wenn der Graph keine Knoten enthaelt.
     * Hinweis: Delegiere direkt an vertices.isEmpty().
     */
    public boolean isEmpty() {
        return false;
    }
}
