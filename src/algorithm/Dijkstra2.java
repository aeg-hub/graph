package algorithm;

import graph.Edge;
import graph.List;
import graph.ListGraph;
import graph.Vertex;

import java.util.HashMap;

public class Dijkstra2 {

	private HashMap<Vertex, Information> map = new HashMap<>();

	public Dijkstra2() {
	}

	private class Information {

		Vertex previous;
		double distance;

		Information(Vertex v, double d) {
			previous = v;
			distance = d;
		}
	}

	public void dijkstra(ListGraph graph, Vertex start) {

		graph.setAllVertexMarks(false);

		List<Vertex> vertices = graph.getVertices();

		vertices.toFirst();
		while (vertices.hasAccess()) {

			Vertex current = vertices.getContent();

			if (current == start) {
				map.put(current, new Information(null, 0));
			} else {
				map.put(current, new Information(null, Double.POSITIVE_INFINITY));
			}

			vertices.next();
		}

		Vertex current = getSmallestUnmarkedVertex(graph, vertices);

		while (current != null) {
			current.setMark(true);

			List<Vertex> neighbours = graph.getNeighbours(current);
			neighbours.toFirst();

			while (neighbours.hasAccess()) {

				Vertex neighbour = neighbours.getContent();

				if (!neighbour.isMarked()) {

					Edge edge = graph.getEdge(current, neighbour);

					double newDistance = map.get(current).distance + edge.getWeight();

					if (newDistance < map.get(neighbour).distance) {
						map.get(neighbour).distance = newDistance;
						map.get(neighbour).previous = current;
					}
				}
				neighbours.next();
			}
			current = getSmallestUnmarkedVertex(graph, graph.getVertices());
		}
	}

	private Vertex getSmallestUnmarkedVertex(ListGraph graph, List<Vertex> vertices) {

		vertices.toFirst();

		Vertex smallest = null;
		double smallestDistance = Double.POSITIVE_INFINITY;

		while (vertices.hasAccess()) {

			Vertex current = vertices.getContent();

			if (!current.isMarked()) {

				Information info = map.get(current);

				if (info.distance < smallestDistance) {
					smallestDistance = info.distance;
					smallest = current;
				}
			}

			vertices.next();
		}

		return smallest;
	}
	
	public List<Vertex> getShortestPath(Vertex destination) {

	    List<Vertex> path = new List<>();

	    Vertex current = destination;

	    while (current != null) {
	        path.insert(current); 
	        current = map.get(current).previous;
	    }

	    return path;
	}
	
	public double getDistance(Vertex v) {
	    return map.get(v).distance;
	}

}
