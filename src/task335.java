import java.util.Scanner;

public class task335 {
    public static void main(String[] args) {
        /*        Задача №335. Квадраты
Входные данные
Вводятся целые числа a и b. Гарантируется, что a не превосходит b.

Выходные данные
Выведите все числа на отрезке от a до b, являющиеся полными квадратами.
 Если таких чисел нет, то ничего выводить не нужно.

Примеры
Входные данные
2
8
Выходные данные
4          */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i * i <= b; i++) {
            int square = i * i;
            if (square >= a && square <= b) {
                System.out.println(square + " ");

            }

        }
    }
}