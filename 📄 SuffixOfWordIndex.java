/**
 * Задача: вернуть 1-базовый индекс первого слова в предложении,
 * которое оканчивается на заданный searchWord. Если такого нет — -1.
 * Время: O(n * L), где n — количество слов, L — средняя длина слова.
 */
public class SuffixOfWordIndex {
    public static int isSuffixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(searchWord)) return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isSuffixOfWord("i love eating burger", "ger")); // 4
        System.out.println(isSuffixOfWord("this problem is easy", "ly"));  // -1
    }
}