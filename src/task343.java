import java.util.Scanner;

public class task343 {
    public static void main(String[] args) {
        /*        Задача №343. Сумма чисел
Вычислите сумму данных N натуральных чисел.

Входные данные
Вводится число N, а затем N чисел, сумму которых необходимо вычислить.

Выходные данные
Выведите единственное число - сумму введенных чисел.

Примеры
Входные данные
3
9
5
1
Выходные данные
15         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            sum += number; // sum = sum + number;
        }
        System.out.println(sum);
        }

     }
