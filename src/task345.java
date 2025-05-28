import java.util.Scanner;

public class task345 {
    public static void main(String[] args) {
        /*        Задача №345. Нули
Входные данные
Вводится число N, а затем N чисел.

Выходные данные
Подсчитайте и выведите, сколько среди данных N чисел нулей.

Примеры
Входные данные
3
1
2
3
Выходные данные
0         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sumOfZero = 0;

        for ( int i = 0; i < N; i++){
            int number = scanner.nextInt();
            if (number == 0) {
                sumOfZero = sumOfZero + 1;

        }

        }
        System.out.println(sumOfZero);


    }
}
