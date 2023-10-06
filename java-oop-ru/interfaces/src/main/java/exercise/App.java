package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App{

    public static List<String> buildApartmentsList(List<Home> home, int count){
        List<String> output = new ArrayList<>(count);
        for (Home car : home) {
            output.add(car.toString());
        }
        return output;
    }
}
// END
