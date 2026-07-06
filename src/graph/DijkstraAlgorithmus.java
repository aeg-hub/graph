package graph;
public class DijkstraAlgorithmus {
	
	
	List<DijkstraVertex> warteschlange = new List<DijkstraVertex>();
	
	public DijkstraVertex findClosest(List<DijkstraVertex> neighbors) {
		neighbors.toFirst();
		DijkstraVertex closest = neighbors.getContent();
		while(neighbors.hasAccess()) {
			if(neighbors.getContent().getDistanz() < closest.getDistanz()) {
				closest = neighbors.getContent();
			}
		}
		return closest;
	}
}
