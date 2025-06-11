import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"bat", "tab", "cat", "act", "tac", "dog"};
        Map<String, List<String>> grouped = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            grouped.putIfAbsent(key, new ArrayList<>());
            grouped.get(key).add(word);
        }

        for (List<String> group : grouped.values()) {
            System.out.println(group);
        }
    }
}
