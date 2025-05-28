import java.util.Scanner;

public class task333 {
    public static void main(String[] args) {
        /*        Задача №333. Четные числа
Входные данные
Вводятся целые числа a и b. Гарантируется, что a не превосходит b

Выходные данные
Выведите (через пробел) все четные числа от a до b (включительно).

Примеры
Входные данные
2
5
Выходные данные
2 4          */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

            for( int i = a; i <= b; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");


            }
    }
}
