/**
 * Задача: найти индекс i, где сумма слева == сумме справа.
 * Если нет — вернуть -1. Первый подходящий индекс.
 * Время: O(n), Память: O(1).
 */
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right) return i;
            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums)); // 3
    }
}