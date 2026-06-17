package graph;

/**
 * Klasse Vertex
 *
 * Stellt einen einzelnen Knoten eines Graphen dar. Jeder Knoten hat eine
 * eindeutige ID und eine Markierung.
 */
public class Vertex {

	private String id;
	private boolean mark;

	/**
	 * Erstellt einen neuen Knoten mit der ID pID. Hinweis: Speichere pID im
	 * Attribut id. Setze mark auf false.
	 */
	public Vertex(String pID) {
		this.id = pID;
		this.mark = false;
	}

	/**
	 * Liefert die ID des Knotens als String. Hinweis: Gib eine neue Kopie des
	 * Strings zurueck (new String(id)), damit das interne Attribut nicht von aussen
	 * veraendert werden kann.
	 */
	public String getID() {
		return new String(id);
	}

	/**
	 * Setzt die Markierung des Knotens auf pMark. Hinweis: Weise pMark direkt dem
	 * Attribut mark zu.
	 */
	public void setMark(boolean pMark) {
		this.mark = pMark;
	}

	/**
	 * Liefert true, wenn der Knoten markiert ist, sonst false. Hinweis: Gib das
	 * Attribut mark zurueck.
	 */
	public boolean isMarked() {
		return mark;
	}
}
