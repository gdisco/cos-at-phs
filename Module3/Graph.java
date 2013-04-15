/*
In graph theory (very important field in math/computer science), a "graph" is 
a collection of points (vertices) connected by some collection of lines 
(edges). 

Our vertices here will be represented by n numbers from 0 to n - 1.
The edges will be represented by a m-by-2 rectangular array.

Each length-2 subarray in the array represents an edge in the graph. 
For example, if a subarray is {1, 4}, then vertices 1 and 4 are connected.

A connection matrix is a boolean matrix with the value "true" if two 
edges are connected, and "false" if they aren't. As our vertices are 
small positive integers, we can use the array indices directly to represent 
the vertices. 

For example, if we know that 1 and 4 are connected, and that 2 and 3 are 
connected, then the connection matrix is 

  1 2 3 4
1       x
2     x
3   x
4 x

For the connection matrix, rectangular arrays are easiest to code, but watch 
out! We assume that, if a is connected to b, then b is also connected to a.
Also, a can be connected to itself.

Also consider using a "jagged" triangular array matrix to save space.


So, given the m-by-2 array, we can create a connection matrix. Write a class
that has the following methods:

// creates a Graph able to hold n vertices
public Graph(int n);

// adds the edges v1-v2 and v2-v1 into the graph
public void addEdge(int v1, int v2);

// returns true if v1-v2 (and also v2-v1) is in the graph, false otherwise
public boolean hasEdge(int v1, int v2);

Play around with your graph. You can do lots of interesting things with it. 

For example, given a graph, can you use the hasEdge method to determine if 
two vertices are connected within it, and, if so, what the shortest path 
between the two vertices is? Can you determine if a graph is connected--that 
is, if you can get to any vertex by travelling along edges from another 
vertex? (A good idea if you're planning transportation routes.)
*/

public class Graph {

	public static void main(String[] args) {
		int[][] vertices = {{ 9,43},
							{38,38},
							{47,43},
							{39,12},
							{26,27},
							{15,29},
							{45, 4},
							{24,31},
							{ 2,17},
							{21,43},
							{49,11},
							{28,45},
							{ 1,34},
							{ 4,37},
							{28,35},
							{29,22},
							{32, 6},
							{47,19},
							{35,36},
							{45,33},
							{49, 7},
							{ 5,29},
							{ 9,10},
							{22, 9},
							{32,31},
							{14, 0},
							{30,22},
							{25,49},
							{41,43},
							{47, 7},
							{27,21},
							{29,12},
							{46, 7},
							{49,48},
							{31,11},
							{ 9, 0},
							{37,46},
							{35,32},
							{23,20},
							{14,38},
							{25,13},
							{43,31},
							{11,29},
							{49, 5},
							{14,21},
							{35, 1},
							{16,40},
							{ 5,48},
							{16,26},
							{ 6,25},
							{15,26},
							{ 1,19},
							{ 3,10},
							{49,42},
							{39,22},
							{ 6,42},
							{31,21},
							{43, 5},
							{46,28},
							{26,23},
							{39, 0},
							{39,25},
							{28,16},
							{35,28},
							{ 7,37},
							{30,43},
							{39,37},
							{11,30},
							{11,12},
							{40,19},
							{23, 1},
							{25, 0},
							{33,27},
							{ 8,13},
							{48,20},
							{20,14},
							{26, 8},
							{32,31},
							{39, 5},
							{44,45},
							{20,27},
							{ 3,27},
							{15,19},
							{18,46},
							{42,35},
							{35,27},
							{41,25},
							{ 1,37},
							{10,34},
							{ 5, 7},
							{36,11},
							{20,40},
							{21,36},
							{ 5,38},
							{44, 1},
							{22,25},
							{25,21},
							{47,49},
							{33, 9},
							{36,33}};  // randomly generated
		
		final int vertexCount = 50;
		final int edgeCount =  100;
		
		boolean[][] matrix = new boolean[vertexCount][];
		
		// initialize ragged array
		for (int i = 0; i < vertexCount; i++) {
			matrix[i] = new boolean[vertexCount - i];
		}
		
		for (int[] arr: vertices) {
			int va = arr[0];
			int vb = arr[1];
			
			if (va > vb) {
				int temp = va;
				va = vb;
				vb = temp;
			}
			
			matrix[va][vb - va] = true;
		}
		
		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				if (i <= j) {
					if (matrix[i][j - i]) {
						System.out.print("O");
					} else {
						System.out.print(".");
					}
				} else {
					if (matrix[j][i - j]) {
						System.out.print("O");
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}

}