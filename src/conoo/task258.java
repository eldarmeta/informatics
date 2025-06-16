package conoo;

import java.util.Scanner;

public class task258 {
    public static void main(String[] args) {
        /*       Задача №257. Конь
Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами
(номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты коня и координаты другой фигуры.
Все координаты - целые числа в интервале от 1 до 8.

Выходные данные
Программа должна вывести слово YES, если конь может побить фигуру за 1 ход, в противном случае вывести слово NO.

Примеры
Входные данные
1
1
3
2
Выходные данные
YES
Входные данные
1
1
3
3
Выходные данные
NO         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if ((Math.abs(a - c) == 2 && Math.abs(b - d) == 1) ||
        (Math.abs(a - c) == 1 && Math.abs(b - d) == 2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
