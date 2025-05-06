import java.util.Scanner;

public class task2944 {
    public static void main(String[] args) {
        /* Задача №2944. Сумма цифр
Дано трехзначное число. Найдите сумму его цифр.

Входные данные
Вводится трехзначное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
179
Выходные данные
17         */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int a = input.charAt(input.length() - 1) - '0';
        int b = input.charAt(input.length() - 2) - '0';
        int c = input.charAt(input.length() - 3) - '0';

        int output = c + b + a;


        System.out.println(output);
    }
}
