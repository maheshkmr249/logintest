package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountNoOfWordsRepeating {

	public static void main(String[] args) {
		
		    String str = "this is java and this is selenium";
		    String[] words = str.split(" ");
		    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		    for(String w:words)
		    {
		      map.put(w,map.getOrDefault(w,0)+1);
		    }
		    for(Entry<String, Integer> entry : map.entrySet())
		    {
		      if(entry.getValue()>1)
		      {
		      System.out.println(entry.getKey() +" : "+entry.getValue());
		      }
		    }

	}}


