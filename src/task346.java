import java.util.Scanner;

public class task346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int zero = 0;
        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                zero++;
            } else if (number > 0) {
                posCount++;
            } else {
                negCount++;
            }
        }

        System.out.printf("%d %d %d\n", zero, posCount, negCount);
    }
}
