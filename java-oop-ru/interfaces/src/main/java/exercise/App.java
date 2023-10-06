package exercise;

import java.util.List;

// BEGIN
class App {

    public static List<String> buildApartmentsList(List<Home> home, int count) {
        return home.stream()
                .limit(count)
                .sorted(Home::compareTo)
                .map(Home::toString)
                .toList();
    }
}

// END
