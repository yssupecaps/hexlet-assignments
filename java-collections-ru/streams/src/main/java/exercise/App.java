package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static final List<String> FREE_DOMAINS = List.of("gmail.com", "yandex.ru", "hotmail.com");

    public static Long getCountOfFreeEmails(List<String> list) {
            return list.stream()
                    .map(email -> email.split("@")[1])
                    .filter(email -> FREE_DOMAINS.contains(email))
                    .count();
    }
}
// END
