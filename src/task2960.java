import java.util.Scanner;

public class task2960 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int SystemInput = scanner.nextInt();
        int StudentInput = scanner.nextInt();

        if ((SystemInput == 1 && StudentInput == 1) ||
                (SystemInput != 1 && StudentInput != 1)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
