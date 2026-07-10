package beispiele;

import graph.Edge;
import graph.Graph;
import graph.ListGraph;
import graph.Vertex;

public class GraphFactory3 {

    private static final String[] VERTEX_NAMES = {
            "1", "2", "3", "4", "5", "6", "7", "8"
    };

    public static ListGraph generateListGraph( double[][] pWeights) {
        ListGraph graph = new ListGraph();

        // Knoten anlegen und einfuegen
        for (int i = 0; i < VERTEX_NAMES.length; i++) {
            graph.addVertex(new Vertex(VERTEX_NAMES[i]));
        }

        addEdge("8", "5", graph);
        addEdge("5", "4", graph);
        addEdge("5", "1", graph);
        addEdge("4", "1", graph);
        addEdge("3", "4", graph);
        addEdge("7", "4", graph);
        addEdge("7", "2", graph);
        addEdge("2", "3", graph);
        addEdge("2", "6", graph);
        addEdge("6", "1", graph);
        addEdge("6", "3", graph);
        addEdge("4", "2", graph);


        return graph;
    }

    public static void addEdge (String a, String b, Graph graph){
        graph.addEdge(new Edge(graph.getVertex(a), graph.getVertex(b), 1));
    }

    }

