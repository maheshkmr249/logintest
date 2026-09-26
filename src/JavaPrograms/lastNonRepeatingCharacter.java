package JavaPrograms;
import java.util.*;

public class lastNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find last non-repeating character
        char result = '\0';

        for (int i = str.length() - 1; i >= 0; i--) {

            char c = str.charAt(i);

            if (map.get(c) == 1) {
                result = c;
                break;
            }
        }

        System.out.println("Last non-repeating character: " + result);
    }
}