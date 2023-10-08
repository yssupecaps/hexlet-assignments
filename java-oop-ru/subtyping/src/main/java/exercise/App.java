package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {

    public static void swapKeyValue(KeyValueStorage map) {
        Map<String, String> data = map.toMap();
        Set<Entry<String, String>> entries = data.entrySet();
        entries.forEach(entry -> map.unset(entry.getKey()));
        entries.forEach(entry -> map.set(entry.getValue(), entry.getKey()));
    }

}