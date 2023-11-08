package exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public final class App {

    public static boolean scrabble(String someVars, String text) {
        List<String> arrVars = new ArrayList<>(Arrays.asList(someVars.toLowerCase().split("")));
        List<String> expect = new ArrayList<>(Arrays.asList(text.toLowerCase().split("")));
        List<String> result = new ArrayList<>(App.intersection(expect,arrVars));
        return String.join("", result).equalsIgnoreCase(text);
    }


    public static <T> List<T> intersection(List<T> list1, List<T> list2){

        List<T> list = new ArrayList<T>();
        for (T t : list1) {
            if (list2.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }
}
//END
