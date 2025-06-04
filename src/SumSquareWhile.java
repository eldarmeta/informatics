import java.util.Scanner;

public class SumSquareWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // читаем n
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i * i; // прибавляем квадрат
            i++; // двигаемся к следующему числу
        }

        System.out.println(sum); // выводим результат
    }
}
