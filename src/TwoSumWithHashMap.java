import java.util.HashMap;
import java.util.Map;

public class TwoSumWithHashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                System.out.println("Indexes: " + map.get(diff) + " and " + i);
                return;
            }
            map.put(nums[i], i);
        }
    }
}
