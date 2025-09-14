public class LC69_SqrtRecursive {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        return helper(1, x / 2, x);
    }

    private static int helper(int left, int right, int x) {
        if (left > right) return right;
        int mid = left + (right - left) / 2;
        long square = (long) mid * mid;
        if (square == x) return mid;
        if (square < x) return helper(mid + 1, right, x);
        return helper(left, mid - 1, x);
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }
}