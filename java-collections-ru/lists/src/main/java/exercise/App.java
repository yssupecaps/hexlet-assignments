package exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public final class App {

    public static boolean scrabble(String someVars, String text) {
        ArrayList<String> arrVars = new ArrayList<>(Arrays.asList(someVars.toLowerCase().split("")));
        ArrayList<String> expect = new ArrayList<>(Arrays.asList(text.toLowerCase().split("")));
        List<String> result = new ArrayList<>();

        for (String k : expect) {
            if (arrVars.contains(k)) {
                arrVars.remove(k);
                result.add(k);
            }
        }
        return expect.equals(result);
    }

}
//END
