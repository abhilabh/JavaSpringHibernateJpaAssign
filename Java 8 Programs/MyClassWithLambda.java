interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    public static void main(String[] args) {
        WordCount wordCount = str -> str.split("\\s+").length;
        String input = "Wipro is the leading strategic IT partner for companies across India";
        int count = wordCount.count(input);
        System.out.println("Word count: " + count);
    }
}
