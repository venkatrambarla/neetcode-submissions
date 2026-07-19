class LRUCache {


    LinkedHashMap<Integer, Integer> cache;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cap;
            }
        };
    }
    
    public int get(int key) {
       return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);

    }
}

