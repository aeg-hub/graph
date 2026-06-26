package beispiele;

import graph.Edge;
import graph.List;
import graph.ListGraph;
import graph.Vertex;

public class FreundschaftsGraph {

	public static void main(String[] args) {
		
		ListGraph g = new ListGraph();

        // Knoten anlegen und einfuegen
        Vertex Susi = new Vertex("Susi");
        Vertex Karl = new Vertex("Karl");
        Vertex Lisa = new Vertex("Lisa");
        Vertex Jens = new Vertex("Jens");
        Vertex Merle = new Vertex("Merle");

        g.addVertex(Susi);
        g.addVertex(Karl);
        g.addVertex(Lisa);
        g.addVertex(Jens);
        g.addVertex(Merle);

        // Kanten anlegen und einfuegen
        Edge SK = new Edge(Susi, Karl, 1);
        Edge SL = new Edge(Susi, Lisa, 1);
        Edge SM = new Edge(Susi, Merle, 1);
        Edge KM = new Edge(Karl, Merle, 1);
        Edge KS = new Edge(Karl, Susi, 1);
        Edge KJ = new Edge(Karl, Jens, 1);
        Edge LM = new Edge(Lisa, Merle, 1);
               

        g.addEdge(SK);
        g.addEdge(SL);
        g.addEdge(SM);
        g.addEdge(KM);
        g.addEdge(KS);
        g.addEdge(KJ);
        g.addEdge(LM);
        
        
        
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
	
	private static boolean isInClique(String von, String wer, List<Edge> edges) {
		
		edges.toFirst();
		while (edges.hasAccess()) {
			if (edges.getContent().getVertices()[0].getID().equals(von) && edges.getContent().getVertices()[1].getID().equals(wer) || 
					edges.getContent().getVertices()[1].getID().equals(wer) && edges.getContent().getVertices()[0].getID().equals(von) ) {
				return true;
			}
			
		}
		
		return false;
	}

	
}
