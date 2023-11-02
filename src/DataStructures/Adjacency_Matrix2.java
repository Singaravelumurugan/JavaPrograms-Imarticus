package DataStructures;

public class Adjacency_Matrix2 {
	private boolean adjMatrix[][];
	private int numVertices;
	// Initialize the Matrix
	public Adjacency_Matrix2(int numVertices) {
		this.numVertices= numVertices;
		adjMatrix = new boolean [numVertices][numVertices];
	}
	public void addEdge(int i, int j) {
		adjMatrix[i][j]=true;
		adjMatrix[j][i]=true;
	}
	public String toString() {
		StringBuilder s= new StringBuilder();
		for(int i=0;i < numVertices;i++) {
			s.append(i+": ");
			for (boolean j : adjMatrix[i]) {
				s.append((j ? 1:0)+" ");
			}
				s.append("\n");
		}
		return s.toString();
	}

	public static void main(String[] args) {
		Adjacency_Matrix2 g1 =new Adjacency_Matrix2(5);
				g1.addEdge(0, 1);
				g1.addEdge(0, 2);
				g1.addEdge(1, 3);
				g1.addEdge(1, 4);
				g1.addEdge(2, 3);
				g1.addEdge(3, 4);
				System.out.print(g1.toString());
	}

}
