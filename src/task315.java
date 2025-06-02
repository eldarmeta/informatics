import java.util.Scanner;

public class task315 {
    public static void main(String[] args) {
        /*        Задача №315. Сумма квадратов
По данному натуральному n вычислите сумму 12+22+...+n2.

Входные данные
Вводится единственное натуральное число n, не превосходящее 100

Выходные данные
Необходимо вывести  вычисленную сумму.

Примеры
Входные данные
2
Выходные данные
5         */
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int output = 0;

        for (int i = 0; i <= input; i++) {

                output = output + (i * i);
        }
        System.out.println(output);


        }

    }
