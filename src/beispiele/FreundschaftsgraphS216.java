package beispiele;

import graph.Edge;
import graph.List;
import graph.ListGraph;
import graph.Vertex;

public class FreundschaftsgraphS216 {

	public static void main(String[] args) {
		ListGraph lg = new ListGraph();

		Vertex a = new Vertex("Susi");
		Vertex b = new Vertex("Karl");
		Vertex c = new Vertex("Lisa");
		Vertex d = new Vertex("Jens");
		Vertex e = new Vertex("Merle");

		lg.addVertex(a);
		lg.addVertex(b);
		lg.addVertex(c);
		lg.addVertex(d);
		lg.addVertex(e);

		Edge ab = new Edge(a, b, 1);
		Edge ac = new Edge(a, c, 1);
		Edge ae = new Edge(a, e, 1);
		Edge bc = new Edge(b, c, 1);
		Edge be = new Edge(b, e, 1);
		Edge ba = new Edge(b, a, 1);
		Edge bd = new Edge(b, d, 1);
		Edge cb = new Edge(c, b, 1);
		Edge ce = new Edge(c, e, 1);
		Edge ca = new Edge(c, a, 1);
		Edge db = new Edge(d, b, 1);
		Edge eb = new Edge(e, b, 1);
		Edge ec = new Edge(e, c, 1);
		Edge ea = new Edge(e, a, 1);

		lg.addEdge(ab);
		lg.addEdge(ac);
		lg.addEdge(ae);
		lg.addEdge(bc);
		lg.addEdge(be);
		lg.addEdge(ba);
		lg.addEdge(bd);
		lg.addEdge(cb);
		lg.addEdge(ce);
		lg.addEdge(ca);
		lg.addEdge(db);
		lg.addEdge(eb);
		lg.addEdge(ec);
		lg.addEdge(ea);

		// Ausgabe zur Kontrolle
		System.out.println("Knoten im Graphen:");
		List<Vertex> vertices = lg.getVertices();
		vertices.toFirst();
		while (vertices.hasAccess()) {
			System.out.println("  " + vertices.getContent().getID());
			vertices.next();
		}

		System.out.println("\nKanten im Graphen:");
		List<Edge> edges = lg.getEdges();
		edges.toFirst();
		while (edges.hasAccess()) {
			Edge edge = edges.getContent();
			Vertex[] ends = edge.getVertices();
			System.out.println("  " + ends[0].getID() + " --" + edge.getWeight() + "-- " + ends[1].getID());
			edges.next();
		}
	}

}
