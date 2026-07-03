package beispiele;

import graph.*;

public class vier_c {
	static ListGraph FG= new ListGraph();
	public static void erzeugen() {
		//ListGraph FG= new ListGraph();
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
		
		int a = getGradNode(karl);
		System.out.println(a);
		
	}
	public boolean gehoreZuClique(Vertex a,Vertex b) {
		
		return true;
	}
	
	public static int getGradNode(Vertex a) {
		
		List<Vertex> liste = FG.getNeighbours(a);
		liste.toFirst();
		System.out.println(liste.getContent());
		int counter = 0;
		while(liste.hasAccess()) {
			counter++;
			liste.next();
		}
		return counter;
	}
	public static void main(String [] args) {
		erzeugen();
		
	}
}
