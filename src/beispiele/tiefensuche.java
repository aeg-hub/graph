package beispiele;

import graph.List;
import graph.ListGraph;
import graph.Vertex;

public class tiefensuche {


    public static void tiefenSucheRek(ListGraph graph, String start, String search){
        Vertex v = graph.getVertex(start);
        if (v.getID().equals(search)){
            System.out.println(v.getID());
        }
        v.setMark(true);
        List<Vertex> nList = graph.getNeighbours(v);
        nList.toFirst();
        while (nList.hasAccess()){
            if (!nList.getContent().isMarked()){
                tiefenSucheRek(graph, nList.getContent().getID(), search);

            }
            nList.next();
        }

    }

    public static void main(String[] args) {
        ListGraph graph = new ListGraph();
        for (int i = 0; i < 8; i++){
            graph.addVertex(new Vertex(Integer.toString(i+1)));
        }
        GraphFactory.addEdge(graph,"8", "5");
        GraphFactory.addEdge(graph,"5", "4");
        GraphFactory.addEdge(graph,"5", "1");
        GraphFactory.addEdge(graph,"1", "4");
        GraphFactory.addEdge(graph,"1", "6");
        GraphFactory.addEdge(graph,"6", "3");
        GraphFactory.addEdge(graph,"6", "2");
        GraphFactory.addEdge(graph,"3", "4");
        GraphFactory.addEdge(graph,"3", "2");
        GraphFactory.addEdge(graph,"2", "4");
        GraphFactory.addEdge(graph,"2", "7");
        GraphFactory.addEdge(graph,"7", "4");

        tiefenSucheRek(graph, "1", "2");
    }
}

