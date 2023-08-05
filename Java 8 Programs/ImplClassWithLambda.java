interface CharacterOccurrence {
    int findOccurrence(String str, char c);
}

public class ImplClassWithLambda {
    public static void main(String[] args) {
        String str = "How was your day today?";
        char c = 'a';

        CharacterOccurrence characterOccurrence = (s, ch) -> {
            int count = 0;
            for (char currentChar : s.toCharArray()) {
                if (currentChar == ch) {
                    count++;
                }
            }
            return count;
        };

        // Invoke the findOccurrence method and display the result
        int occurrence = characterOccurrence.findOccurrence(str, c);
        System.out.println("The number of occurrences of '" + c + "' in the string is: " + occurrence);
    }
}
