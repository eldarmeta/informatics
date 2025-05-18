import java.util.Scanner;

public class task259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // k = 4 * (n - 1) => (k % 4 == 0) && (n = k / 4 + 1 >= 2)
        if (k % 4 == 0 && (k / 4 + 1) >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
