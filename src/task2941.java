import java.util.Scanner;

public class task2941 {
    public static void main(String [] args){
        /*
        Задача №2941. Последняя цифра
Дано натуральное число. Выведите его последнюю цифру.

Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
179
Выходные данные
9
         */
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char lastDigit = input.charAt(input.length() - 1);

        System.out.println(lastDigit);

    }
}
