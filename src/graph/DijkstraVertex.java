package graph;

public class DijkstraVertex extends Vertex {
	// test push
	private DijkstraVertex vorgaenger;
	private double distanz;

	super(double d,DijkstraVertex v){
		this.distanz = d;
		this.vorgaenger = v;
	}
	public DijkstraVertex getVorgaenger() {
		return this.vorgaenger;
	}

	public void setVorgaenger(DijkstraVertex dVertex) {
		this.vorgaenger = dVertex;
	}

	public double getDistanz() {
		return this.distanz;
	}

	public void setDistanz(double d) {
		this.distanz = d;
	}
	
	public void update(double dist,DijkstraVertex vorg) {
		if(dist < this.distanz) {
			this.distanz = dist;
			this.vorgaenger = vorg;
		}
	}
}
