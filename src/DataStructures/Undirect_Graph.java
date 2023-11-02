package DataStructures;
import java.util.Iterator;
import java.util.LinkedList;
public class Undirect_Graph {
	// No. of Vertices
	private int V;
	
	//Adjacency List Representation
	private LinkedList<Integer>adj[];

	//Constructor
	Undirect_Graph(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]= new LinkedList<Integer>();
	}
	//function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // (0,1)
		adj[w].add(v);//(1,0) both direction connected 
	}
	Boolean isCyclicUtil(int v , Boolean visited[],int parent) {
		// Mark the current node visited
		visited [v]=true;
		Integer i;
		//Recur for the all the vertices adjacent to this vertex
		Iterator<Integer> it= adj[v].iterator();
		while(it.hasNext()) {
			i=it.next();
			
			// if an adjacent is not visited, then recur for that adjacent
			if(!visited[i]) {
				if(isCyclicUtil(i,visited,v))
					return true;
			}
			else if (i!= parent)
				return true;
		}
		return false;
	}
	
	Boolean isCyclic() {
	// Mark all the vertices as not visited and not part of recursion stack
		Boolean visited[]= new Boolean[V];
		for(int i=0;i<V;i++)
			visited [i]= false;
		// Call the recursive helper function to defect cycle in different DFS trees
		for(int u=0;u<V;u++) {
			//Dont't recur for u if already visited
			if(!visited[u])
				if(isCyclicUtil(u,visited,-1))
					return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Undirect_Graph g1= new Undirect_Graph(5);
		g1.addEdge(1,0);
		g1.addEdge(0,2);
		g1.addEdge(2,1);
		g1.addEdge(0,3);
		g1.addEdge(3,4);
		
		if (g1.isCyclic())
			System.out.println("Graph contain cycle ");
		else 
			System.out.println("Graph doesn't contain cycle ");
		Undirect_Graph g2= new Undirect_Graph(3);
		g2.addEdge(0, 1);;
		g2.addEdge(1, 2);

		if (g2.isCyclic())
			System.out.println("Graph contain cycle ");
		else 
			System.out.println("Graph doesn't contain cycle ");


		
		

	}

}
