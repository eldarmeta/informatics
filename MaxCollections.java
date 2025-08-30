import java.util.*;

public class MaxCollections {
    public int findMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums) {
            list.add(x);
        }
        return Collections.max(list);
    }
}
