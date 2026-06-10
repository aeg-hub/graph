package beispiele;

import graph.*;

public class GraphTest {

    public static void main(String[] args) {
        testeAlles();
    }

    public static void testeAlles() {

        System.out.println("START TEST");

        ListGraph g = new ListGraph();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");

        g.addVertex(a);
        g.addVertex(b);
        g.addVertex(c);

        Edge ab = new Edge(a, b, 5);
        Edge ac = new Edge(a, c, 3);
        Edge bc = new Edge(b, c, 7);

        g.addEdge(ab);
        g.addEdge(ac);
        g.addEdge(bc);

        // vertices test
        System.out.println("A test: " + (g.getVertex("A") == a ? "ok" : "fail"));
        System.out.println("B test: " + (g.getVertex("B") == b ? "ok" : "fail"));
        System.out.println("C test: " + (g.getVertex("C") == c ? "ok" : "fail"));

        // edges test
        System.out.println("A-B edge: " + (g.getEdge(a, b) == ab ? "ok" : "fail"));
        System.out.println("A-C edge: " + (g.getEdge(a, c) == ac ? "ok" : "fail"));
        System.out.println("B-C edge: " + (g.getEdge(b, c) == bc ? "ok" : "fail"));

        // neighbours test
        List n = g.getNeighbours(a);

        boolean hasB = false;
        boolean hasC = false;

        n.toFirst();
        while (n.hasAccess()) {
            if (n.getContent() == b) hasB = true;
            if (n.getContent() == c) hasC = true;
            n.next();
        }

        System.out.println("neighbour B: " + (hasB ? "ok" : "fail"));
        System.out.println("neighbour C: " + (hasC ? "ok" : "fail"));

        // marks test
        System.out.println("all unmarked: " + (!g.allVerticesMarked() ? "ok" : "fail"));

        g.setAllVertexMarks(true);
        System.out.println("all vertices marked: " + (g.allVerticesMarked() ? "ok" : "fail"));

        g.setAllEdgeMarks(true);
        System.out.println("all edges marked: " + (g.allEdgesMarked() ? "ok" : "fail"));

        // remove edge
        g.removeEdge(ab);
        System.out.println("remove A-B edge: " + (g.getEdge(a, b) == null ? "ok" : "fail"));

        // remove vertex
        g.removeVertex(c);

        System.out.println("remove C vertex: " + (g.getVertex("C") == null ? "ok" : "fail"));
        System.out.println("remove edges with C: " +
                ((g.getEdge(a, c) == null && g.getEdge(b, c) == null) ? "ok" : "fail"));


        // EXTRA TESTS (edge cases)


        // duplicate vertex test (should not add)
        Vertex a2 = new Vertex("A");
        g.addVertex(a2);
        System.out.println("duplicate vertex A ignored: " + (g.getVertex("A") == a ? "ok" : "fail"));

        // null vertex test
        g.addVertex(null);
        System.out.println("null vertex ignored: " + (g.getVertex("X") == null ? "ok" : "fail"));

        // invalid edge test (vertex not in graph)
        Vertex x = new Vertex("X");
        Edge invalid = new Edge(a, x, 10);
        g.addEdge(invalid);
        System.out.println("invalid edge not added: " + (g.getEdge(a, x) == null ? "ok" : "fail"));

        // self-loop test (should not be added)
        Edge loop = new Edge(a, a, 1);
        g.addEdge(loop);
        System.out.println("self loop not added: " + (g.getEdge(a, a) == null ? "ok" : "fail"));

        // remove vertex that does not exist
        Vertex fake = new Vertex("FAKE");
        g.removeVertex(fake);
        System.out.println("remove non-existing vertex safe: ok");

        // empty graph test
        ListGraph empty = new ListGraph();
        System.out.println("empty graph is empty: " + (empty.isEmpty() ? "ok" : "fail"));

        System.out.println("END TEST");
    }
}