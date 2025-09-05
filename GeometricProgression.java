import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);

        boolean isGP = true;
        if (arr[0] == 0) { System.out.println("Not a GP"); return; }
        int r = arr[1] / arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] == 0 || arr[i] / arr[i - 1] != r) {
                isGP = false;
                break;
            }
        }
        if (isGP) System.out.println("GP with ratio " + r);
        else System.out.println("Not a GP");
    }
}
