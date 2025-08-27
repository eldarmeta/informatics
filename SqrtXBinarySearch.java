public class SqrtXBinarySearch {
    /**
     * LeetCode 69. Sqrt(x) — Binary Search
     * Returns floor(sqrt(x)).
     * Time: O(log x), Space: O(1)
     */
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1;
        int right = x / 2; // sqrt(x) <= x/2 for x >= 4
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Avoid mid * mid overflow by using division
            int div = x / mid;
            if (mid == div) {
                return mid;
            } else if (mid < div) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // right will be the integer part of sqrt(x)
        return right;
    }

    // Quick manual test
    public static void main(String[] args) {
        SqrtXBinarySearch solver = new SqrtXBinarySearch();
        int[] tests = {0, 1, 2, 3, 4, 8, 9, 15, 16, 2147395599};
        for (int x : tests) {
            System.out.printf("mySqrt(%d) = %d%n", x, solver.mySqrt(x));
        }
    }
}
