package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class SecondRepeatingChar {

	public static void main(String[] args) {
		String str="aaabbcde";
	      HashMap<Character, Integer> map = new HashMap<>();
	      char[] ch = str.toCharArray();
	      for(char c:ch)
	      {
	        map.put(c,map.getOrDefault(c,0)+1);
	      }
	      int first = Integer.MIN_VALUE;
	      int second = Integer.MIN_VALUE;
	      char secondChar = '\0';
	      for(Map.Entry<Character, Integer> entry : map.entrySet())
	      {
	        int count = entry.getValue();
	        if(count>first)
	        {
	          second = first;
	          first = count;
	        }
	        else if(count>second && count!=first)
	        {
	          second = count;
	          secondChar = entry.getKey();
	        }
	      }
	     System.out.println("Second repeating char is: "+secondChar);

	}

}
