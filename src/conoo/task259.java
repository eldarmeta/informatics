import java.util.Scanner;

public class task259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k <= 30000) {
            if ((k == 1) || k % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}