package java.util;

/**
 * Author: caoleii
 * Date: 2024/9/6 8:33
 * FileName: LRUCache
 * Description: LRU算法
 */

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private final int CHCHE_SIZE;

    public LRUCache(int chcheSize) {
        super((int) (Math.ceil(chcheSize/0.75) + 1),0.75f,true);
        CHCHE_SIZE = chcheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // 如果当前缓存的大小超过了设定的 CHCHE_SIZE，则返回 true，表示需要移除最老的条目；否则返回 false，表示不需要移除。
        return size() > CHCHE_SIZE;
    }
}
