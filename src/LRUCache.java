import java.util.*;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final Deque<Integer> usageOrder;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.usageOrder = new LinkedList<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        usageOrder.remove(key);
        usageOrder.addFirst(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            usageOrder.remove(key);
        } else if (cache.size() >= capacity) {
            int leastUsed = usageOrder.removeLast();
            cache.remove(leastUsed);
        }
        usageOrder.addFirst(key);
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1)); // 1
        lru.put(3, 3); // Удаляет ключ 2
        System.out.println(lru.get(2)); // -1
        lru.put(4, 4); // Удаляет ключ 1
        System.out.println(lru.get(1)); // -1
        System.out.println(lru.get(3)); // 3
        System.out.println(lru.get(4)); // 4
    }
}
