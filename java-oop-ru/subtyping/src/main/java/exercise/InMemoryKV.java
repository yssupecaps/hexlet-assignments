package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN

public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> memoryMap = new HashMap<>();

    public InMemoryKV(Map<String, String> map) {
        this.memoryMap.putAll(map);
    }

    @Override
    public void set(String key, String value) {
        memoryMap.put(key, value);
    }

    @Override
    public void unset(String key) {
        memoryMap.remove(key);
    }

    @Override
    public String get(String key, String Value) {
        return memoryMap.getOrDefault(key, Value);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(memoryMap);
    }
}
// END
