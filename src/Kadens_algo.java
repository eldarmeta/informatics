import java.util.Scanner;

public class Kadens_algo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 👉 Ввод массива: например -2 1 -3 4 -1 2 1 -5 4
        System.out.println("Enter numbers separated by space:");
        String[] parts = scanner.nextLine().split(" ");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        int maxSum = kadane(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int kadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i]; // ❗ начинаем заново
            } else {
                currentSum += nums[i]; // ➕ продолжаем складывать
            }

            if (currentSum > maxSum) {
                maxSum = currentSum; // 📈 сохраняем максимум
            }
        }

        return maxSum;
    }
}
