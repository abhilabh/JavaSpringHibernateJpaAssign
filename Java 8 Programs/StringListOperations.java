import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListOperations {
    public static void main(String[] args) {
        // Create a list of string objects
        List<String> stringList = Arrays.asList(
                "Rest", "", "", "Run", "work", "", "Great", "StreamApi", "filter"
        );

        // Count the number of strings whose length is greater than 5
        long countLongStrings = stringList.stream()
                .filter(s -> s.length() > 5)
                .count();

        System.out.println("Number of strings with length > 5: " + countLongStrings);

        // Count the number of empty strings
        long countEmptyStrings = stringList.stream()
                .filter(String::isEmpty)
                .count();

        System.out.println("Number of empty strings: " + countEmptyStrings);

        // Filter empty strings and store to new List
        List<String> emptyStringsList = stringList.stream()
                .filter(str -> str.length() > 0)
                .collect(Collectors.toList());

        System.out.println("Empty strings: " + emptyStringsList);
    }
}