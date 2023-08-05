import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SplitStringWithJavaScript {
    public static void main(String[] args) {
        String inputString = "Wipro is the leading strategic IT partner for companies across India";

        // JavaScript code to split the string
        String jsCode = "var parts = str.split(' '); parts;";

        // Create the Nashorn JavaScript engine
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            // Set the input string as a JavaScript variable
            engine.put("str", inputString);

            // Execute the JavaScript code and get the result
            Object result = engine.eval(jsCode);

            // Display the result
            if (result instanceof String[]) {
                String[] parts = (String[]) result;
                System.out.println("Split parts:");
                for (String part : parts) {
                    System.out.println(part);
                }
            } else {
                System.out.println("Error: Unable to split the string.");
            }
        } catch (ScriptException e) {
            System.out.println("Error executing JavaScript code: " + e.getMessage());
        }
    }
}