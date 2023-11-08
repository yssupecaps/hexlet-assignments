package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public final class App {
    public static Map getWordCount(String words) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = words.trim().split(" ");
        for (String index : arr) {
            if (index.isEmpty()) {
                continue;
            }
            if (map.containsKey(index)) {
                map.put(index, map.get(index) + 1);
            } else {
                map.put(index, 1);
            }
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        String result = "{\n";
        for (Map.Entry<String, Integer> values : map.entrySet()) {
            result = result + "  " + values.getKey() + ": " + values.getValue() +"\n";
        }
        result = result + "}";
        System.out.println(result);
        if(map.isEmpty()){
            return "{}";
        }
        return result;
    }
}
//END
