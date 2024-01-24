package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        var actual1 = App.take(numbers1, 4);
        var expected1 = List.of(1,2,3,4);
        assertThat(actual1).isEqualTo(expected1);

        var result2 = App.take(numbers1, -1);
        var expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertThat(result2).isNotEqualTo(expected2);

        var result3 = App.take(numbers1, 2);
        var expected3 = new ArrayList<>(Arrays.asList(1, 2));
         assertThat(result3).isEqualTo(expected3);
        // END
    }
}
