package JavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersAndThereCount {

    public static void main(String[] args) {

        String str = "automationtesting";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Print only duplicate characters
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}