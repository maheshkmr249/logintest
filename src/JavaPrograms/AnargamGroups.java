package JavaPrograms;
import java.util.*;

public class AnargamGroups {

    public static void main(String[] args) {

    	String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();
        for(String w:words)
        {
          char[] ch = w.toCharArray();
          Arrays.sort(ch);
          String key = new String(ch);

          if(!map.containsKey(key))
          {
            map.put(key, new ArrayList<>());
          }
          map.get(key).add(w);
        } 
        System.out.println(map.values());
    }
}