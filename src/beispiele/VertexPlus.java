package beispiele;

import graph.Vertex;

public class VertexPlus extends Vertex{

	Vertex vorgaenger;
	double distanceToPrevious;
	
    public Vertex getVorgaenger() {
		return vorgaenger;
	}

	public void setVorgaenger(Vertex vorgaenger) {
		this.vorgaenger = vorgaenger;
	}

	public double getDistanceToPrevious() {
		return distanceToPrevious;
	}

	public void setDistanceToPrevious(double distanceToPrevious) {
		this.distanceToPrevious = distanceToPrevious;
	}

	public VertexPlus(String pID, VertexPlus pVertex) {
    	super(pID);
    	this.vorgaenger = pVertex;
    }

    
    
}
