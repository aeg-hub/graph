package graph;

public class vier_c {
	public void erzeugen() {
		ListGraph FG= new ListGraph();
		Vertex susi = new Vertex("Susi");
		Vertex karl = new Vertex("Karl");
		Vertex lisa = new Vertex("Lisa");
		Vertex jens = new Vertex("Jens");
		Vertex merle = new Vertex("Merle");
		
		Edge suka = new Edge(susi,karl,1);
		Edge suli = new Edge(susi,lisa,1);
		Edge sume = new Edge(susi,merle,1);
		Edge kali = new Edge(karl,lisa,1);
		Edge kame = new Edge(karl,merle,1);
		Edge kaje = new Edge(karl,jens,1);
		Edge lime = new Edge(lisa,merle,1);
		
		FG.addEdge(suka);
		FG.addEdge(suli);
		FG.addEdge(sume);
		FG.addEdge(kali);
		FG.addEdge(kame);
		FG.addEdge(kaje);
		FG.addEdge(lime);
		
	}
	public boolean gehoreZuClique(Vertex a,Vertex b) {
		
		return true;
	}
}
