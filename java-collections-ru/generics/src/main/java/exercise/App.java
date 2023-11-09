package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN

public final class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String, String> map) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> books : list) {
            for (Map.Entry<String, String> values : map.entrySet()) {
                if (books.containsKey(values.getKey()) && books.containsValue(values.getValue())) {
                    if (!result.contains(books)) {
                        result.add(books);
                    }
                } else {
                    result.remove(books);
                    break;
                }
            }
        }
        return result;
    }

}
//END
