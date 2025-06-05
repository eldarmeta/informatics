import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Длина: " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);  // добавляем все элементы в HashSet
        }

        int maxLength = 0;

        for (int num : set) {
            // начинаем новую последовательность, только если это начало
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
