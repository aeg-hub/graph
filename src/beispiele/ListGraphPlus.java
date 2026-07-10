package beispiele;

import graph.*;

public class ListGraphPlus extends ListGraph{

	public ListGraphPlus() {
		super();
	}

	public void test () {
		ListGraphPlus test = (ListGraphPlus) GraphFactory.generateListGraph(GraphFactory.getVertexplusNames(), GraphFactory.getAdjacencyWeights());
		List<Vertex> test2 = test.getVertices();
		test2.toFirst();
		while (test2.hasAccess()) {
			System.out.println(test2.getContent().getID());
			test2.next();
		}
		List<Edge> test3 = test.getEdges();
		test3.toFirst();
		while(test3.hasAccess()) {
			Vertex[] test4 = test3.getContent().getVertices();
			System.out.println(test4[0].getID() + test4[1].getID());
			test3.next();
		}
	} 
	
	public void addSorted(List<VertexPlus> list, VertexPlus vertex) {
	    if (vertex == null) {
	        return;
	    }

	    list.toFirst();

	    // Find the first vertex with a larger distance
	    while (list.hasAccess()
	            && list.getContent().getDistanceToPrevious()
	                    <= vertex.getDistanceToPrevious()) {
	        list.next();
	    }

	    if (list.hasAccess()) {
	        // Insert before the current element
	        list.insert(vertex);
	    } else {
	        // Insert at the end
	        list.append(vertex);
	    }
	}
	
//	public List<VertexPlus> visit (VertexPlus visit, List<VertexPlus> toVisit) {
//		List<Edge> edges = getEdges(visit);
//		edges.toFirst();
//		while (edges.hasAccess()) {
//
//		}
//	}
//
//	public List<VertexPlus> shortestPath(VertexPlus from, VertexPlus to){
//		List<VertexPlus> toVisit = new List<VertexPlus>();
//		toVisit.append(from);
//
//
//
//
//		List<Vertex> neighbors = getNeighbours(start);
//		neighbors.toFirst();
//		
//		while(neighbors.hasAccess()) {	
//			Edge temp = getEdge(from, neighbors.getContent());
//			temp.getWeight();
//			
//			neighbors.getContent().
//			neighbors.next();
//		}
	}
	


