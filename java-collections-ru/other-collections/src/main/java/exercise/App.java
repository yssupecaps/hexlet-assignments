package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {

    public static final List<String> list = List.of("added", "deleted", "changed", "unchanged");

    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {

        Map<String, String> result;

        result = map1.entrySet().stream()
                .filter(e -> !map2.containsKey(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "deleted"));

        result.putAll(map2.entrySet().stream()
                .filter(e -> !map1.containsKey(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "added")));

        result.putAll(map1.entrySet().stream()
                .filter(e -> map2.containsKey(e.getKey()))
                .filter(e -> map2.get(e.getKey()).equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "unchanged")));

        result.putAll(map1.entrySet().stream()
                .filter(e -> map2.containsKey(e.getKey()))
                .filter(e -> !map2.get(e.getKey()).equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "changed")));

        return result;
    }
}

//END
