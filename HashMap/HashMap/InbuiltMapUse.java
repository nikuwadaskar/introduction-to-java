package HashMap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		//		inset
		map.put("abc", 71);
		map.put("hfg", 3);
		map.put("gdf", 3);


		//		presence
		if(map.containsKey("abc")) {
			System.out.println("map has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("map has abc1");
		}


		// size 
		map.put("abc", 4);
		System.out.println(map.size());



		//		get value
		int v = map.get("abc");
		System.out.println(v);

		//		int v1= map.get("abc1");// do not write directly first
		//first check if the map contain abc1 or not 
		// do as given bellow 
		if(map.containsKey("abc1")) {
			System.out.println("map has abc1");
			int v1= map.get("abc1");
			System.out.println(v1);
		}else {
			System.out.println(-1);
		}


		// remove 
//		map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.println("map has abc");
		}else {System.out.println("you have removeed succecfully ");}


		//		iterate
		Set<String> keys=map.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
		
		System.out.println(map.containsValue(3));


	}

}
