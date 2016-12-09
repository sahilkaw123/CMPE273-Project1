package clockpkg;


import java.util.Map;
import java.util.List;import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	
	private Map<String, List<String>> map = new HashMap<String, List<String>>();
	
public Graph(String[] inputs){
	
	for (int i =0; i< inputs.length; i++){
		//System.out.println(inputs[i]);
		
		map.put(inputs[i], new LinkedList<String>());
	}
	
	
}	


public void setEdge(String source, String destination){
	List<String> source_list = map.get(source);
	source_list.add(destination);
	List<String> destination_list = map.get(destination);
	destination_list.add(source);
	//System.out.println("AAA" + map.get(source));
}

public List<String> getEdge(String source){
	return map.get(source);
	
	
	
}

	
	
public static void main (String [] args){
	String source = null;
	String destination;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of vertices");
	int num = sc.nextInt();
	String [] inputs = new String[num];
	for(int i =0; i<num; i++){
		System.out.println("Enter the Source vertex");
		String v = sc.next();
		//System.out.println(v);
		inputs[i] = v;
	}
	
	Graph g = new Graph(inputs);
	
	System.out.println("Enter the number of Edges");
	int noOfEdge = sc.nextInt();
	
	System.out.println(" Source  SPACE  Vertex");
	
	for (int a = 0; a<noOfEdge; a++){
		source = sc.next();
		destination = sc.next();
		g.setEdge(source, destination);
		}
	
	System.out.println("Connectivity of the graph");
	for (int a = 0; a<num; a++){
		
		
	System.out.print(inputs[a] + "-->");
	List<String> edge = g.getEdge(inputs[a]);

	for(int j =1;j<=edge.size();j++){
		if(j!= edge.size()){
		System.out.print(edge.get(j-1)+"-->");
	}else{
		System.out.print(edge.get(j-1));
		break;
	}
		
	
	
}
	System.out.println();
	
	}}}
	


