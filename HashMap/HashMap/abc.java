package HashMap;

import java.util.HashMap;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		//		inset
		map.put("abc", 71);
		map.put("hfg", 3);
		map.put("gdf", 3);
		map.put("abc", 71+1);
		int v = map.get("abc");
		System.out.println(v);

	}

}
