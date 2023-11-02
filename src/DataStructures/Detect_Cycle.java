package DataStructures;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Detect_Cycle {
	private final int V ;
	//int count=0;
	private final List<List<Integer>>adj;
	public Detect_Cycle(int V) {
		this.V=V;
		adj= new ArrayList<>(V);
		for(int i=0;i<V;i++)
			adj.add(new LinkedList<>());
	}
	
	// Function to check if cycle exists
	private boolean isCyclicUtil(int i, boolean[] visited,boolean[] recStack) {
		// make the current node as visited and part of recursion stack
		if(recStack[i])
			return true;
		
		if (visited[i])
			return false;
		
		visited [i]= true;
		
		recStack[i]= true;
		List<Integer> children = adj.get(i);
		
		for(Integer c: children) {
			if(isCyclicUtil(c,visited,recStack))
				return true;
		}
		recStack [i]=false;
		return false;
		
	}
	private void addEdge(int source, int dest) {
		adj.get(source).add(dest);
	}
	
	//Returns true if graph contains a cycle, else false
	private boolean isCyclic() {
		//Mark all the vertices as not visited and not part of recursion stack
		//System.out.println("Count="+count++);
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];
		
		// Call the recursive helper function to detect cycle in different DFS trees
		for(int i=0; i<V; i++)
			if(isCyclicUtil(i,visited,recStack))
				return true;
		return false;

	}

	public static void main(String[] args) {
		Detect_Cycle graph = new Detect_Cycle(4);
		graph .addEdge(0,1);
		graph .addEdge(0,2);
		graph .addEdge(1,2);
		graph .addEdge(2,0);
		graph .addEdge(2,3);
	//	graph .addEdge(3,3);
		
		if(graph.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contains cycle");

		
	}

}
