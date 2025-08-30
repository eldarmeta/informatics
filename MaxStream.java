import java.util.Arrays;

public class MaxStream {
    public int findMax(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }
}
