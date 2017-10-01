package graph;

public class Dijkstra {
	
	/**
	 * 
	 * @param dist
	 * @param path
	 * @param A
	 * @param v0
	 */
	public static void dijkstraPath(double[] dist, int[] path, int [][] A, int v0) {
		int n = A.length;
		
		// 初始化
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if(i != v0 && A[v0][i] > 0) {
				dist[i] = A[v0][i];
				path[i] = v0; 		// path记录最短路径上从v0到i的前一个顶点
			}
			else{
				// 若i不与v0直接相邻，则权值置为无穷大
				dist[i] = Integer.MAX_VALUE;
				path[i] = -1;
			}
			visited[i] = false;
			path[v0] = v0;
			dist[v0] = 0;
		}
		visited[v0] = true;
		
		//循环扩展n-1次
		double min = Integer.MAX_VALUE;
		int u = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {		//寻找未被扩展的权值最小的顶点
				if(visited[j] == false && dist[j] < min) {
					min = dist[j];
					u = j;
				}
			}
			visited[u] = true;
			for (int j = 0; j < n; j++) {
//				if(visited[j] == false && A[u][j] > 0 && dist[j] > A[v0][u] + )
			}
		}
	}
	
	/**
	 * 
	 * @param path
	 * @param v0
	 * @param v
	 */
	public static void showPath(int[] path, int v0, int v) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
