package graph;

import containers.Bag;


/**
 * Search for all neighbors of a specific depth. 
 * @author Edward
 *
 */
public class NeighborsDFS {
	private final int s;
	private Bag<Integer> neighbors;
	
	public NeighborsDFS(Graph G, int s, int depth){
		this.s = s;
		this.neighbors = new Bag<Integer>();
		dfs(G,s, depth);
	}
	
	private void dfs(Graph g, int v, int depth){
		dfs(g, v, 0, depth);
		
	}
	private void dfs(Graph g, int v, int start, int stop){
		if (start ==  stop && s!= v ) {			
			neighbors.add(v);
			return;
		}
		if (start == stop) return;
		
		for(int w: g.adj(v))
			dfs(g, w, start + 1, stop);
	}
	
	public int size(){ return neighbors.size(); }
	
	public Iterable<Integer> neighbors(){
		return neighbors;
	}
}
