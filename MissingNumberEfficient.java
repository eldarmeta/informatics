import java.util.Scanner;

public class MissingNumberEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);

        int n = arr.length + 1;
        int sumExpected = n * (n + 1) / 2;
        int sumActual = 0;
        for (int x : arr) sumActual += x;

        System.out.println("Missing: " + (sumExpected - sumActual));
    }
}
