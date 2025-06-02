import java.util.Scanner;

public class task319 {
    public static void main(String[] args) {
        /*        Задача №319. Геометрическая прогрессия
По данному действительному числу a и натуральному n вычислите сумму 1+a+a2+...+an,
не используя формулу суммы геометрической прогрессии и операцию возведения в степень.
Время работы программы должно быть пропорционально n.

Входные данные
Вводятся 2 числа - a и n.

Выходные данные
Необходимо вывести  значение суммы.

Примеры
Входные данные
2
2
Выходные данные
7         */
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        double term = 1;
        double sum = term;

        for (int i = 1; i <= n; i++){
            term *= a;
            sum += term;
        }
        System.out.println(sum);
    }
}
