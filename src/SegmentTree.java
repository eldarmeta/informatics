import java.util.*;

public class SegmentTree {
    private int[] tree;
    private int n;

    public SegmentTree(int[] nums) {
        n = nums.length;
        tree = new int[2 * n];
        build(nums);
    }

    private void build(int[] nums) {
        // Копируем элементы в листья дерева
        for (int i = 0; i < n; i++) {
            tree[n + i] = nums[i];
        }
        // Строим дерево снизу вверх
        for (int i = n - 1; i > 0; --i) {
            tree[i] = tree[2 * i] + tree[2 * i + 1];
        }
    }

    // Обновление значения по индексу
    public void update(int index, int value) {
        index += n;
        tree[index] = value;
        while (index > 1) {
            index /= 2;
            tree[index] = tree[2 * index] + tree[2 * index + 1];
        }
    }

    // Сумма значений от [left, right)
    public int sumRange(int left, int right) {
        int sum = 0;
        left += n;
        right += n;
        while (left < right) {
            if ((left & 1) == 1) {
                sum += tree[left++];
            }
            if ((right & 1) == 1) {
                sum += tree[--right];
            }
            left /= 2;
            right /= 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        SegmentTree segTree = new SegmentTree(nums);

        System.out.println("Sum from index 1 to 5: " + segTree.sumRange(1, 5)); // 3+5+7+9 = 24

        segTree.update(1, 10); // nums[1] = 10

        System.out.println("After update, sum from index 1 to 5: " + segTree.sumRange(1, 5)); // 10+5+7+9 = 31
    }
}
