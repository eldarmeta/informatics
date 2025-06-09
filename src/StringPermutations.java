import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        permute(new StringBuilder(str), 0, result);

        System.out.println("Перестановки строки '" + str + "':");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void permute(StringBuilder str, int index, List<String> result) {
        if (index == str.length() - 1) {
            result.add(str.toString());
            return;
        }

        for (int i = index; i < str.length(); i++) {
            swap(str, index, i);                    // поменять местами символы
            permute(str, index + 1, result);        // рекурсивно вызвать для следующего индекса
            swap(str, index, i);                    // откат назад (backtrack)
        }
    }

    private static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
}
