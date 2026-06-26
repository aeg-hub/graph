package beispiele;

import graph.Edge;
import graph.List;
import graph.ListGraph;
import graph.Graph;
import graph.Vertex;

public class FreundschaftsgraphS216 {

	public FreundschaftsgraphS216() {
		// TODO Auto-generated constructor stub
	}
	
    public static void main(String[] args) {

        // Graph erstellen
    	FreundschaftsgraphS216 f = new FreundschaftsgraphS216();
    	Graph g = f.freundschaftsgraphErstellen();
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
    
    public boolean istInCliqueVon(ListGraph g, Vertex wer, Vertex von) {
    	//return istEdgeEnthalten(g.getEdges(), wer, von);
    	List<Vertex> nachbarn = g.getNeighbours(von);
    	nachbarn.toFirst();
    	while (nachbarn.hasAccess()) {
    		Vertex v = nachbarn.getContent();
    		if (v.equals(wer)) {
    			return true;
    		}
    		nachbarn.next();
    	}
    	return false;
    }
    
    public boolean istEdgeEnthalten(List<Edge> l, Vertex v1, Vertex v2) {
    	return false;
    }
    
    public ListGraph freundschaftsgraphErstellen() {
    	
    	ListGraph g = new ListGraph();
    	((ListGraph)g).setVerbose(true);
        
        // Knoten anlegen und einfuegen
        Vertex susi = new Vertex("Susi");
        Vertex karl = new Vertex("Karl");
        Vertex lisa = new Vertex("Lisa");
        Vertex jens = new Vertex("Jens");
        Vertex merle = new Vertex("Merle");

        g.addVertex(susi);
        g.addVertex(karl);
        g.addVertex(lisa);
        g.addVertex(jens);
        g.addVertex(merle);

        // Kanten anlegen und einfuegen
        Edge susikarl = new Edge(susi, karl, 1);
        Edge susilisa = new Edge(susi, lisa, 1);
        Edge susimerle = new Edge(susi, merle, 1);
        Edge karllisa = new Edge(karl, lisa, 1);
        Edge karlmerle = new Edge(karl, merle, 1);
        Edge karlsusi = new Edge(karl, susi, 1);
        Edge karljens = new Edge(karl, jens, 1);
        Edge lisakarl = new Edge(lisa, karl, 1);
        Edge lisamerle = new Edge(lisa, merle, 1);
        Edge lisasusi = new Edge(lisa, susi, 1);
        Edge jenskarl = new Edge(jens, karl, 1);
        Edge merlekarl = new Edge(merle, karl, 1);
        Edge merlelisa = new Edge(merle, lisa, 1);
        Edge merlesusi = new Edge(merle, susi, 1);
        
        g.addEdge(susikarl);
        g.addEdge(susilisa);
        g.addEdge(susimerle);
        g.addEdge(karllisa);
        g.addEdge(karlmerle);
        g.addEdge(karlsusi);
        g.addEdge(karljens);
        g.addEdge(lisakarl);
        g.addEdge(lisamerle);
        g.addEdge(lisasusi);
        g.addEdge(jenskarl);
        g.addEdge(merlekarl);
        g.addEdge(merlelisa);
        g.addEdge(merlesusi);

        return g;
    }

}
