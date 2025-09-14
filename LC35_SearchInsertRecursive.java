public class LC35_SearchInsertRecursive {
    public static int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private static int helper(int[] nums, int target, int left, int right) {
        if (left > right) return left;
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] < target) return helper(nums, target, mid + 1, right);
        return helper(nums, target, left, mid - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        System.out.println(searchInsert(a, 5));
        System.out.println(searchInsert(a, 2));
        System.out.println(searchInsert(a, 7));
        System.out.println(searchInsert(a, 0));
    }
}