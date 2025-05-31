import java.util.Scanner;

public class task347 {
    public static void main(String[] args) {
        /*        Задача №348. Уравнение по возрастанию
Входные данные
Вводятся 4 числа: a, b, c и d.

Выходные данные
Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0 на отрезке [0,1000]
и выведите их в порядке возрастания.
Если на данном отрезке нет ни одного решения, то ничего выводить не нужно.

Примеры
Входные данные
1
-5
6
0
Выходные данные
0 2 3          */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int x = 0; x <= 1000; x++) {
            int fx = a * x * x * x + b * x * x + c * x + d;
            if (fx == 0) {
                System.out.print(x + " ");
            }
        }
    }
}