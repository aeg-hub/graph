package algorithm;

import graph.*;

public class Dijkstra {

	public Dijkstra() {}
	
    private static class Distance {

        Vertex vertex;
        double distance;

        Distance(Vertex v, double d) {
            vertex = v;
            distance = d;
        }
    }

    public static void dijkstra(ListGraph graph, Vertex start) {

        graph.setAllVertexMarks(false);

        List<Distance> distances = new List<>();

        List<Vertex> vertices = graph.getVertices();

        vertices.toFirst();
        while (vertices.hasAccess()) {

            Vertex current = vertices.getContent();

            if (current == start) {
                distances.append(new Distance(current, 0));
            } else {
                distances.append(new Distance(current, Double.POSITIVE_INFINITY));
            }

            vertices.next();
        }

        while (!graph.allVerticesMarked()) {

            Vertex current =
                    getSmallestUnmarkedVertex(graph, distances);

            if (current == null) {
                break;
            }

            current.setMark(true);

            List<Vertex> neighbours = graph.getNeighbours(current);

            neighbours.toFirst();

            while (neighbours.hasAccess()) {

                Vertex neighbour = neighbours.getContent();

                if (!neighbour.isMarked()) {

                    Edge edge = graph.getEdge(current, neighbour);

                    double newDistance =
                            getDistance(distances, current)
                                    + edge.getWeight();

                    if (newDistance < getDistance(distances, neighbour)) {

                        setDistance(distances, neighbour, newDistance);
                    }
                }

                neighbours.next();
            }
        }

        System.out.println("Shortest distances:");

        distances.toFirst();

        while (distances.hasAccess()) {

            Distance d = distances.getContent();

            System.out.println(
                    start.getID() + " -> "
                    + d.vertex.getID()
                    + " = "
                    + d.distance);

            distances.next();
        }
    }

    private static Vertex getSmallestUnmarkedVertex(
            ListGraph graph,
            List<Distance> distances) {

        Vertex smallest = null;
        double minimum = Double.POSITIVE_INFINITY;

        distances.toFirst();

        while (distances.hasAccess()) {

            Distance current = distances.getContent();

            if (!current.vertex.isMarked()
                    && current.distance < minimum) {

                minimum = current.distance;
                smallest = current.vertex;
            }

            distances.next();
        }

        return smallest;
    }

    private static double getDistance(
            List<Distance> distances,
            Vertex vertex) {

        distances.toFirst();

        while (distances.hasAccess()) {

            Distance current = distances.getContent();

            if (current.vertex == vertex) {
                return current.distance;
            }

            distances.next();
        }

        return Double.POSITIVE_INFINITY;
    }

    private static void setDistance(
            List<Distance> distances,
            Vertex vertex,
            double newDistance) {

        distances.toFirst();

        while (distances.hasAccess()) {

            Distance current = distances.getContent();

            if (current.vertex == vertex) {
                current.distance = newDistance;
                return;
            }

            distances.next();
        }
    }
}