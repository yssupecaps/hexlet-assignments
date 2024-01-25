package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static final String RUDIMENT_ENV_NAME = "X_FORWARDED_";

    public static String getForwardedVariables(String someStr) {
        return Arrays.stream(someStr.split("\n"))
                .filter(s -> s.startsWith("environment"))
                .map(s -> s.replaceAll("environment=", ""))
                .map(s -> s.replaceAll("\"", ""))
                .map(s -> s.replaceAll(",", " "))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .map(String::trim)
                .collect(Collectors.joining(","));
    }
}
//END
