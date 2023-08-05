

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringListOperationsWithPredicate {
    public static void main(String[] args) {
        // Create a list of string objects
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "Angular2", "Java8", "", "Angular JS", "", "Java script", "C", "C++", "Java", "Angular 4"
        ));

        // Find and delete empty strings from the list using Predicate
        Predicate<String> isEmptyString = String::isEmpty;
        stringList.removeIf(isEmptyString);

        // Display the list after removing empty strings
        System.out.println("List after removing empty strings:");
        System.out.println(stringList);

        // Find strings ending with a digit and store them into a new list using Predicate
        Predicate<String> endsWithDigit = s -> s.matches(".*\\d$");
        List<String> endingWithDigitList = stringList.stream()
                .filter(endsWithDigit)
                .collect(Collectors.toList());

        // Display the new list with strings ending with a digit
        System.out.println("Strings ending with a digit:");
        System.out.println(endingWithDigitList);
    }
}

