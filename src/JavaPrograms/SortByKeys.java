package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeys {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
	      map.put("C",2000);
	      map.put("A",4000);
	      map.put("D",1000);
	      map.put("B",3000);

	      TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
	      for(Map.Entry<String, Integer> entry : sortedMap.entrySet())
	      {
	        System.out.println(entry.getKey()+" : "+entry.getValue());
	      }
	}
}
