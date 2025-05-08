import java.util.Scanner;

public class task2947 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int hours = (n / 3600) % 24;
        int minutes = (n / 60) % 60;
        int seconds = n % 60;

        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);

        scanner.close();
    }
}
