import java.util.Scanner;

public class task352 {
    public static void main(String[] args) {
        /*        Задача №352. Степень
Напишите программу, вычисляющую 2 N. Операцию возведения в степень использовать запрещено.

Входные данные
Вводится целое неотрицательное число N, которое не превосходит 30.

Выходные данные
Выведите число 2 N.

Примеры
Входные данные
4
Выходные данные
16         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int output = 1;

        for (int i = 0; i < n; i++){
            output = output * 2;
        }
        System.out.println(output);
    }
}
