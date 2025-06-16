package conoo;

import java.util.Scanner;

public class romprom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Гласные, которые мы хотим удалить
        String vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";

        // Создаём строку без гласных
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}