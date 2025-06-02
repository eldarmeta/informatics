import java.util.Scanner;

public class task315math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int output =  n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(output);
    }
}
