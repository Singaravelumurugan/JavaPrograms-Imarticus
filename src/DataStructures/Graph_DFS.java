package DataStructures;

import java.util.LinkedList;
import java.util.Stack;

public class Graph_DFS {
	int V;
	LinkedList<Integer>[]adj;
	
	@SuppressWarnings("unchecked")
	Graph_DFS(int V){
	this.V=V;
	adj = new LinkedList[V];
	for(int i=0; i<adj.length;i++) 
		adj[i]= new LinkedList<Integer>();
	}
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	void DFS(int n) {
		boolean nodes[] = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		stack.push(n);
		int a=0;
		while(!stack.empty()) {
			n= stack .peek();
			stack.pop();
			if(nodes[n]== false) {
				System.out.print(n+" ");
				nodes[n]=true;
			}
			for(int i=0;i<adj[n].size();i++) {
				a= adj[n].get(i);
				if(!nodes[a]) {
					stack.push(a); //push the top element of the stack
				}
			}
		}
	}
	public static void main(String[] args) {
	
		Graph_DFS g = new Graph_DFS(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(1, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 3);
		g.addEdge(5, 3);

		System.out.println("Following is Depth First Travel ");
		g.DFS(0);

	}

}
