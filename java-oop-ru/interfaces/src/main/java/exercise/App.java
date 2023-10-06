package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {

    public static List<String> buildApartmentsList(List<Home> home, int count) {
        return home.stream()
                .limit(count)
                .sorted(Home::compareTo)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}

// END
