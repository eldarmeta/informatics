import java.util.Scanner;

public class MissingNumberBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);

        int n = arr.length + 1;
        for (int num = 1; num <= n; num++) {
            boolean found = false;
            for (int x : arr) {
                if (x == num) { found = true; break; }
            }
            if (!found) {
                System.out.println("Missing: " + num);
                return;
            }
        }
    }
}
