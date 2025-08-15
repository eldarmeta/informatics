import java.util.Arrays;

/**
 * Задача: по массиву nums вернуть массив его префиксных сумм.
 * Пример: [1,2,3,4] -> [1,3,6,10]
 * Время: O(n), Память: O(n).
 */
public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums))); // [1, 3, 6, 10]
    }
}