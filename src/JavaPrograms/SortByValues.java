package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortByValues {

	public static void main(String[] args) {
		  HashMap<String, Integer> map = new HashMap<>();
	      map.put("Mahesh",2000);
	      map.put("Rakesh",4000);
	      map.put("Ramesh",1000);
	      map.put("Rajesh",3000);

	      List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	      Collections.sort(list, (a,b)->a.getValue().compareTo(b.getValue()));
	      LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	      for(Map.Entry<String, Integer> entry : list)
	      {
	        sortedMap.put(entry.getKey(), entry.getValue());
	      }
	      for(Map.Entry<String, Integer> entry : sortedMap.entrySet())
	      {
	        System.out.println(entry.getKey()+" : "+entry.getValue());
	      }
	}
}
