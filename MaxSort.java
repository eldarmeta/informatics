import java.util.Arrays;

public class MaxSort {
    public int findMax(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}
