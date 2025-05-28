import java.util.Scanner;

public class task334 {
    public static void main(String[] args) {
        /*        Задача №334. Остаток
Входные данные
Вводятся 4 числа: a, b, c и d.

Выходные данные
Выведите все числа на отрезке от a до b, дающие остаток c при делении на d.
Если таких чисел не существует, то ничего выводить не нужно.

Примеры
Входные данные
2
5
0
2
Выходные данные
2 4          */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for ( int i = a; i <= b; i++)
            if (i % d == c)
                System.out.println(i + " ");
        }

    }
