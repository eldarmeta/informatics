import java.util.Scanner;
import java.util.stream.IntStream;

public class SumSquaresStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // читаем n

        int sum = IntStream.rangeClosed(1, n)
                .map(i -> i * i)
                .sum(); // суммируем квадраты с помощью стрима

        System.out.println(sum); // выводим результат
    }
}
