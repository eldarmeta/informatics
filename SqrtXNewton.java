public class SqrtXNewton {
    /**
     * LeetCode 69. Sqrt(x) — Newton's Method (Integer)
     * Iteratively refines r ≈ sqrt(x) using r = (r + x/r)/2 until r*r <= x.
     * Time: ~O(log x) iterations (very fast), Space: O(1)
     */
    public int mySqrt(int x) {
        if (x < 2) return x;
        long r = x; // use long to avoid overflow in r*r
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }

    // Quick manual test
    public static void main(String[] args) {
        SqrtXNewton solver = new SqrtXNewton();
        int[] tests = {0, 1, 2, 3, 4, 8, 9, 15, 16, 2147395599};
        for (int x : tests) {
            System.out.printf("mySqrt(%d) = %d%n", x, solver.mySqrt(x));
        }
    }
}
