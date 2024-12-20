import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        // Using Streams to convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
