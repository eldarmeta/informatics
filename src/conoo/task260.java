package conoo;

import java.util.Scanner;

public class task260 {
    public static void main(String[] args) {
        /*        Задача №260. Уравнение
Решить в целых числах уравнение ax + b = 0.

Входные данные
Вводятся 2 целых числа: a и b.

Выходные данные
Необходимо вывести все решения, если их число конечно, “NO” (без кавычек),
если решений нет, и “INF” (без кавычек), если решений бесконечно много.

Примеры
Входные данные
6
-2
Выходные данные
NO
Входные данные
1
1
Выходные данные
-1         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();



        if (a == 0) {
            // если a = 0, смотрим на b
            if (b == 0) {
                System.out.println("INF"); // 0x + 0 = 0 → бесконечно много решений
            } else {
                System.out.println("NO");  // 0x + b = 0 (b ≠ 0) → невозможно
            }
        } else {
            // если a ≠ 0, смотрим, можно ли получить целое x
            if (-b % a == 0) {
                System.out.println(-b / a); // есть целое решение
            } else {
                System.out.println("NO");  // дробное решение — не подойдёт
            }
        }
    }
}
