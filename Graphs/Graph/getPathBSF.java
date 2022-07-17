package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class getPathBSF {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> getPathbsf(int [][] adjMatrix, int s,int e){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Queue<Integer> pendingvertices=new LinkedList<>();
		boolean visited []=new boolean [adjMatrix.length];
		visited [s]=true;
		pendingvertices.add(0);
		map.put(s, -1);
		boolean pathFound = false;

		while(!pendingvertices.isEmpty()){
			int currentVertex = pendingvertices.poll(); 
			for(int i = 0; i < adjMatrix.length; i++){ 
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
					pendingvertices.add(i); 
					visited[i] = true; 
					map.put(i, currentVertex); 
					if(i == e) {
						// Path found 
						pathFound = true; 
						break;
					}
				}
			}
		}
		if(pathFound){
			ArrayList<Integer> path = new ArrayList<>(); 
			int currentVertex = e; 
			while( currentVertex != -1){
				path.add(currentVertex); 
				int parent = map.get(currentVertex); 
				currentVertex = parent;
			}
			return path;
		}else{
			return null;
		}
	}

}
