import java.util.Scanner;

public class BinarySearchRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double d = scanner.nextInt();

        double left = 0, right = 1000;
        double epsilon = 1e-6;

        while (right - left > epsilon) {
            double mid = (left + right) / 2;
            double fMid = a * mid * mid * mid + b * mid * mid + c * mid + d;
            double fLeft = a * left * left * left + b * left * left + c * left + d;

            if (fMid * fLeft <= 0) {
                right = mid;
            } else {
                left = mid;
            }
        }

        double root = (left + right) / 2;
        System.out.printf("%.6f", root);
    }
}
