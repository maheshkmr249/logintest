package JavaPrograms;

import java.util.*;

public class UniqueCharsFromArrayList {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "apple", "charry", "mango");
     // String[] words = {"apple", "banana", "mango", "cherry"};
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Unique characters:");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}