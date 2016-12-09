package clkpkg;



import java.util.*;


public class BFSusingQueue {
	private Queue<Integer> que;
	public BFSusingQueue(){
		
	 que = new LinkedList<Integer>();
	}
	
	public void breadthFSearch(int adjMtrx[][], int src){
		int n = adjMtrx[src].length; // no of nodes
		
		int[]visit = new int[n];
		int i, data;
		
		visit[src] = 1; 
		que.add(src);
		
		while (!que.isEmpty()){
			data = que.remove();
			i = data;
			
			System.out.println(i + "\n");
			
		while(i < n){
			if(adjMtrx[data][i] == 1 && visit[i] == 0){
				que.add(i);
				visit[i] = 1;
			}
			i++;
		}
			
		
			
		}
		
	}
	public static void main(String[]args){
		int n = 0;
		int src;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the nodes");
		
		n = sc.nextInt();
		
		System.out.println("Enter the adjacency matrix");
		int adjMtrx[][] = new int [n][n];
		for (int i=0; i < n; i++){
			for (int j =0; j < n; j++){
				adjMtrx[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the source node");
		src = sc.nextInt();
		BFSusingQueue BSQ = new BFSusingQueue();
		
		BSQ.breadthFSearch(adjMtrx, src);
	}

}

