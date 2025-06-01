import java.util.Scanner;

public class task351 {
    public static void main(String[] args) {
        /*        Задача №351. Факториал
Вычислите N! ("эн-факториал") – произведение всех натуральных чисел от 1 до N ( N!=1∙2∙3∙…∙ N ).

Входные данные
Вводится единственное число N – натуральное, не превосходит 12.

Выходные данные
Выведите полученное значение N!

Примеры
Входные данные
3
Выходные данные
6
         */
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int output = 1;

        for (int i = 1; i <= input; i++){
            output = output * i;
        }
        System.out.println(output);

    }
}
