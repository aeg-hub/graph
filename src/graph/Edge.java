package graph;

/**
 * Klasse Edge
 *
 * Stellt eine einzelne, ungerichtete Kante eines Graphen dar. Eine Kante
 * verbindet genau zwei Knoten und hat eine Gewichtung sowie eine Markierung.
 */
public class Edge {

	private Vertex[] vertices;
	private double weight;
	private boolean mark;

	/**
	 * Erstellt eine neue Kante zwischen pVertex und pAnotherVertex mit der
	 * Gewichtung pWeight. Hinweis: Lege ein neues Vertex-Array der Laenge 2 an.
	 * Speichere pVertex an Index 0 und pAnotherVertex an Index 1. Setze weight auf
	 * pWeight und mark auf false.
	 */
	public Edge(Vertex pVertex, Vertex pAnotherVertex, double pWeight) {
		this.vertices = new Vertex[2];
		this.vertices[0] = pVertex;
		this.vertices[1] = pAnotherVertex;
		this.weight = pWeight;
		this.mark = false;
	}

	/**
	 * Liefert die beiden Endknoten der Kante als neues Array der Laenge 2. Hinweis:
	 * Lege ein neues Vertex-Array an und kopiere vertices[0] und vertices[1]
	 * hinein. So wird das interne Array nicht nach aussen weitergegeben (Schutz vor
	 * ungewollten Veraenderungen von aussen).
	 */
	public Vertex[] getVertices() {
		Vertex[] cp = new Vertex[2];
		cp[0] = vertices[0];
		cp[1] = vertices[1];
		return cp;
	}

	/**
	 * Setzt die Gewichtung der Kante auf pWeight. Hinweis: Weise pWeight direkt dem
	 * Attribut weight zu.
	 */
	public void setWeight(double pWeight) {
		this.weight = pWeight;
	}

	/**
	 * Liefert die Gewichtung der Kante als double. Hinweis: Gib das Attribut weight
	 * zurueck.
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Setzt die Markierung der Kante auf pMark. Hinweis: Weise pMark direkt dem
	 * Attribut mark zu.
	 */
	public void setMark(boolean pMark) {
		this.mark = pMark;
	}

	/**
	 * Liefert true, wenn die Kante markiert ist, sonst false. Hinweis: Gib das
	 * Attribut mark zurueck.
	 */
	public boolean isMarked() {
		return mark;
	}
}
