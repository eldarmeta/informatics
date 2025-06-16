import java.util.Scanner;
public class NewtonRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double d = scanner.nextInt();

        double x = 500; // стартовая точка
        double epsilon = 1e-6;

        for (int i = 0; i < 100; i++) {
            double fx = a * x * x * x + b * x * x + c * x + d;
            double fpx = 3 * a * x * x + 2 * b * x + c;
            if (fpx == 0) break;
            double nextX = x - fx / fpx;
            if (Math.abs(nextX - x) < epsilon) break;
            x = nextX;
        }

        System.out.printf("%.6f", x);
    }
}
